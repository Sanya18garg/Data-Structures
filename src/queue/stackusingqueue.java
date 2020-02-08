package queue;

import java.util.LinkedList;
import java.util.Queue;

public class stackusingqueue {
	Queue<Integer> q1=new LinkedList();
	Queue<Integer> q2=new LinkedList();
	
	
static int s;
stackusingqueue()
{
	s=0;
}
public void push(int data)
{
	s++;
	q2.add(data);
	while(!q1.isEmpty())
	{
		q2.add(q1.peek());
		q1.remove();
		}
	
	Queue<Integer> q=q1;
	q1=q2;
	q2=q;
}
	public void pop()
	{
		if(q1.isEmpty())
		{
			return ;
		}
		while(!q1.isEmpty())
		{
			System.out.print(q1.remove());
		}

s--;
	}
	public int top()
	{
		if(q1.isEmpty())
		{
			return -1;
		}
		return q1.peek();
		
	}
	public int size()
	{
		return s;
	}
}
