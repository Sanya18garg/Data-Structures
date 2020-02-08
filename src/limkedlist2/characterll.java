package limkedlist2;

import java.util.Scanner;
import java.util.Stack;

public class characterll {
	Node head;
	Node tail;
	class Node
	{
		char data;
		Node next;
		Node(char y)
		{
			data=y;
			next=null;
		}
	}
	public void addlast(char t)
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
		Stack<Character> s=new Stack();
		Stack<Character> s1=new Stack();
		while(temp!=null)
		{
			s.push(temp.data);
			temp=temp.next;
		}
		char a[]=new char[1000];
		int size=0;
		while(!s.isEmpty())
		{
			a[size]=s.pop();
			s1.push(a[size]);
			size++;
			
		}
		
		int flag=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]==s1.pop())
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
	public int size()
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
	public Node getat(int y)
	{
		Node temp=this.head;
		for(int i=0;i<y;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	public boolean palindrome()
	{
		int y=size()/2;
		Node r=getat(y);
		int left=y;
		int right=size()-1;
		char temp;
		while(left<right)
		{
			Node l=getat(left);
			Node r1=getat(right);
			temp=l.data;
			l.data=r1.data;
			r1.data=temp;
			left++;
			right--;
		}
		int flag=0;
		Node t=getat(y);
		Node temp1=this.head;
		while(temp1!=null&&t!=null)
		{
			if(temp1.data==t.data)
			{
			flag=1;
			}
			else
			{
				flag=0;
				break;
			}
			temp1=temp1.next;
			t=t.next;
		}
		if(flag==1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	char t[]=new char[n];
	characterll c=new  characterll();
	for(int i=0;i<n;i++)
	{
		t[i]=sc.next().charAt(0);
		c.addlast(t[i]);
	}
//boolean r=	c.palindrome();
//System.out.print(r);
c.checkpalindrome();
	}

}
