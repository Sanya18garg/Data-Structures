package dll;

public class dll {
	class Node
	{
		int data;
		Node prev;
		Node next;
		Node(int y)
		{
			data=y;
			prev=null;
			next=null;
		}
		
	}
	Node head=null;
	Node tail=null;
	public void addlast(int y)
	{
		Node p=new Node(y);
		if(head==null)
		{
			this.head=p;
			this.tail=p;
		}
		else
		{
			p.prev=this.tail;
			this.tail.next=p;
			this.tail=p;
			
		}
	}
	public void insertsort(int y)
	{
		int left=0;
		Node p=new Node(y);
		Node temp=this.head;
		while(temp!=null)
		{
			Node l=get(left);
			Node r=l.next;
			if(y>l.data&&y<r.data)
			{
				l.next=p;
				p.prev=l;
				p.next=r;
				r.prev=p;
				break;
				
				
			}
			else
			{
				left++;
				
			}
			temp=temp.next;
		}
	}
	public void insertlast(int y)
	{
		Node p=new Node(y);
		this.tail.next=p;
		p.prev=this.tail;
		this.tail=p;
	}
	public int size()
	{
		Node temp=this.head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;		}
	
	return count;
	}
	public Node reverse(dll p)
	{
		Node temp=p.head;
		int left=0;
		int right=size()-1;
	while(left<right)
	{
		Node l=get(left);
		Node r=get(right);
		int temp1=l.data;
		l.data=r.data;
		r.data=temp1;
		left++;
		right--;
		
	}
	return temp;
		
	}
	public void ispalindrome()
	{
		int left=(size()/2)+1;
		int right=this.size()-1;
	
		while(left<right)
		{
			Node l=get(left);
			Node r=get(right);
			int temp1=l.data;
			l.data=r.data;
			r.data=temp1;
			left++;
			right--;
		}
		Node temp=get(right-1);
		
		int flag=0;
		Node temp11=this.head;
		while(temp11!=null&&temp!=null)
		{
		
			if(temp11.data==temp.data)
			{
				flag=1;
				//System.out.print("1");
				
			}
			else
			{
				flag=0;
				//System.out.print("0");
				break;
			}
			temp11=temp11.next;
			temp=temp.next;
		}
		if(flag==1)
		{
			System.out.print("linkedlist is palindrome");
		}
		else
		{
			System.out.print("lisnkedlist is not palindrome");
		}
		
	}
	public void triplettosum(int x)
	{
		Node temp=this.head;
		int count=0;
		while(temp!=null)
		{
			Node p=temp.next;
			
			
			while(p!=null)
			{
				Node p1=p.next;
				while(p1!=null)
				{
					if(temp.data+p.data+p1.data==x)
					{
						count++;
					}
					p1=p1.next;
				}
				p=p.next;
			}
			temp=temp.next;
		}
		System.out.print(count);
	}
	public void largestnode()
	{
		Node temp=this.head;
		int y=this.head.data;
		while(temp!=null)
		{
			if(temp.data>y)
			{
				y=temp.data;
			}
			temp=temp.next;
		}
		System.out.print(y);
	}
	public void insertfirst(int y)
	{
		Node p=new Node(y);
		p.next=this.head;
		this.head.prev=p;
		this.head=p;
		
	}
	public void insert(int pos,int key)
	{
		Node p=new Node(key);
		Node l=get(pos-1);
		Node r=l.next;
		l.next=p;
		p.prev=l;
		p.next=r;
		r.prev=p;
		
	}
	public Node get(int k)
	{
		Node temp=this.head;
		for(int i=0;i<k;i++)
		{
			temp=temp.next;
		}
		return temp;
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
