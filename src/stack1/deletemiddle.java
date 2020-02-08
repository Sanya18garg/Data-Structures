package stack1;

import java.util.Scanner;
import java.util.Stack;

public class deletemiddle {
	public  static Stack<Integer> deletemiddle(Stack<Integer> s)

	{
	int y=	s.size();
	Stack<Integer> s1=new Stack();
	for(int i=0;i<y/2;i++)
	{
		s1.push(s.pop());
	}
	s.pop();
	while(!s1.isEmpty())
	{
		s.push(s1.pop());
	}
	return s;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Stack<Integer> k=new Stack<Integer>();
		for(int i=1;i<=n;i++)
		{
		int item=sc.nextInt();	
			k.push(item);
		}
	Stack<Integer> s1=deletemiddle(k);
		
		while(!s1.isEmpty())
		{
			System.out.print(s1.pop());
		}
		

	}

}
