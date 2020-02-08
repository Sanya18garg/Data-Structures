package newlinkedlist;

import java.util.Scanner;

public class linkedlist {

	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	Node head=null;
	Node tail=null;
	public void addlast(int item)
	{
		Node p=new Node(item);
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
	public void palindrome()
	{
		Node p=this.head;
		int l=0;
		int r=this.size()-1;
		while(l<r)
		{
			Node left=getnodeat(l);
			Node right=getnodeat(r);
			int temp=left.data;
			left.data=right.data;
			right.data=temp;
			l++;
			r--;
		}
		Node p1=this.head;
		int flag=0;
		while(p!=null&&p1!=null)
		{
			if(p.data==p1.data)
			{
				flag=1;
				p=p.next;
				p1=p1.next;
			}
			else
			{
				flag=0;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print("not");
		}
		else
		{
			System.out.print("yes");
		}
		
	}
	public int size()
	{
		int count=0;
		Node p=this.head;
		while(p!=null)
		{
			p=p.next;
			count++;
		}
		return count;
	}
	public Node getnodeat(int index)
	{
		Node temp=this.head;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	public void display()
	{
		Node m=this.head;
		while(m!=null)
		{
			System.out.print(m.data+" ");
			m=m.next;
		}
	}
	
	public void pairwise()
	{
		Node p=this.head;
		while(p!=null)
		{
			Node r=p.next;
			int temp=p.data;
			p.data=r.data;
			r.data=temp;
			p=p.next.next;
		}
	}
	public void alternatedelete()
	{
		int left=0;
		while(left<this.size()-1)
		{
			Node l=getnodeat(left);
			Node r=l.next;
			l.next=r.next;
			left++;
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	linkedlist l=new linkedlist();
	for(int i=0;i<n;i++)
	{
		int data=sc.nextInt();
		l.addlast(data);
	}
	//System.out.println(l.size());
	//l.pairwise();
	l.alternatedelete();
	l.display();
	
	//l.palindrome();
	//System.out.print(l.palindrome());

	}

}
