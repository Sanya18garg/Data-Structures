package dll;

import java.util.Scanner;

public class client {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	dll l=new dll();
	for(int i=0;i<n;i++)
	{
		int item=sc.nextInt();
		l.addlast(item);
	}
	// x=sc.nextInt();
	//int key=sc.nextInt();
//	l.insertsort(key);
	//l.reverse(l);
	l.ispalindrome();
	//l.triplettosum(x);
	//l.largestnode();
	//l.insert(pos, key);
	//l.display();

	}

}
