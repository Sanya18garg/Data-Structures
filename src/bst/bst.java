package bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;






public class bst {

	class Node
	{
		int data;
		Node right;
		Node left;
		
	}
	Node root;
	public void insert(int item)
	{
		Node p=new Node();
		p.data=item;
		if(root==null)
		{
			root=p;
		}
		else
		{
			Node parent=null;
			Node t=this.root;
			while(t!=null)
			{
				parent=t;
				if(t.data<p.data)
				{
					t=t.right;
				}
				else
				{
					t=t.left;
				}
			}
			if(parent.data>p.data)
			{
				parent.left=p;
			}
			else
			{
				parent.right=p;
			}
		}
		
	}
	class S
	{
		int sum=0; 
	}
	public void addgreatervalues()
	{
		S s=new S();
		add(this.root,s);
	}
	private void add(Node node,S s)
	{
		if(node==null)
		{
			return ;
		}
		add(node.right,s);
		s.sum=s.sum+node.data;
		node.data=s.sum;
		add(node.left,s);
	}
	public int predeccessor(int x)
	{
		 return predeccessor(this.root,x);
	}
	private int predeccessor(Node node,int x)
	{
		ArrayList<Integer> a=new ArrayList();
		inorder1(node,a);
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)==x)
			{
				if(a.get(i)==a.get(a.size()-1))
				{
					//System.out.print("does not exist");
					//break;
					return 0;
				}
				else
				{
				//System.out.print( a.get(i-1));
				//break;
					return a.get(i+1);
			}
			}
		}
		return 0;
		
		
	}
	private void inorder1(Node node,ArrayList<Integer> a)
	{
		if(node==null)
		{
			return ;
		}
		inorder1(node.left,a);
		a.add(node.data);
		inorder1(node.right,a);
	}
	class C
	{
		int count=0;
	}
	public void kthlargest(int k)
	{
		C c=new C();
		kth(this.root,k,c);
	}
	private void kth(Node node,int k,C c)
	{
		if(node==null||c.count>=k)
		{
			return ;
		}
		kth(node.right,k,c);
		c.count++;
		if(c.count==k)
		{
			System.out.print(node.data);
			return ;
		}
		kth(node.left,k,c);
	}
	public void kthsmallest(int k)
	{
		C c=new C();
		kth1(this.root,k,c);
	}
	private void kth1(Node node,int k,C c)
	{
		if(node==null)
		{
			return ;
		}
		
		kth(node.left,k,c);
		
		c.count++;
		if(c.count==k)
		{
			System.out.print(node.data);
			return ;
		}
	
		kth(node.right,k,c);
		
	}
	public void paireqtosum(int sum)
	{
		Queue<Integer> q=new LinkedList();
		p(this.root,sum,q);
	}
	public void p(Node node,int sum,Queue<Integer> q)
	{
		if(node==null)
		{
			return ;
		}
		q.add(node.data);
		int y=sum-node.data;
		if(q.contains(y))
		{
			System.out.println(node.data+","+y);
		}
		p(node.left,sum,q);
		p(node.right,sum,q);		
	}
	class l
	{
		int count=0;
	}
	public void countpair(int sum)
	{
		Queue<Integer> q=new LinkedList();
		l c=new l();
		  p1(this.root,sum,q,c);
		 System.out.print(c.count);
		
	}
	public void  p1(Node node,int sum,Queue<Integer> q,l c)
	{
		if(node==null)
		{
			return ;
		}
		q.add(node.data);
		int y=sum-node.data;
		if(q.contains(y))
		{
			c.count++;
			//System.out.println(node.data+","+y);
		}
		p1(node.left,sum,q,c);
		p1(node.right,sum,q,c);
		
		
	}
	
	public int distancefromroot(int x)
	{
	return	distance(this.root,x,0);
	}
	public int distancefromroot(Node node,int x)
	{
		if(node.data==x)
		{
			return 0;
		}
		if(x<node.data)
		{
			return 1+distancefromroot(node.left,x);
		}
		return 1+distancefromroot(node.right,x);
	}
	public int distance(Node node,int x,int level)
	{
		if(node==null)
		{
			return 0;
		}
		if(node.data==x)
		{
			return level;
		}
		else if(node.data>x)
		{
			return distance(node.left,x,level+1);
		}
		else
		{
			return distance(node.right,x,level+1);
		}
	}
	class h
	{
		int level=0;
	}
void checkallleavesnodesatsamelevel()
{
	h g=new h();
	int a[]=new int[1000];
	check(this.root,a,g);
	int flag=0;
	for(int i=0;i<g.level-1;i++)
	{
		//System.out.print(a[i]);
		if(a[i]==a[i+1])
		{
			flag=1;
		}
		else
		{
			flag=0;
			break;
		}
	}
	
	if(flag==1)
 	{
		System.out.print("valid");
	
	}
	else
	{
		System.out.print("not valid");
	}
	
}
	void check(Node node,int a[],h g)
	{
		if(node==null)
		{
			return ;
		}
		if(node.left==null&&node.right==null)
		{
			//System.out.print(node.data);
			int y=distancefromroot(node.data);
			//System.out.print(y);
			a[g.level]=y;
			g.level++;
		}
		check(node.left,a,g);
		check(node.right,a,g);
	}
	public void preorder(Node node,ArrayList<Integer> a)
	{
		if(node==null)
		{
			return ;
		}
		a.add(node.data);
		preorder(node.left,a);
		preorder(node.right,a);
		
		
	}
	public int checktriplet()
	{
		return checktriplet(this.root);
	}
	public int checktriplet(Node node)
	{
		int sum=0;
		int l=0;
		ArrayList<Integer> a=new ArrayList();
		preorder(node,a);
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				int p=a.get(i)+a.get(j);
				sum=0-p;
				if(a.contains(sum))
				{
				l=1;
				break;
				}
			}
		}
		if(l==1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public int distancebtnnodes(int x,int y)
	{
		return distancebtnnodes(this.root,x,y);
	}
	private int distancebtnnodes(Node node,int x,int y)
	{
		if(node==null)
		{
			return 0;
		}
		if(x<node.data&&y<node.data)
		{
			return distancebtnnodes(node.left,x,y);
		}
		 if(x>node.data&&y>node.data)
		{
			return distancebtnnodes(node.right,x,y);
		}
	 if(node.data>=x&&node.data<=y)
		{
			return distancefromroot(x)+ distancefromroot(y);
		}
		
		return 0;
	}
	
	public int ceil(int key)
	{
		return ceil(this.root,key);
	}
	private int ceil(Node node,int key)
	{
		if(node==null)
		{
			return -1;
		}
		if(node.data==key)
		{
			return node.data;
		}
		if(node.data<key)
		{
			return ceil(node.right,key);
		}
		int c=ceil(node.left,key);
		return (c>=key) ? c :node.data;
	}
	public int floor(int x)
	{
		return floor(this.root,x);
	}
	private int floor(Node node,int x)
	{
		if(node==null)
		{
			return Integer.MAX_VALUE;
		}
		if(node.data>x)
		{
			return floor(node.left,x);
		}
		int f=floor(node.right,x);
		return (f<=x) ? f : node.data;
	}
	public void printleaf()
	{
	 this.printleaf(this.root);
	}
	private void printleaf(Node node)
	{
		if(node==null)
		{
			return ;
		}
		if(node.left==null&&node.right==null)
		{
		System.out.print(node.data+" ");
		}
		printleaf(node.left);
		printleaf(node.right);
		
	}
	void roottoleafpathsum()
	{
		sum(this.root,0);
	}
	public void sum(Node node,int sum)
	{
		if(node==null)
		{
			return ;
		}
		sum=sum+node.data;
		if(node.left==null&&node.right==null)
		{
			System.out.print(sum+" ");
		}
		sum(node.left,sum);
		sum(node.right,sum);
	}
	public int sum1()
	{
		return sum1(this.root);
	}
	int sum1(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		return sum1(node.left)+node.data+sum1(node.right);
	}
	public void printnonleaf()
	{
		print(this.root);
	}
	private void print(Node node)
	{
		if(node==null)
		{
			return;
		}
		if(node.left!=null&&node.right!=null)
		{
			System.out.print(node.data+" ");	
		}
		print(node.left);
		print(node.right);
	//System.out.print(node.data+" ");	
	}
	public void parent1(int item)
	{
		p(this.root,item);
	}
	void p(Node node,int item)
	{
		if(node==null)
		{
			return ;
		}
		if(node.left.data==item||node.right.data==item)
		{
			System.out.print(node.data);
		}
		if(item>node.data)
		{
			p(node.right,item);
		}
		else
		{
			p(node.left,item);
		}
	}
int countnonleaf()
{
	return count(this.root);
}
int count(Node node)
{
	if(node==null)
	{
		return 0;
	}
	if(node.left!=null&&node.right!=null)
	{
		return 1;
		//System.out.print(node.data+" ");	
	}
	int y=count(node.left);
	int y1=count(node.right);
	return y+y1;
}
	public int max()
	{
		return this.max(this.root);
	}
	private int max(Node node)
	{
		if(node.right==null)
		{
			return node.data;
		}
		return max(node.right);
	}
	public static Node findMaximum(Node node) {
		while (node.right != null) {
			node = node.right;
		}

		return node;
	}
	public Node presuccessor(int key)
	{
		return  presuccessor(this.root,key,null);
	}
	
	private int presuccessor(Node node,int key,int prec)
	{
		if(node==null)
		{
			return prec;
		}
		if(node.data==key)
		{
			if(node.left!=null)
			{
				return max();
			}
		}
		else if(key<node.data)
		{
		return presuccessor(node.left,key,prec);
		}
		else
		{
			prec=node;
			return presuccessor(node.right,key,prec);
		}
		return prec;
	}
	public void parent(int item)
	{
	this.parent(this.root,item);
	}
	private void parent(Node node,int item)
	{
		if(node==null)
		{
			return ;
		}
		if(node.left!=null&&node.right!=null)
		{
			if(node.left.data==item||node.right.data==item)
			{
				System.out.print(node.data);		}
		}
		parent(node.left,item);
		parent(node.right,item);
	}
	
	public int height()
	{
		return this.height(this.root);
	}
	public int height(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		int lheight=this.height(node.left);
		int rheight=this.height(node.right);
		int max=Math.max(lheight, rheight)+1;
		return max; 
	}
	public void calculateLevelSum()
	{
		int level=this.height();
		
		int sum[]=new int[level];
		this.calculateLevelSum(this.root, 0, sum);
		 for(int i=0;i<level;i++)
			{
				System.out.print(sum[i]+" ");
			}
		 int a=0;
		 for(int i=0;i<level;i++)
		 {
			 a=a+sum[i];
			 
		 }
		 System.out.print(a);
		    
		
	}
	 private void calculateLevelSum(Node node, int level, int sum[])  
	{  
	    if (node == null)  
	        return;  
	  
	    // Add current node data to the sum  
	    // of the current node's level  
	    sum[level] += node.data;  
	  
	    // Recursive call for left and right sub-tree  
	    calculateLevelSum(node.left, level + 1, sum);  
	    calculateLevelSum(node.right, level + 1, sum);  
	   
	}  
	 public void level()
	 {
		 LinkedList<Node> l=new LinkedList();
		 l.addLast(this.root);
		 while(!l.isEmpty())
		 {
			 Node rv=l.removeFirst();
			 System.out.print(rv.data+" ");
			 if(rv.left!=null)
				 
			 {
				 l.addLast(rv.left);
			 }
			 if(rv.right!=null)
			 {
				 l.addLast(rv.right);
			 }
		 }
	 }
	 public int min()
	 {
		 return min(this.root);
	 }
	 private int min(Node node)
	 {
		 if(node.left==null)
		 {
			 return node.data;
		 }
		 return min(node.left);
	 }
	 public boolean siblings(int n1,int n2)
	 {
		 return this.siblings(this.root,n1, n2);
	 }
	 private boolean siblings(Node node,int n1,int n2)
	 {
		int left=0;
		int right=0;
		boolean p=false;
		
		boolean s=false;
		if(node==null)
		{
			return false;
		}
		if(node.left!=null&&node.right!=null)
		{
			left=node.left.data;
			right=node.right.data;
			if((left==n1&&right==n2)||(left==n2&&right==n1))
			{
				return true;
			}
		}
		if(node.left!=null)
		{
			p=siblings(node.left,n1,n2);
			if(p==true)
			{
				return true;
			}
			
		}
		if(node.right!=null)
		{
			s=siblings(node.right,n1,n2);
			if(s==true)
			{
				return true;
			}
			
		}
		return false;
		
	 }
	
	public void levelorder()
	{
		Queue<Node> queue=new LinkedList();
		queue.add(this.root);
		
		while(!queue.isEmpty())
		{
			Node rv=queue.peek();
			queue.remove();
			
			boolean b=false;
			if(rv.left!=null)
			{
				b=true;
				queue.add(rv.left);
			}
			if(rv.right!=null)
			{
				b=true;
				queue.add(rv.right);
			}
			if(b==true)
			{
			
				System.out.print(rv.data+" ");
			}
		}
	}
	public int lowestcommonances(int n1,int n2)
	{
		return lowestcommonances(this.root,n1,n2);
	}
	private int lowestcommonances(Node node,int n1,int n2)
	{
		 if (node == null) 
	            return 0; 
	   
	        // If both n1 and n2 are smaller than root, then LCA lies in left 
	        if (node.data > n1 && node.data > n2) 
	            return lowestcommonances(node.left, n1, n2); 
	   
	        // If both n1 and n2 are greater than root, then LCA lies in right 
	        if (node.data < n1 && node.data < n2)  
	            return lowestcommonances(node.right, n1, n2); 
	   
	        return node.data;
		
	}
	int search(int in[],int start,int end,int value)
	{
		int i;
		for( i=start;i<=end;i++)
		{
			if(in[i]==value)
			{
				return i;
			}
		}
		return i;
	}
	Node printtreefrompreorderndinorder(int pre[],int in[])
	{
	return printtreefrompreorderndinorder( pre, in,0,in.length-1);	
	}
	Node printtreefrompreorderndinorder(int pre[],int in[],int start,int end)
	{
		int preindex=0;
		if(start>end)
		{
			return null;
		}
		
		Node t=new Node();
		t.data=pre[preindex++];
		t.left=null;
		t.right=null;
		if(start==end)
		{
			return t;
		}
		int inindex=search(in,start,end,t.data);
		t.left=printtreefrompreorderndinorder(pre,in,start,inindex-1);
		t.right=printtreefrompreorderndinorder(pre,in,inindex+1,end);
		return t;
	}
		public void inorder()
		{
		inorder(this.root);
	}
	private void inorder(Node node)
	{
		if(node==null)
		{
			return ;
		}
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	int level1(Node node,int a,int lev)
	{
		if(node==null)
		{
			return 0;
		}
		if(node.data==a)
		{
			return lev;
		}
		int l=level1(node.left,a,lev+1);
		if(l!=0)
		{
			return l;
		}
		return level1(node.right,a,lev+1);
		
	}
	int size()
	{
		return size(this.root);
		
	}
	int size(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		int r=size(node.left);
		int s=size(node.right);
		return r+s+1;
	}
	public boolean cousin(int a,int b)
	{
		return cousin(this.root,a,b);
	}
	boolean cousin(Node node,int a,int  b)
	{
		return ((level1(node,a,1)==level1(node,b,1))&&(!sibling(node,a,b)));
	}
	int level1(int a)
	{
		return level1(this.root,a,1);
	}
	boolean sibling(Node node,int a,int b)
	{
		if(node==null)
		{
			return false;
		}
		 return ((node.left.data == a && node.right.data == b) || 
	                (node.left.data == b && node.right.data == a) || 
	                sibling(node.left, a, b) || 
	                sibling(node.right, a, b));
				
			
				
	}
	
	public void preorder()
	{
		preorder(this.root);
	}
	private void preorder(Node node1)
	{
		if(node1==null)
		{
			return;
		}
		System.out.print(node1.data+" ");
		preorder(node1.left);
		preorder(node1.right);
	}
}
