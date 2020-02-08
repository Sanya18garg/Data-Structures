package linkedlist1;

import java.util.Scanner;

public class InsertionatEnd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	Node p=start;
	while(p!=null)
		{
			System.out.print(p.data);
			p=p.address;
		}


	}

}
