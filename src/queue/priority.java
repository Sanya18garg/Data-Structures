package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priority {
PriorityQueue<Integer> q=new PriorityQueue();
public void add(int item)
{
	q.add(item);
}
public void highestremove()
{
	q.poll();
}
public void hightest()
{
	System.out.print(q.peek());
}
public void display()
{
	Iterator<Integer> itr=q.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next());
	}
}
public void remove(int item)
{
	q.remove(item);
}
}
