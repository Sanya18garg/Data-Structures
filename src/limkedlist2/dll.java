package limkedlist2;
import java.util.*;







public class dll {
	private class Node
	{
		int data;
		Node next;
		Node prev;
	}
	Node head=null;
	Node tail=null;
int size=0;
public void insertion_atb(int item)
{
	Node p=new Node();
	p.data=item;
	p.prev=null;
	p.next=null;
	
	if(this.size==0)
	{
		this.head=p;
		this.tail=p;
		//this.head.prev=null;
		//this.tail.next=null;
		this.size++;
	}
	else
	{
		this.tail.next=p;
		p.prev=this.tail;
		this.tail=p;
		//this.tail.next=null;
		this.size++;
	}
}
public void insertion_ate(int item)
{
	Node p=new Node();
	p.data=item;
	p.prev=null;
	p.next=null;
	
	if(this.size==0)
	{
		this.head=p;
		this.tail=p;
		this.size++;
	}
	else
	{
		this.head.prev=p;
		p.next=this.head;
		this.head=p;
		this.size++;
		
	}
}
public int removefirst()
{
	Node p=this.head;
	int rv=this.head.data;
	
		this.head=this.head.next;
		this.head.prev=null;
	
	
	return rv;
}
public int removelast()
{
	Node p=new Node();
	int rv=this.tail.data;
	this.tail=this.tail.prev;
	this.tail.next=null;
	return rv;
}
public Node getnodeat(int k)
{
	//Scanner sc=new Scanner(System.in);
	
	Node temp=this.head;
	for(int i=1;i<k;i++)
	{
		temp=temp.next;
	}
	return temp;
}
public void deleteatk(int k)
{
	Node r=getnodeat(k);
	Node ln=getnodeat(k-1);
	ln.next=r.next;
	r.prev=null;
	this.size--;
}
public void deleteelement(int k)
{
	Node p=this.head;
	int count=1;
	while(p!=null)
	{
		if(p==this.head)
		{
			if(p.data==k)
			{
			this.head=this.head.next;
			this.head.prev=null;
		}
		}
		else
		{
		count++;
		if(p.data==k)
		{
			Node rn=getnodeat(count);
			Node ln=rn.prev;
			ln.next=rn.next;
			rn.next=null;
			
			
		}
		}
		//count++;
		p=p.next;
	}
}
public void reverse()
{
	int left=1;
	int right=this.size;
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
		if(current.data>index.data)
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
		this.head.prev=p;
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
			p.prev=left;
			p.next=right;
			right.prev=p;
		}
		ln++;
		//rn++;
		
	//}
	p1=p1.next;
	}
	}
}
public void duplicate()
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
public void insert(int k)
{
	Node p=new Node();
	Scanner sc=new Scanner(System.in);
	p.data=sc.nextInt();
	p.next=null;
	p.prev=null;
	Node p1=getnodeat(k-1);
	Node p2=p1.next;
	p1.next=p;
	p.prev=p1;
	//p2.prev=p;
	p.next=p2;
	p2.prev=p;
	this.size++;
}
public void merge(dll d1)
{
	
	Node p=this.head;
	Node p1=d1.head;
	this.tail.next=d1.head;
	d1.head.prev=this.tail;
	
}
public void movelasttofirst()
{
	Node p=new Node();
	Node r=getnodeat(size-1);
	this.tail.next=this.head;
	this.tail.prev=null;
	this.head.prev=this.tail;
	this.head=this.tail;
	r.next=null;
	//this.tail.next=null;
	
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
