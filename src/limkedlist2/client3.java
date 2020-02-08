package limkedlist2;

import java.util.Scanner;

public class client3 {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		dll d=new dll();
		int item;
		for(int i=0;i<n;i++)
		{
			item=sc.nextInt();
			d.insertion_atb(item);
		}
		int item1;
		dll d1=new dll();
		//int n1=sc.nextInt();
		//for(int i=0;i<n1;i++)
		//{
			//item1=sc.nextInt();
			//d1.insertion_atb(item1);
		//}
		//d.merge(d1);
		//d.movelasttofirst();
		//int k=sc.nextInt();
		//d.deleteelement(k);
		d.insert_sort();
		//int k=sc.nextInt();
		//d.insert(k);
		//d.sort();
		
			//item=sc.nextInt();
			
			
		
		d.display();

	}

}
