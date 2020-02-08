package queue;

import java.util.Stack;

public class conversionqueue2stack {
	Stack<Integer> s1=new Stack();
	Stack<Integer> s2=new Stack();
	public void enqueue(int data)
	{
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
			
		}
		s1.push(data);
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		
	}
	
	public int dequeue()
	{
		return s1.pop();
 
	}
	public int front()
	{
		
		return s1.peek();
	}
public void display()
{
	//System.out.println(s1);
	while(!s1.isEmpty())
	{
		System.out.print(s1.pop());
	}
}
}
