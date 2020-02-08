package queue;

import java.util.Scanner;

public class client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int item;
		conversionqueue2stack c=new conversionqueue2stack();
		conversionqueuetostackenqueue c1=new conversionqueuetostackenqueue();
		for(int i=0;i<n;i++)
		{
			item=sc.nextInt();
			c1.enqueue(item);
			
		}
System.out.println(c1.dequeue());
		c1.display();

	}

}
