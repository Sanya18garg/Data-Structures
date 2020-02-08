package queue;

import java.util.Scanner;

public class client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int item;
		stackusingqueue q=new stackusingqueue();
		for(int i=0;i<n;i++)
		{
			item=sc.nextInt();
			q.push(item);
		}
		q.pop();
		System.out.print(q.top());

	}

}
