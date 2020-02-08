package array;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class queue {

	public static Queue<Integer> reverse(Queue<Integer> q)
	{
		Stack<Integer> s=new Stack();
		while(!q.isEmpty())
		{
			s.push(q.remove());
		}
		while(!s.isEmpty())
		{
			q.add(s.pop());
		}
		return q;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<Integer> q=new LinkedList();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int item=sc.nextInt();
			q.add(item);
		}
		Queue<Integer> q1=new LinkedList();
		q=reverse(q);
		while(!q.isEmpty())
		{
			System.out.print(q.remove());
		}
		

	}

}
