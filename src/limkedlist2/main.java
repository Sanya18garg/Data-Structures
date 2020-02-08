package limkedlist2;
import java.util.*;
public class main {
	private class Node
	{
		int data;
		Node next;
		
	}
	private Node head;
	private  Node tail;
	private  int size;
	

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
public void display()
{
    Node temp=this.head;
	while(temp!=null)
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}



	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     main l=new main();
	     int item;
	     for(int i=0;i<n;i++)
	     {
	item=sc.nextInt();
	l.addlast(item);
	     }   
	     l.sort();
	     l.display();
	}

}
