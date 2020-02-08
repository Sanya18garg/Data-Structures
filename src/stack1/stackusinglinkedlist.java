package stack1;

import java.util.Scanner;

public class stackusinglinkedlist {
	 private class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}	
Node head;
Node tail;
int size=0;
	public  void push(int value)
	{
		Node p=new Node(value);
		if(this.head==null)
		{
			this.head=p;
			this.tail=p;
			this.size++;
		}
		else
		{
			p.next=this.head;
			this.head=p;
			this.size++;
			
		}
		
	}
	public int pop()
	{
		int y=this.head.data;
		this.head=this.head.next;
		return y;
	}
	public int top()
	{
		return this.head.data;
	}
	public int size()
	{
		return this.size;
	}
	public boolean isEmpty()
	{
		return this.head==null;
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
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	stackusinglinkedlist l=new stackusinglinkedlist();
	
for(int i=1;i<=5;i++)
{
	
	l.push(i*10);
}
System.out.println(l.pop());

System.out.print(l.isEmpty());
l.display();

	}

}
