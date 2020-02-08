package linkedlist1;

import java.util.Scanner;

public class insertionatK {

	public static void main(String[] args) {
		Node start=null;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int pos=sc.nextInt();
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
		Node temp=new Node();
		temp.data=sc.nextInt();
temp.address=null;
Node ptr=start;
Node prev=start;
while(pos>0)
{
	prev=ptr;
	ptr=ptr.address;
	pos--;
}
prev.address=temp;
temp.address=ptr;
Node p=start;
while(p!=null)
{
	System.out.print(p.data);
	p=p.address;
}
	}

}
