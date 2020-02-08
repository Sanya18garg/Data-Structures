package ll;

import java.util.Scanner;



public class ll1 {
	

	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	Node head;
	Node tail;
	int size;
	void addlast(int item)
	{
	Node p=new Node(item);
	p.data=item;
	p.next=null;
	if(this.head==null)
	{
		this.head=p;
		this.tail=p;
		
		
	}
	else
	{
		this.tail.next=p;
		this.tail=p;
		
	}

	
	}
	public Node getat(int index)
	{
		Node temp=this.head;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	public void delete(int key)
	{
		Node p1=getat(key);
		Node p=getat(key-1);
		Node p2=p1.next;
		p.next=p2;
		p1.next=null;
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
	
	void sumoflinklist(ll1 p)
	{
		Node temp=this.head;
		Node temp1=p.head;
		Node head1=null;
		Node p1=null;
		Node tail1=null;
		int sum;
		int carry=0;
		while(temp!=null||temp1!=null)
		{
			sum=carry +(temp!=null ? temp.data : 0)+(temp1!=null ? temp1.data : 0);
		
		carry=(sum>=10) ? 1 : 0;
		sum=sum%10;
		 p1=new Node(sum);
		if(head1==null)
		{
			head1=p1;
			tail1=p1;
		}
		else
		{
			tail1.next=p1;
			tail1=p1;
		}
		if(temp!=null)
		{
			temp=temp.next;
		}
		if(temp1!=null)
		{
			temp1=temp1.next;
		}
		}
		if(carry>0)
		{
			p1.next=new Node(carry);
		}
		
		this.head=head1;
	}
	public void sumof2ll(ll1 p)
	{
		Node temp=this.head;
		Node temp1=p.head;
		int sum=0;
		int c=0;
		Node head1=null;
		Node tail1=null;
		Node p1=null;
		while(temp!=null&&temp1!=null)
		{
			sum=c+temp.data+temp1.data;
			if(sum<=9)
			{
				c=0;
			}
			else
			{
				c=sum/10;
				sum=sum%10;
			}
			 Node n=new Node(sum);
			if(head1==null)
			{
				head1=n;
				p1=n;
			}
			else
			{
				p1.next=n;
				p1=p1.next;
			}
			temp=temp.next;
			temp1=temp1.next;
		}
		while(temp!=null)
		{
			sum=c+temp.data;
			if(sum<=9)
			{
				c=0;
			}
			else
			{
				c=sum/10;
				sum=sum%10;
			}
			Node n=new Node(sum);
			p1.next=n;
			p1=p1.next;
			temp=temp.next;
		}
		while(temp1!=null)
		{
			sum=c+temp1.data;
			if(sum<=9)
			{
				c=0;
			}
			else
			{
				c=sum/10;
				sum=sum%10;
			}
			Node n1=new Node(sum);
			p1.next=n1;
			p1=p1.next;
			temp1=temp1.next;
		}
		if(c!=0)
		{
			Node p2=new Node(c);
			p1.next=p2;
		}
		this.head=head1;
	}
	
	public void reversedata()throws Exception
	{
		int left=0;
		int right=length()-1;
		while(left<right)
		{
			Node ln=getat(left);
			Node rn=getat(right);
			int temp=ln.data;
			ln.data=rn.data;
			rn.data=temp;
			left++;
			right--;
			
		}
		Node temp=this.head;
				System.out.println(temp.data+" ");
		int count=0;
		double sum=0;
		while(temp!=null)
		{
			double rr=temp.data*Math.pow(2, count);
			System.out.print(rr+" ");
			sum=sum+ rr;
			count++;
			temp=temp.next;
		}
		int y=(int)sum;
		System.out.print(y);
		
	}
	void decimal()throws Exception
	{
		reversedata();
		
	}
	void mnnodes(int h,int h1)
	{
		Node temp=this.head;
		Node p=null;
		Node p1=null;
		Node head1=null;
		Node tail1=null;
	
		while(temp!=null)
		{
			int m=h;
			int m1=h1;
			while(m>0)
			{
				p=new Node(temp.data);
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
				m--;
			}
			while(m1>0)
			{
				temp=temp.next;
			     m1--;
			}
		}
		this.head=head1;
	}
	void split()
	{
		Node temp=this.head;
		Node head1=null;
		Node head2=null;
		
		Node tail1=null;
		Node tail2=null;
		int count=0;
		while(temp!=null)
		{
			count++;
			if(count%2!=0)
			{
				Node p=new Node(temp.data);
				p.data=temp.data;
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
			}
			else
			{
				Node p1=new Node(temp.data);
				p1.data=temp.data;
				p1.next=null;
				if(head2==null)
				{
					head2=p1;
					tail2=p1;
				}
				else
				{
					tail2.next=p1;
					tail2=p1;
				}	
			}
			temp=temp.next;
		}
			tail1.next=head2;
			this.head=head1;
		
	}
	void deletegreater()
	{
		Node temp=this.head;
		while(temp!=null)
		{
			Node p=temp.next;
			if(p.data>temp.data)
			{
				temp.next=null;
				temp=p;
			}
			temp=temp.next;
		}
	}
	void sumsame(int y)
	{
		Node temp=this.head;
		while(temp!=null)
		{
			Node t=temp.next;
			while(t!=null)
			{
				if(temp.data+t.data==y)
				{
					System.out.println(temp.data+","+t.data);
				}
				t=t.next;
			}
			temp=temp.next;
		}
	}
	void acctox(int x)
	{
		Node temp=this.head;
		Node head1=null;
		Node tail1=null;
		Node head2=null;
		Node tail2=null;
		Node head3=null;
		Node tail3=null;
		while(temp!=null)
		{
			if(temp.data<x)
			{
				Node p=new Node(temp.data);
				p.data=temp.data;
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
			}
			
			else if(temp.data==x)
			{
				
				Node p1=new Node(temp.data);
				p1.data=temp.data;
				p1.next=null;
				if(head2==null)
				{
					head2=p1;
					tail2=p1;
				}
				else
				{
					tail2.next=p1;
					tail2=p1;
				}	
			}
			else
			{
				Node p2=new Node(temp.data);
				p2.data=temp.data;
				p2.next=null;
				if(head3==null)
				{
					head3=p2;
					tail3=p2;
				}
				else
				{
					tail3.next=p2;
					tail3=p2;
				}	
			}
			temp=temp.next;
		}
		tail1.next=head2;
		tail2.next=head3;
		
		this.head=head1;
	}
	void ques40(int key)
	{
		Node temp=this.head;
		Node head1=null;
		Node head2=null;
		
		Node tail1=null;
		Node tail2=null;
		int count=0;
		while(temp!=null)
		{
		if(temp.data==key)
		{
				Node p=new Node(temp.data);
				p.data=temp.data;
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
			}
			else
			{
				Node p1=new Node(temp.data);
				p1.data=temp.data;
				p1.next=null;
				if(head2==null)
				{
					head2=p1;
					tail2=p1;
				}
				else
				{
					tail2.next=p1;
					tail2=p1;
				}	
			}
			temp=temp.next;
		}
		tail2.next=head1;
		this.head=head2;
	}
	void identical(ll1 p)
	{
		Node temp=this.head;
		Node temp1=p.head;
		int flag=0;
		while(temp!=null&&temp1!=null)
		{
			if(temp.data==temp1.data)
			{
				flag=1;
			}
			else
			{
				flag=0;
				break;
			}
			temp=temp.next;
			temp1=temp1.next;
		}
		if(flag==1)
		{
			System.out.print("list is identical");
		}
		else
		{
			System.out.print("list is not identical");
		}
	}
	void deletefull()
	{
		this.head=null;
	}
	public int length()
	{
		Node temp=this.head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	public int middlenode()
	{
		int y=this.length()/2;
		Node r=getat(y);
		return r.data;
	}
	void ques7(int x,int y)
	{
		Node temp=this.head;
		int count=0;
		int count1=0;
		while(temp!=null)
		{
			if(x==temp.data)
			{
				break;
			}
			count++;
			temp=temp.next;
		}
		Node temp1=this.head;
		while(temp1!=null)
		{
			if(y==temp1.data)
			{
				break;
			}
			count1++;
			temp1=temp1.next;
		}	
		Node l=getat(count);
		Node r=getat(count1);
		int a=l.data;
		l.data=r.data;
		r.data=a;
	}
	
	void alternatedelete()
	{
		Node temp=this.head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		Node temp1=this.head;
		if(count%2!=0)
		{
		while(temp1.next!=null)
		{
			Node p=temp1.next;
			temp1.next=p.next;
			temp1=temp1.next;
		}
		}
		else
		{
			while(temp1!=null)
			{
				Node p=temp1.next;
				temp1.next=p.next;
				temp1=temp1.next;
			}
		}
	}
	public boolean search(int key)
	{
		Node temp=this.head;
		while(temp!=null)
		{
			if(temp.data==key)
			{
			return true;
			}
		temp=temp.next;
		}
		return false;
		
	}
	public int nthend(int index)
	{
		int count=0;
		Node temp=this.head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		int y=count-index;
		Node r=getat(y);
		return r.data;
	}
	public int occur(int key)
	{
		int count=0;
		Node temp=this.head;
		while(temp!=null)
		{
			if(temp.data==key)
			{
				count++;
			}
			temp=temp.next;
		}
		return count;
	}
	public void duplicates()
	{
		Node curr=this.head;
		while(curr!=null)
		{
			Node temp=curr.next;
			if(temp!=null&&temp.data==curr.data)
			{
				temp=temp.next;
			}
			curr.next=temp;
			curr=curr.next;
		}
		
	}
	public void evenodd()
	{
		Node temp=this.head;
		Node head1=null;
		Node tail1=null;
		Node head2=null;
		Node tail2=null;
		while(temp!=null)
		{
			if(temp.data%2==0)
			{
				Node p=new Node(temp.data);
				p.data=temp.data;
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
			}
			else
			{
				Node p1=new Node(temp.data);
				p1.data=temp.data;
				p1.next=null;
				if(head2==null)
				{
					head2=p1;
					tail2=p1;
				}
				else
				{
					tail2.next=p1;
					tail2=p1;
				}
				
			}
			temp=temp.next;
		}
		tail1.next=head2;
		this.head=head1;
		//Node t=head1;
		//while(t!=null)
		//{
			//System.out.print(t.data+" ");
			//t=t.next;
		//}
	}
	void lastsumofn(int key)
	{
		int count=0;
		Node temp=this.head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		int sum=0;
		Node temp2=this.head;
			while(temp2!=null)
			{
				sum=sum+temp2.data;
				temp2=temp2.next;
			}
			System.out.print(sum);
			int n1=count-key;
			int sum1=0;
			Node temp1=this.head;
			while(n1>0&&temp1!=null)
			{
				sum1=sum1+temp1.data;
				temp1=temp1.next;
				n1--;
			}
			int y=sum-sum1;
			System.out.print(y);
			
	}
	void ques45(int n)
	{
		Node l=getat(this.length()-n);
		int sum=0;
		while(l!=null)
		{
			sum=sum+l.data;
			l=l.next;
		}
		System.out.print(sum);
	}
	void multiply(ll1 p)
	{
		Node temp=this.head;
		Node temp1=p.head;
		int num1=0;
		int num2=0;
		while(temp!=null||temp1!=null)
		{
			if(temp!=null)
			{
				num1=(num1*10)+temp.data;
				temp=temp.next;
			}
			else
			{
				num2=(num2*10)+temp1.data;
				temp1=temp1.next;
			}
		}
		int r=num1*num2;
		System.out.print(r);
	}
	void unique()
	{
		Node temp=this.head;
		Node p=null;
		Node head1=null;
		Node tail1=null;
		while(temp!=null)
		{
			Node p1=temp.next;
			if(p1!=null)
			{
			if(temp.data==p1.data)
			{
				temp=temp.next;
			}
			}
			else
			{
				p=new Node(temp.data);
				if(head1==null)
				{
					head1=null;
					tail1=null;
				}
				else
				{
					tail1.next=p;
					tail1=p;
				}
				temp=temp.next;
			}
			
		}
		this.head=head1;
	}
	void sumpair(ll1 p,int x)
	{
		Node temp=this.head;
		
		int count=0;
		while(temp!=null)
		{
			Node temp1=p.head;
			while(temp1!=null)
			{
				if(temp.data+temp1.data==x)
			
				{
					System.out.print(temp.data+","+temp1.data);
					count++;
				}
				temp1=temp1.next;
			}
			temp=temp.next;
		}
		System.out.print(count);
	}
	public void tripletsum(ll1 p,ll1 p1,int sum)
	{
		Node temp=this.head;
		while(temp!=null)
		{
			Node temp1=p.head;
			while(temp1!=null)
			{
				Node temp2=p1.head;
				while(temp2!=null)
				{
					if(temp.data+temp1.data+temp2.data==sum)
					{
						System.out.print(temp.data+","+temp1.data+","+temp2.data);
					}
					temp2=temp2.next;
				}
				temp1=temp1.next;
			}
			temp=temp.next;
		}
	}
	public void removeduplicatesinsorted()
	{
		Node temp=this.head;
		while(temp!=null)
		{
			Node p=temp.next;
			while(p!=null)
			{
				if(temp.data==p.data)
				{
					temp.next=p.next;
				}
				p=p.next;
			}
			temp=temp.next;
		}
	}
	public void multiply1(ll1 p)
	{
		Node temp=this.head;
		Node temp1=p.head;
		int sum=0;
		int sum1=0;
		while(temp!=null)
		{
			sum=sum*10+temp.data;
		}
		while(temp1!=null)
		{
			sum1=sum1*10+temp1.data;
		}
		System.out.print(sum*sum1);
	}
	public void greater1()
	{
		int left=0;
		int right=this.length()-1;
		while(left<right)
		{
			Node l=getat(left);
			Node r=getat(right);
			int s=l.data;
			l.data=r.data;
			r.data=s;
			left++;
			right--;
		}
		Node temp=this.head;
		while(temp!=null)
		{
			Node p=temp.next;
			if(temp.data>p.data)
			{
				temp.next=p.next;
			}
			temp=temp.next;
		}
		Node t=this.head;
		int count=0;
		while(t!=null)
		{
			count++;
			t=t.next;
		}
		int left1=0;
		int right1=count-1;
		while(left<right)
		{
			Node l1=getat(left1);
			
			Node r1=getat(right1);
			int s1=l1.data;
			l1.data=r1.data;
			r1.data=s1;
			left1++;
			right1--;
		}
		
	}
	public static void main(String []args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		ll1 l=new ll1();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int data=sc.nextInt();
			l.addlast(data);
		}
		ll1 l1=new ll1();
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			int data1=sc.nextInt();
			l1.addlast(data1);
}
		//ll1 l2=new ll1();
		//int n2=sc.nextInt();
		//for(int i=0;i<n2;i++)
		//{
			//int data2=sc.nextInt();
			//l2.addlast(data2);
	//}
		
		//int key=sc.nextInt();
		//int key2=sc.nextInt();
		//l.delete(key);
		//l.deletefull();
		//System.out.print("linkedlist is deleted");
		//System.out.print(l.length());
		//System.out.print(l.occur(key));
		//l.duplicates();
	//	l.tripletsum(l1, l2, key);
		//l.display();
		//l.evenodd();
		//l.alternatedelete();
		//l.split();
		//l.sumsame(key);
		//l.acctox(key);
		//l.ques40(key);
		//l.lastsumofn(key);
		//l.mnnodes(key, key2);
		//l.sumoflinklist(l1);
		l.sumof2ll(l1);
		//l.identical(l1);
		//
		//l.decimal();
		//int n1=sc.nextInt();
		//int n2=sc.nextInt();
		//l.ques45(n1);
		//l.reversedata();
		//l.multiply(l1);
//
	//	l.greater1();
	//	l.ques7(n1, n2);
		//l.removeduplicatesinsorted();
		//System.out.print(l.middlenode());
		//l.sumpair(l1,key);
		l.display();
		
		
	}
}
