package limkedlist2;
import java.util.*;
public class linkedlist
{
	private class Node
	{
		int data;
		Node next;
		
		
	}
	private Node head;
	private  Node tail;
	private  int size;
	linkedlist y;
	

public void addlast(int item)
{
Node p=new Node();
p.data=item;
p.next=null;
if(this.size>=1)
{
	this.tail.next=p;
}
if(size==0)
{
	this.head=p;
	this.tail=p;
	this.size++;
	
}
else
{
	this.tail=p;
	this.size++;       
}
}
public void sort()throws Exception
{
	if(this.size==0)
	{
		throw new Exception("ll is empty");
	}
	Node current=head;
	Node index=null;
	while(current!=null)
	{
	index=current.next;
	int temp;
	while(index!=null)
	{
		if(current.data<index.data)
		{
			temp=current.data;
			current.data=index.data;
			index.data=temp;
		}
		index=index.next;
	}
	current=current.next;
}
}
void minmax()throws Exception
{
	sort();
	int count=0;
	Node temp=this.head;
	while(temp!=null)
	{
		count++;
		temp=temp.next;
	}
	int b=count/2;
	while(b>0)
	{
		
	}
	
}
public void duplicate1()throws Exception
{
	
	Node p=this.head;
	Node prev=null;
	Node ptr=null;
	while(p!=null)
	{
		prev=p;
		ptr=p.next;
	
	while(ptr!=null)
	{
		if(p.data==ptr.data)
		{
			prev.next=ptr.next;
		}
		else
		{
			prev=ptr;
		}
		ptr=ptr.next;
	}
	p=p.next;
	}
}
public void duplicate()throws Exception
{
	//Node p=this.head;

	int left=0;
	Node p=this.head;
	while(left<this.size-2)
	{
			Node ln=getnodeat(left);
			Node rn=ln.next;
				
				if(ln.data==rn.data)
				{
					
					ln.next=rn.next;
					rn.next=null;
				}
				else
				{
					ln.next=rn;
					
				}
				left++;
				p=p.next;
	}			
		
	
}
public void f()throws Exception
{
	//Node l1=this.head;
	int y;
	if(this.size%2==0)
	{
		y=(this.size-1)/2;
	}
	else
	{
		y=this.size/2;
	}
	Node p=getnodeat(y);
Node pm1=getnodeat(y-1);
pm1.next=p.next;
p.next=this.head;
this.head=p;

	
}

public int occur(int y)throws Exception
{
	Node p=this.head;
	int count=0;
	while(p!=null)
	{
		if(p.data==y)
		{
			count++;
		}
		p=p.next;
	}
	return count;
}

public void deleteelement(int k)throws Exception
{
	Node p=this.head;
	int count=1;
		while(p!=null)
	{
			if(p==this.head)
			{
				if(p.data==k)
				{
					this.head=p.next;
					p.next=null;
				}
			}
			else
			{
		if(p.data==k)
		{
			Node ln=getnodeat(count);
			Node rn=getnodeat(count-1);
			rn.next=ln.next;
			ln.next=null;
		}
		count++;
	
	}
			p=p.next;
	}
}

public void add(Node p1)

{
	Node p=this.head;
	Node head2=null; 
	Node p2=new Node();
	p1.next=null;
	//Node p=this.head;
	p=this.head;
	Node head1=null;
	head1=p1;
	//Node head2=null;
	head2=p2;
	while(p!=null||p1!=null)
	{
		p2.data=p.data+p1.data;
		p=p.next;
		p1=p1.next;
		p2=p2.next;
	}
	
			
}
public void evenafterodd()
{
	Node odd = null, oddTail = null;
	Node even = null, evenTail = null;
	Node curr = head;

	while (curr != null)
	{
		if (curr.data %2 != 0) // current node is odd
		{
			// handle head for first odd node
			if (odd == null) {
				odd = oddTail = curr;
			}
			else
			{
				oddTail.next = curr;
				oddTail = curr;
			}
		}
		else // current node is even
		{
			// handle head for first even node
			if (even == null) {
				even = evenTail = curr;
			}
			else
			{
				evenTail.next = curr;
				evenTail = evenTail.next;
			}
		}
		curr = curr.next;
	}
	if (oddTail != null) {
		head=odd;
		oddTail.next=even;
		//oddTail.next = null;
	}
	if (even != null)
	{
		evenTail.next=null;
		//head = even;
		//evenTail.next = odd;
	}

	
}
public void alternateeven()
{
	Node odd = null, oddTail = null;
	Node even = null, evenTail = null;
	Node curr = head;

	while (curr != null)
	{
		if (curr.data %2 != 0) // current node is odd
		{
			// handle head for first odd node
			if (odd == null) {
				odd = oddTail = curr;
			}
			else
			{
				oddTail.next = curr;
				oddTail = curr;
			}
		}
		else // current node is even
		{
			// handle head for first even node
			if (even == null) {
				even = evenTail = curr;
			}
			else
			{
				evenTail.next = curr;
				evenTail = evenTail.next;
			}
		}
		curr = curr.next;
	}
	while(odd!=null&&even!=null)
	{
		Node p=odd.next;
		odd.next=even;
		even.next=p;
		odd=odd.next;
		even=even.next;
	}
}
public void key(int key1)
{
	Node prev=this.head;
	Node ptr=this.head;
	while(ptr!=null)
	{
		if(prev!=ptr&&ptr.data!=key1)
		{
			prev.data=ptr.data;
			ptr.data=key1;
			prev=prev.next;
		}
		if(prev.data!=key1)
		{
			prev=prev.next;
		}
		ptr=ptr.next;
	}
}
public int mid() throws Exception
{
	int count=0;
	Node temp=this.head;
	
	while(temp!=null)
	{
		count++;
		temp=temp.next;
	}
	int mid;
	if(count%2==0)
	{
		mid=(count/2);
	}
	else
	{
		mid=count/2;
	}
	Node r=getnodeat(mid);
	return r.data;
}
public void insert_sort()throws Exception
{
	sort();
	Node p1=this.head;
	Node p=new Node();
	Scanner sc=new Scanner(System.in);
	p.data=sc.nextInt();
	p.next=null;
	int ln=0;
	int rn=1;
	if(p.data<this.head.data)
	{
		p.next=this.head;
		this.head=p;
	}
	else if(p.data>this.tail.data)
	{
		this.tail.next=p;
		this.tail=p;
	}
	else
	{
	while(p1!=null)
	{
	//while(ln<rn)
	//{
		Node left=getnodeat(ln);
		Node right=left.next;
		if(p.data>left.data&&p.data<right.data)
		{
			left.next=p;
			p.next=right;
		}
		ln++;
		//rn++;
		
	//}
	p1=p1.next;
	}
	}
}
public void merge(linkedlist other)throws Exception
{
	Node head1=other.head;
	//Node tail1=other.tail;
	this.tail.next=head1;
	//this.tail=other.tail1;
	sort();
}
public void addfirst(int item)
{
	Node p=new Node();
	p.data=item;
	p.next=null;
	if(size>=1)
	{
		p.next=head;
	}
	if(this.size==0)
	{
		this.head=p;
		this.tail=p;
		this.size++;
	}
	else
	{
		this.head=p;
		this.size++;
	}
}
public int getfirst()throws Exception
{
	if(size==0)
	{
		throw new Exception("ll is empty");
	}
	return this.head.data;
}
public int getlast()throws Exception
{
	if(size==0)
	{
		throw new Exception("ll is empty");
	}
	return this.tail.data;	
}
public int removefirst()throws Exception
{
	if(this.size==0)
	{  
		throw new Exception("ll is empty");
	}
	int rv=this.head.data;
	if(this.size==1)
	{
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	else
		
	{
		this.head=this.head.next;
		this.size--;
	}
	return rv;
}
public Node getnodeat(int index)throws Exception
{
	if(this.size==0)
	{
		throw new Exception("ll is empty");
	}
	if(index<0||index>this.size)
	{
		throw new Exception("invalid index");
	}
	Node temp=this.head;
	for(int i=0;i<index;i++)
	{
		temp=temp.next;
	}
	return temp;
}
public int nthnodefromend(int n) throws Exception
{
	Node l=getnodeat(this.size-n);
	return l.data;
}
public void reverse1(int k)throws Exception
{
	int left=0;
	int right=k-1;
	while(right<this.size)
	{
		Node ln=getnodeat(left);
		Node rn=getnodeat(right);
		//int temp;
		int x=0,y=0;
		while(left<right)
		{
			int temp=ln.data;
			ln.data=rn.data;
			rn.data=temp;
	 left++;
	right--;
	}
		left=0;
		right=k-1;
		left=left+k;
		right=right+k;
}
}
public int removeat(int index)throws Exception
{
	if(this.size==0)
	{
		throw new Exception("ll is empty");
	}
	if(index<1||index>this.size)
	{
		throw new Exception("invalid index");
	}
	Node nm1=getnodeat(index-1);
	Node n=nm1.next;
	Node np1=n.next;
	int rv=n.data;
	nm1.next=np1;
	this.size--;
	return rv;
	
}
public int last(int value)throws Exception
{
	Node p=this.head;
	int left=this.size-1;
	Node p1=null;
	int y=0;
	while(p!=null)
	{
		Node ln=getnodeat(left);
		if(ln.data!=value)
		{
			left--;
		}
		else
		{
			 y=left;
			break;
		}
		p=p.next;
	}
	return y;
}
public void sum(linkedlist li)throws Exception
{
	reversedata();
	li.reversedata();
	Node temp=new Node();
	int carry=0;
	int k=0;
	Node head1=null;
	if(this.size==li.size)
	{
		Node p=this.head;
		Node p1=li.head;
		while(p!=null&&p1!=null)
		{
			k=p.data+p1.data;
			if(k<10)
			{
				if(carry!=0)
				{
				temp.data=k+carry;
			}
			else
			{
				temp.data=k;
			}
			}
				else
				{
					temp.data=(k%10)+carry;
					carry=k/10;
				}
			if(head1==null)
			{
				head1=temp;
			}
			else
			{
				temp=head1;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=temp;
			}
			p=p.next;
			p1=p1.next;
		}
		Node t=new Node();
		k=p1.data+p1.data;
		if(carry!=0)
		{
			t.data=k+carry;
		}
		else
		{
			t.data=k;
		}
		Node s=head1;
		while(s.next!=null)
		{
			s=s.next;
		}
		s.next=t;
		
	}
	reversedata();
	
}
public void tocheckpalindrome()
{
	Node temp=this.head;
	Node head1=null;
	Node tail1=null;
	int flag=0;
	while(temp!=null)
	{
		Node p=new Node();
		p.data=temp.data;
		p.next=null;
		
		if(head1==null)
		{
			head1=p;
			tail1=p;
		}
		else
		{
			p.next=head1;
			head1=p;
		}
		temp=temp.next;
	}
	Node p1=this.head;
	Node p2=head1;
	while(p1!=null&&p2!=null)
	{
		if(p1.data==p2.data)
		{
			flag=1;
		}
		else
		{
			flag=0;
			break;
		}
		p1=p1.next;
		p2=p2.next;
	}
	if(flag==1)
	{
		System.out.print("true");
	}
	else
	{
		System.out.print("false");
	}
	
}
public void rotate(int k) throws Exception
{
	Node temp=this.head;
	
	Node p=getnodeat(k-1);
	while(temp.next!=null)
	{
		temp=temp.next;
	}
	
	temp.next=this.head;
	//this.tail.next=this.head;
	//temp.next=this.head;
	this.head=p.next;
	p.next=null;
	
}
public void greater()throws Exception
{
	reversedata();
	Node p=this.head;
	Node prev=this.head;
	Node ptr=this.head;
	while(ptr!=null)
	{
		ptr=ptr.next;
		if(prev.data>ptr.data)
		{
			prev.next=ptr.next;
			ptr.next=null;
			ptr=null;
			prev=prev.next;
		}
		else
		{
			ptr=ptr.next.next;
		}
	}
	//reversedata();
	
}
public void greater1()throws Exception
{
	reversedata();
	int left=0;
	Node p=this.head;
	while(p!=null&&left<this.size-2)
	{
		Node ln=getnodeat(left);
		Node rn=ln.next;
		if(ln.data>rn.data)
		{
			ln.next=rn.next;
			rn.next=null;
		}
		else
		{
			ln.next=rn;
		}
		left++;
		p=p.next;
	}
	
	
}
public void intersection1(linkedlist li)
{
	//linkedlist y=null;
	//Node temp=new Node();
	//temp.next=null;
	Node p=this.head;
	Node head1=null;
	Node tail1=null;
	Node p1=li.head;
	while(p!=null)
	{
		p1=li.head;
		while(p1!=null)
		{
			if(p1.data==p.data)
			{
				Node temp=new Node();
				temp.data=p1.data;
				if(head1==null)
				{
					head1=temp;
					tail1=temp;
				}
				else
				{
					tail1.next=temp;
					tail1=temp;
				}
				break;
				
			}
			p1=p1.next;
		}
			p=p.next;
		
	}
	


	Node p2=head1;
	while(p2!=null)
	{
		System.out.print(p2.data+" ");
		p2=p2.next;
	}


}
public int removelast()throws Exception
{
	if(size==0)
	{
		throw new Exception("ll is empty");
	}
	int rv=this.tail.data;
	Node nm1=getnodeat(this.size-2);
	this.tail=nm1;
	this.tail.next=null;
	
	return rv;
}
public void insert(int index)throws Exception
{
	if(this.size==0)
	{
		throw new Exception("ll is empty");
	}
	if(index<1||index>this.size)
	{
		throw new Exception("invalid index");
	}
	Scanner sc=new Scanner(System.in);
	Node nm1=getnodeat(index-1);
	Node p=new Node();
	p.data=sc.nextInt();
	p.next=null;
	if(index==1)
	{
		p.next=this.head;
		this.head=p;
	}
	else
	{
	Node np1=nm1.next;
	nm1.next=p;
	p.next=np1;
	
}
}
public int getat(int index)throws Exception
{
	if(size==0)
	{
		throw new Exception("ll is empty");
	}
	//if(index<0||index>this.size)
	//{
		//throw new Exception("invalid index");
	//}
	Node temp=head;
	for(int i=0;i<index;i++)
	{
		temp=temp.next;
	}
	return temp.data;
}
public void movelasttofirst()throws Exception
{
	if(size==0)
	{
		throw new Exception("ll is empty");
	}
	Node nm1=getnodeat(size-2);
	//nm1.next=null;
	//this.tail.next=head;
	
	this.tail.next=this.head;
	this.head=this.tail;
	nm1.next=null;
}
public void swap()throws Exception
{
	Node p=this.head;
	int count=0;
	while(p!=null)
	{
		count++;
		p=p.next;
	}
	int left=0;
	if(count%2!=0)
	{
		while(left<this.size-2)
		{
			Node ln=getnodeat(left);
			Node rn=ln.next;
			int temp=ln.data;
			ln.data=rn.data;
			rn.data=temp;
			left=left+2;
		}
	}
	else
	{
	
	while(left<this.size)
	{
		Node ln=getnodeat(left);
		Node rn=ln.next;
		int temp=ln.data;
		ln.data=rn.data;
		rn.data=temp;
		left=left+2;
	}
	}
}
public void pairwiseswap() throws Exception
{
	Node p=this.head;
	int count=0;
	while(p!=null)
	{
		count++;
		p=p.next;
	}
	int left=0;

		while(left<=this.size-2)
		{
			Node ln=getnodeat(left);
			Node rn=ln.next;
			int temp=ln.data;
			ln.data=rn.data;
			rn.data=temp;
			left=left+2;
		}
	
	
	}

public void intersection()
{
	Node p=this.head;
	Node head2=null;
	Node p1=head2;
	 Node head1=null;

	while(p!=null)
	{
		
	p1=head2;
		while(p1!=null)
		{
			
		
			if(p.data==p1.data)
			{
				Node p2=new Node();
				p2.data=p.data;
				if(head1==null)
				{
					//p2.data=p1.data;
					head1=p2;
					//tail1=p2;
				}
				else
				{
					//p2.data=p1.data;
					Node p3=head1;
					while(p3.next!=null)
					{
						p3=p3.next;
					}
					p3.next=p2;
					//tail1.next=p2;
					//tail1=p2;
				}
				break;
			}
			p1=p1.next;
		}
		p=p.next;
	}
	
	
}
public void alternate()throws Exception
{
	int count=0;
	if(this.size%2!=0)
	{
		Node t=null;
		Node prev=this.head;
		Node ptr=this.head;
		while(ptr!=null)
		{
			if(count%2==0)
			{
				prev=ptr;
				ptr=ptr.next;
			}
			else
			{
				t=ptr.next;
				prev.next=t;
				ptr=t;
			}
			count++;
		}
	}
}
public void reversedata()throws Exception
{
	int left=0;
	int right=this.size-1;
	while(left<right)
	{
		Node ln=getnodeat(left);
		Node rn=getnodeat(right);
		int temp=ln.data;
		ln.data=rn.data;
		rn.data=temp;
		left++;
		right--;
		
	}
}
public void decimal()throws Exception
{
	reversedata();
	double sum=0;
	int count=0;
	double a=0;
	Node temp=this.head;
	while(temp!=null)
	{
		 a=Math.pow(2, count);
		 
		sum=sum+(temp.data*a);
		count++;
		temp=temp.next;
		
		
		
	}
	int y=(int)sum;
	System.out.print(y);
}
public void ques31()throws Exception
{
	reversedata();
	Node temp=this.head;
	int carry=1;
	int sum;
	Node p=null;
	Node head1=null;
	Node tail1=null;
	while(temp!=null)
	{
		sum=carry+this.head.data;
		if(sum>=10)
		{
			carry=1;
		}
		else
		{
			carry=0;
		}
		sum=sum%10;
		p=new Node();
		p.data=sum;
		p.next=null;
		if(head1==null)
		{
			head1=p;
			tail1=p;
		}
		else
		{
			tail1.next=p;
			tail1=p;
		}
		temp=temp.next;
		
	}
	if(carry>0)
	{
		p.next=new Node();
		p.data=carry;
		p.next=null;
		
	}
	reversedata();
	this.head=head1;
	
}
public int midat()throws Exception
{
	Node s=getnodeat(this.size/2);
	return s.data;
}
public void move()throws Exception
{
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	if(k>this.size)
	{
		display();
		display();
	}
	Node nm1=getnodeat(this.size-k);
	Node m=getnodeat(this.size-1-k);
	Node h=getnodeat(this.size-1);
	h.next=this.head;
	this.head=nm1;
	m.next=null;
	//return h.data;
}
public void display()
{
	Node temp=this.head;
	while(temp!=null)
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}
}
