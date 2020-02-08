package limkedlist2;



public class circular {
	private class Node
	{
		int data;
		Node next;
		
		
	}
	private Node head;
	private  Node tail;
	private  int size;
	public void insert_atend(int value)
	{
		Node p=new Node();
		p.data=value;
		if(this.size==0)
		{
			head=p;
			p.next=head;
			this.tail=p;
			this.size++;
		}
		else
		{
			p.next=this.tail.next;
			this.tail.next=p;
			this.tail=p;
			this.size++;
		}
	}
	public void insert_atb(int value)
	{
		Node p=new Node();
		p.data=value;
		if(this.size==0)
		{
			head=p;
			p.next=head;
			this.tail=p;
			this.size++;
		}
		else
		{
			Node temp=this.head;
			p.next=temp;
			this.head=p;
			this.tail.next=this.head;
			this.size++;
		}
	}
	public void display()
	{
		Node ptr=this.head;
		while(ptr.next!=this.head)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.print(ptr.data);
	}
}
