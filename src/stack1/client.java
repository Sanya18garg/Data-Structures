package stack1;

import java.util.Scanner;
import java.util.Stack;

public class client {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		stack l=new stack();
		l.prefix_to_infix(str);
	}
		
	
	public static Stack<Integer> deletemiddle(Stack<Integer> s)

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
	

}
