package bst;

import java.util.Scanner;

public class client2 {

	public static void main(String[] args) {
		//50 25 45 38 48 85 60 18
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		bst c=new bst();
		for(int i=0;i<n;i++)
		{
			int item=sc.nextInt();
			c.insert(item);
		}
	//System.out.print(c.sum1());
		int a=sc.nextInt();
	//	int b=sc.nextInt();
		System.out.print(c.distancefromroot(a));
		//c.addgreatervalues();
		//c.parent(a);
	//c.kthsmallest(k);
		//c.paireqtosum(k);
		//c.roottoleafpathsum();
		//c.calculateLevelSum();
		//c.kthsmallest(a);
		//System.out.print(c.floor(a));
//	c.countpair(k);
	//
		//c.predeccessor(a);
		//System.out.print(c.predeccessor(a));
		//c.checkallleavesnodesatsamelevel();
		//c.converttreetolinkedlist();
		//System.out.print(c.cousin(a, b));
		//c.inorder();
		//c.preorder();
		//c.parent(sc.nextInt());
		//c.calculateLevelSum();
		//int n1=sc.nextInt();
		//int n2=sc.nextInt();
		//System.out.print(c.siblings(n1, n2));
		//c.levelorder();
		//c.level();
		//System.out.print(c.lowestcommonances(n1, n2));
		//System.out.print(c.min());
		//c.printleaf();
//System.out.print(c.height());
		//for(int i=0;i<n;i++)
		//{
			//arr[i]=sc.nextInt();
		//}
		//int n1=sc.nextInt();
		//int arr2[]=new int [n1];
		//for(int i=0;i<n1;i++)
		//{
			//arr2[i]=sc.nextInt();
		//}
		//Node r=c.printtreefrompreorderndinorder(arr, arr2);
		//c.inorder(r);
		
	}

}
