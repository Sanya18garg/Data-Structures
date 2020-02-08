package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class bst {
private class Node
{
	int data;
	Node left;
	Node right;
}
private Node root;
public bst(int []arr)
{
	this.root=construct(arr,0,arr.length-1);

}
public Node construct(int []arr,int lo,int hi)
{
	if(lo>hi)
	{
		return null;
	}
	int mid=(lo+hi)/2;
	Node nn=new Node();
	nn.data=arr[mid];
	nn.left=construct(arr,lo,mid-1);
			nn.right=construct(arr,mid+1,hi);
			return nn;
}
public void display()
{
	this.display(this.root);
}
private void display(Node node)
{
	if(node==null)
	{
		return;
	}
	String str="";
	if(node.left==null)
	{
		str=str+".";
	}
	else
	{
		str=str+node.left.data;
	}
	str+="=>"+node.data+"<=";
	if(node.right==null)
	{
		str=str+".";
	}
	else
	{
		str=str+node.right.data;
	}
	System.out.println(str);
	display(node.left);
	display(node.right);
	
}

public boolean find(int item)
{
	return find(this.root,item);
}
private boolean find(Node node,int item)
{
	if(node==null)
	{
		return false;
	}
	if(item>node.data)
	{
		return find(node.right,item);
	}
	else if (item<node.data)
	{
		return find(node.left,item);
	}
	else
	{
		return true;
	}
}
public int sumleaf()
{
	return this.sumleaf(this.root);
}
private int sumleaf(Node node)
{
	if(node==null)
	{
		return 0;
	}
	if(node.left==null&&node.right==null)
	{
		return node.data;
	}
	int lsum=sumleaf(node.left);
	int rsum=sumleaf(node.right);
	return lsum+rsum;
}
public int sumnonleaf()
{
	return this.sumnonleaf(this.root);
}
private int sumnonleaf(Node node)
{
	if(node==null)
	{
		return 0;
	}
	if(node.left==null&&node.right==null)
	{
		return 0;
	}
	int lsum=sumnonleaf(node.left);
	int rsum=sumnonleaf(node.right);
	return node.data+lsum+rsum;
}
public int countleaf()
{
	return this.countleaf(this.root);
}
private int countleaf(Node node)
{
	if(node==null)
	{
		return 0;
	}
	if(node.left==null&&node.right==null)
	{
		return 1;
	}
	int lsum=countleaf(node.left);
	int rsum=countleaf(node.right);
	return lsum+rsum;
}
public int countnonleaf()
{
	return this.countnonleaf(this.root);
}
private int countnonleaf(Node node)
{
	if(node==null)
	{
		return 0;
	}
	if(node.left==null&&node.right==null)
	{
		return 0;
	}
	int lsum=countnonleaf(node.left);
	int rsum=countnonleaf(node.right);
	return 1+lsum+rsum;
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
public void printnonleaf()
{
 this.print(this.root);
}
private void printnonleaf(Node node)
{
	if(node==null)
	{
		return;
	}
	if(node.left==null&&node.right==null)
	{
		return;
	}
	printnonleaf(node.left);
	printnonleaf(node.right);
System.out.print(node.data+" ");	
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
public int max()
{
	return max(this.root);
}

private int max(Node node)
{
	if(node.right==null)
	{
		return node.data;
	}
	return max(node.right);
}
public int findparent(int item)
{
	return this.findparent(this.root,item);
}
private int findparent(Node node,int item)
{
	if(node==null)
	{
		return 0;
	}
	if(item>node.data)
	{
		return findparent(node.right,item);
	}
	if(item<node.data)
	{
		return findparent(node.left,item);
	}
	return node.data;
}
public void add(int item)
{
	add(this.root,item);
}
private void add(Node node,int item)
{
	if(item>node.data)
	{
		if(node.right==null)
		{
			Node nn=new Node();
			nn.data=item;
			node.right=nn;
			
		}
		else
		{
			add(node.right,item);
		}
		
	}
	else
	{

		if(node.left==null)
		{
			Node nn=new Node();
			nn.data=item;
			node.left=nn;
			
		}
		else
		{
			add(node.left,item);
		}
	}
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
public boolean isbtabst()
{
	return this.isbtabst(this.root ,Integer.MIN_VALUE,Integer.MAX_VALUE);
}
private boolean isbtabst(Node node,int min,int max)
{
	if(node==null)
	{
		return true;
	}
	if(node.data>max||node.data<min)
	{
		return false;
	}
	else if(!(this.isbtabst(node.left,min,node.data))){
		return false;
	}
	else if(!(this.isbtabst(node.right,node.data,max))){
		return false;
	}
			return true;

	
}
class Count
{
	int count=0; 
}

	public void print2small()
	{
		Count c=new Count();
		print2small(this.root,c);
	}
	private void print2small(Node node ,Count c)
	{
		
		if(node==null&&c.count>=3)
		{
			return ;
		}
		if(node.left!=null)
		{
		print2small(node.left,c);
		}
		c.count++;
		if(c.count==3)
		{
		System.out.print(node.data+" ");
		return;
		}
		if(node.right!=null)
		{
		print2small(node.right,c);
	}
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


}
