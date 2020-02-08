package limkedlist2;

import java.util.Scanner;


public class linkedlist2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//Node p=new Node();
//Node p1=new Node();
		Node head=null;
		Node head1=null;
int n=sc.nextInt();
int n1=sc.nextInt();
for(int i=0;i<n;i++)
{
	Node p=new Node();
	p.data=sc.nextInt();
	p.next=null;
	if(head==null)
	{
		head=p;
	}
	else
	{
		Node temp=head ;
		while( temp.next != null )
		{
			temp= temp.next;
}
	
	temp.next=p; 
}
}
for(int i=0;i<n1;i++)
{
	Node p1=new Node();
	p1.data=sc.nextInt();
	p1.next=null;
	if(head1==null)
	{
		head1=p1;
	}
	else
	{
		Node temp1=head ;
		while( temp1.next != null )
		{
			temp1= temp1.next;
}
	
	temp1.next=p1; 
}
}
Node p=head;
Node p1=head1;
int flag=0;
while(p!=null&&p1!=null)
{
	if(p.data==p1.data)
	{
		flag=1;
	}
	else
	{
		flag=0;
	}
	p=p.next;
	p1=p1.next;
}
if(flag==1)
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}
	}

}
