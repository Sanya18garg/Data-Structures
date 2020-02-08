//import java.util.Scanner;
package stack;

import java.util.Scanner;

public class clientdequeue {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		dequeuestack l=new dequeuestack();
		ques1 g=new ques1(n);
		for(int i=0;i<n;i++)
		{
			l.enqueue(i);
		}
		l.display();
		System.out.println(l.dequeue());
		System.out.println(l.front());
		l.display();
		

	}

}
