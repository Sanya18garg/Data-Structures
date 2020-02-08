package stack1;

import java.util.Scanner;
import java.util.Stack;

public class nextgreaterelement {
	public static void get(int arr[],int n)
	{
		int next,element;
		Stack<Integer> s=new Stack();
		s.push(arr[0]);
		for(int i=1;i<n;i++)
		{
			 next=arr[i];
			if(!s.isEmpty())
			{
			element=s.pop();
			while(element<next)
			{
				System.out.print(element+"->"+next);
				if(s.isEmpty())
				{
					break;
				}
				element=s.pop();
			}
			if(element>next)
			{
				s.push(element);
			}
			}
			s.push(next);
			}
		while(!s.isEmpty())
		{
			element=s.pop();
			next=-1;
			System.out.print(element+"->"+next);
			
			
		
		}
	
	}
	public static void reversestring(String str)
	{
		Stack<Character> s=new Stack();
		for(int i=0;i<str.length();i++)
		{
			char t=str.charAt(i);
			if(t!=' ')
			{
				s.push(t);
			}
			else
			{
				while(!s.isEmpty())
				{
					System.out.print(s.pop());
					
				}
				System.out.print(" ");	
			}
			
		}
		while(!s.isEmpty())
		{
			System.out.print(s.pop());
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		String str=sc.nextLine();
		reversestring(str);
		//int arr[]=new int[n];
		//for(int i=0;i<n;i++)
		//{
			//arr[i]=sc.nextInt();
		//}
		//get(arr,n);
		

	}

}
