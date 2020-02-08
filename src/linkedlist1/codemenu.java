package linkedlist1;
import java.util.Scanner;
public class codemenu {
static node head=null;
	static class node
	{
	int data;
	node next;
	node(int d)
	{
	data=d;
	next=null;
	}
	}
	public static codemenu insert(codemenu l1,int data)
	{
	node n1=new node(data);
	n1.next=null;
	if(l1.head==null)
	{
	l1.head=n1;
	}
	else
	{
	node last=l1.head;
	while(last.next!=null)
	{
	last=last.next;
	}
	last.next=n1;
	}
	return l1;
	}
	public static codemenu addbeg(codemenu l1,int index,int ele)
	{
	node n1=new node(ele);
	if(index==0)
	{
	n1.next=l1.head;
	l1.head=n1;
	}
	else
	{
	int count=0;
	node current=l1.head;
	node pre=null;
	while(count<index-1)
	{
	count++;
	pre=current;
	current=current.next;
	}
	pre.next=n1;
	n1.next=current;
	}
	return l1;
	}
	public static codemenu del(codemenu l1,int index)
	{
	node last=l1.head;
	if(index==0)
	{
	l1.head=last.next;
	}
	else
	{
	node nn=last.next.next;
	int count=0;
	while(count<index-1)
	{
	last=last.next;
	nn=nn.next;
	count++;
	}
	last.next=nn;
	}
	return l1;
	}
	public static void display(codemenu l1)
	{
	node last=l1.head;
	while(last!=null)
	{
	System.out.println(last.data);
	last=last.next;
	}
	}
	public static void main(String arg[])
	{
	codemenu l1=new codemenu();
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	for(int i=0;i<a;i++)
	{
	int b=in.nextInt();
	l1=insert(l1,b);
	}
	System.out.println("Enter choice 1 if you want to insert the element at specific index ");
	System.out.println("Enter choice 2 if you want to delete the element at specific index ");
	System.out.println("enter your choice");
	int choice=in.nextInt();
	String ss="yes";
	while(ss.equals("yes"))
	{
	switch(choice)
	{
	case 1:
	System.out.println("enter the index where you want to insert the element");
	int index=in.nextInt();
	System.out.println("enter the elemet want to insert");
	int ele=in.nextInt();
	l1=addbeg(l1,index,ele);
	break;
	case 2:
	System.out.println("enter the index where you want to delete the element");
	index=in.nextInt();
	l1=del(l1,index);
	break;
	case 3:
	display(l1);
	break;
	default:
	System.out.println("invalid");
	}
	System.out.println("you want to continue");
	ss=in.next();
	if(ss.equals("yes"))
	{
	choice=in.nextInt();
	}
	}
	}
	}



