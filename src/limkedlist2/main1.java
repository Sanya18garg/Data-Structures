package limkedlist2;

import java.util.Scanner;





public class main1 {
	private class Node
	{
		int data;
		Node next;
		
		
	}
	 Node head;
	  Node tail;
	  int size;
//	linkedlist y;
	

public main1 addlast(main1 li ,int item)
{
Node p=new Node();
p.data=item;
p.next=null;
if(li.size>=1)
{
	li.tail.next=p;
}
if(li.size==0)
{
	li.head=p;
	li.tail=p;
	li.size++;
	
}
else
{
	li.tail=p;
li.size++;       
}
return li;
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
		int n=sc.nextInt();
		int data;
		main1 m=new main1();
		for(int i=0;i<n;i++)
		{
			data=sc.nextInt();
			m.addlast(m,data);
		}
		m.display();
		

	}

}
