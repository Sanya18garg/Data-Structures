package stack;

import java.util.Scanner;
import java.util.Stack;
class stack
{
	Stack<Integer> q=new Stack();
	Stack<Integer> q1=new Stack();

	void push(int data)throws Exception
	{
		
		q.push(data);
		if(q.size()==1)
		{
			q1.push(data);
			return;
		}
		
		if(data <q1.peek())
		{
			q1.push(data);
		}
		else
		{
			q1.push(q1.peek());
		}
	}
	public void pop()throws Exception
	{
		
		q.pop();
		q1.pop();
	}
	public int getminimum()throws Exception
	{
		
		return q1.peek();
	}
}

public class minmaxstack {

	public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	stack s=new stack();
	int item;
	for(int i=0;i<n;i++)
	{
		item=sc.nextInt();
		s.push(item);
	}
	System.out.print(s.getminimum());
	

	}

}
