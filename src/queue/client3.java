package queue;

import java.util.Scanner;

public class client3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int item;
		priority c=new priority();
		for(int i=0;i<n;i++)
		{
			item=sc.nextInt();
			c.add(item);
			
		}
		//c.highestremove();
		c.hightest();
	c.display();
		//c.display();

	}

}
