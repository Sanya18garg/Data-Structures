package queue;

import java.util.Scanner;
import java.util.Stack;

public class file {

	Stack<Integer> s1=new Stack();
	Stack<Integer> s2=new Stack();
	void enqueue(Integer data)
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
	void dequeue()
	{
		s1.pop();
	}
	Integer peek()
	{
		return s1.peek();
	}

	public static void main(String[] args) {
//MyQueue<Integer> q=new MyQueue<Integer>();
		file q=new file();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
	int operation=sc.nextInt();
	if(operation==1)
	{
		q.enqueue(sc.nextInt());
	}
	else if(operation==2)
	{
		q.dequeue();
	}
	else if(operation==3)
	{
		System.out.print(q.peek());
	}
}

sc.close();
	}

}
