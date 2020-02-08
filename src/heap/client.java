package heap;

import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		//1 3 5  4 6 13 10 9 8 15 17
		//17 15 13 9 6 5 10 4 8 3 1
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		heaps h=new heaps();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		
		}
		//int x=sc.nextInt();
		//h.buildmaxheap(arr,n);
	//	h.heapsort(arr, n);
		//h.print(arr, n);
		n=h.delete(arr, n);
		//int x=sc.nextInt();
		//h.insert(arr,n,x);
		//h.ksmallest(arr, x);
		
		//System.out.println(h.delete(arr, n));
		//y=n-1;
		h.print(arr, n);
		

	}

}
