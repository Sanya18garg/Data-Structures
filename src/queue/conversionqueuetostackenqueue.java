package queue;

import java.util.Stack;

public class conversionqueuetostackenqueue {
	Stack<Integer> s1=new Stack();
	Stack<Integer> s2=new Stack();
	void enqueue(int data)
	{
		s1.push(data);
	}
	int dequeue()
	{
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		int rv=s2.pop();
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		return rv;
	}
	public void display()
	{
		while(!s1.isEmpty())
		{
			System.out.print(s1.pop());
		}
	}

}
