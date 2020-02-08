package linkedlist1;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Node start=null;
		Node start1=null;
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
		while(prev!=null)
		{
			Node temp=new Node();
			temp.data=prev.data;
			temp.address=null;
			if(start1==null)
			{
				start1=temp;
			}
			else
			{
				
			}
			
		}

	}

}
