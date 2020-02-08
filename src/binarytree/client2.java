package binarytree;

import java.util.Scanner;

public class client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		bst b=new bst(arr);
		System.out.print(b.size());
		//b.display();
		//int item=sc.nextInt();
		//b.inorder();
		//b.add(item);
		//System.out.print(b.findparent(sc.nextInt()));
		//
		//int x=sc.nextInt();
		//int y=sc.nextInt();
		//System.out.print(b.isbtabst());
		//b.levelorder();
//b.printnonleaf();
		//b.parent(sc.nextInt());
		//b.printleaf();
		//b.print2small();
	//	b.inorder();
		//b.display();
		//System.out.print(b.max());

	}

}
