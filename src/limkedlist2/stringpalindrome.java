package limkedlist2;

import java.util.Scanner;
import java.util.Stack;

import limkedlist2.characterll.Node;

public class stringpalindrome {
	class Node
	{
		String data;
		Node next;
		Node(String r)
		{
			data=r;
			next=null;
		}
	}
	Node head=null;
	Node tail=null;
	public void addlast(String t)
	{
		Node p=new Node(t);
		if(head==null)
		{
			head=p;
			tail=p;
		}
		else
		{
			tail.next=p;
			tail=p;
			
		}
	}
	public void checkpalindrome()
	{
		Node temp=this.head;
		String str="";
		Stack<Character> s=new Stack();
		Stack<Character> s1=new Stack();
		while(temp!=null)
		{
			//s.push(temp.data);
			str=str+temp.data;
			temp=temp.next;
		}
		char a[]=new char[1000];
		int size=0;
		for(int i=0;i<str.length();i++)
		{
			s.push(str.charAt(i));
		}
		
		
		int flag=0;
		for(int i=0;i<str.length();i++)
		{
			char t=str.charAt(i);
			if(t==s.pop())
			{
				flag=1;
			}
			else
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.print("palindrome");
		}
		else
		{
			System.out.print("not palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//char t[]=new char[n];
		stringpalindrome c=new stringpalindrome();
		for(int i=0;i<n;i++)
		{
		String s=sc.next();
			c.addlast(s);
		}
	//boolean r=	c.palindrome();
	//System.out.print(r);
	c.checkpalindrome();

	}

}
