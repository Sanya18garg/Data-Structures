package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class stackusingqueue1 {
	Queue<Integer> q=new LinkedList();
	Queue<Integer> q1=new LinkedList();
	static int c;
	stackusingqueue1()
	{
		c=0;
	}
	void enqueue(int x)
	{
		c++;
		q1.add(x);
		while(!q.isEmpty())
		{
			q1.add(q.remove());
		}
		Queue<Integer> q2=q;
		q=q1;
		q1=q2;
		
	}
	void dequeue()
	{
		if(q.isEmpty())
		{
			return ;
		}
		
		q.remove();
		
		c--;
		
	}
	int top()
	{
		if(q.isEmpty())
		{
			return -1;
		}
		return q.peek();
	}
	int size()
	{
		return c;
	}
	void print()
	{
		while(!q.isEmpty())
		{
			System.out.print(q.remove()+" ");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		stackusingqueue1 q=new stackusingqueue1();
		for(int i=0;i<n;i++)
		{
			int item=sc.nextInt();
			q.enqueue(item);
			
		}
	//	q.enqueue(10);
		//q.enqueue(20);
		//q.enqueue(30);
		//q.enqueue(40);
		//q.print();
		//System.out.println("print");
		 System.out.println("current size: " + q.size()); 
	       System.out.println(q.top()); 
	       q.dequeue(); 
	        System.out.println(q.top()); 
	        q.dequeue(); 
	        System.out.println(q.top()); 
	  
	        System.out.println("current size: " + q.size()); 
	}

}
