package linkedlist1;

import java.util.Scanner;

public class movelasttofirst {

	public static void main(String[] args) {
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
				Node temp=start ;
				while( temp.address != null )
				{
					temp= temp.address;
	}
			
			temp.address=p; 
		}
		}
		Node prev=start;
		Node ptr=start;
		while(ptr.address!=null)
			
		{
			prev=ptr;
			ptr=ptr.address;
		}
		ptr.address=start;
		start=ptr;
		prev.address=null;
		Node p=start;
		while(p!=null)
		{
			System.out.print(p.data);
			p=p.address;
		}

	}

}
