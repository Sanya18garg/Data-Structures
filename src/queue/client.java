package queue;

import java.util.Scanner;

public class client {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int item;
		queue q=new queue(n);
		for(int i=0;i<n;i++)
		{
			item=sc.nextInt();
			q.enqueue(item);
		}
		//q.dequeue();
		//q.enqueue(10);
		q.reverse(q);
		//System.out.print(q.front());
			q.display();
		
		

	}

}
