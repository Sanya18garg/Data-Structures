package stack1;

import java.util.*;
import java.util.Stack;

class file
{
	public static int priority(String t)
	{
		if(t=="^")
		{
			return 4;
		}
		else if(t=="*"||t=="/")
		{
			return 3;
		}
		else if(t=="+"||t=="-")
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}
	public static void post(String exp1)
	{
		String h="";
		Stack<String> s1=new Stack();
		exp1=exp1+')';
		s1.push("(");
		for(int i=0;i<exp1.length();i++)
		{
			int y=exp1.charAt(i)-'0';
			if(y>=1&&y<=9)
			{
				h=h+y;
			}
			else if(y=='(')
			{
				s1.push("(");
			}
			else if(y==')')
			{
				String j=s1.pop();
				while(j!="(")
				{
					h=h+j;
					j=s1.pop();
				}
			}
			else
			{
				String e=s1.pop();
				while(priority(e)>=priority(y+""))
				{
					h=h+e;
					e=s1.pop();
				}
				s1.push(e+"");
				s1.push(y+"");
				
			}
		}
		System.out.print(h);
		//Stack<Integer> stack=new Stack<Integer>();
		//for(int i=0;i<exp.length();i++)
		//{
//			if((exp.charAt(i) - '0')>=1 && (exp.charAt(i) - '0')<=9)
//			{
			//	stack.push(exp.charAt(i) - '0');
			//}
			//else
			//{
//				int a=stack.pop();
//				int b=stack.pop();
//				if(exp.charAt(i)=='+')
				//{
					//stack.push(b+a);
				//}
				//else if(exp.charAt(i)=='-')
				//{
					//stack.push(b-a);
				//}
				//else if(exp.charAt(i)=='*')
				//{
					//stack.push(a*b);
				//}
				//else if(exp.charAt(i)=='/')
				//{
					//stack.push(a/b);
				//}
			//}
		//}
		//return stack.pop();
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String exp=sc.next();
		post(exp);
		//System.out.print(post(exp));
	}
}