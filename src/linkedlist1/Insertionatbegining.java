package linkedlist1;

import java.util.*;
class Node
{
	int data;
	Node address=null;
}

public class Insertionatbegining {
	public static void main(String args[])
	{
		Node start=null;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			Node p=new Node();
			p.data=sc.nextInt();
			p.address=null;
			if(start==null)
			{
				start=p;
			}
			else
			{
				p.address=start;
				start=p;
			}
		}
		Node p=start;
		while(p!=null)
		{
			System.out.print(p.data);
			p=p.address;
		}
	}

}
