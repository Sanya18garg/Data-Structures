package stack1;

import java.util.Scanner;
import java.util.Stack;

public class evalution_of_postfix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Integer> p=new Stack();
		int h=0;
		for(int i=0;i<s.length();i++)
		{
			
			if((s.charAt(i)-'0')>=1&&(s.charAt(i)-'0'<=9))
			{
				p.push(s.charAt(i)-'0');
			}
			else
			{
				char t=s.charAt(i);
				int x=p.pop();
				int y=p.pop();
				if(t=='+')
				{
					h=x+y;
					p.push(h);
				}
				else if(t=='-')
				{
					h=y-x;
					p.push(h);
				}
				else if(t=='*')
				{
					h=x*y;
					p.push(h);
				}
				else if(t=='/')
				{
					h=y/x;
					p.push(h);
				}
			}
			
		}
		
System.out.print(p.pop());
	}

}
