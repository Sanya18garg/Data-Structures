package array;

import java.util.Scanner;

public class sortrotatearray {
	
	public int search(int arr[],int n,int key)
	{
		return s(arr,0,n-1,key);
	}
	public int s(int arr[],int low,int high,int key)
	{
		if(low>high)
		{
			return -1;
		}
		int mid=(low+high)/2;
		if(arr[mid]==key)
		{
			return mid;
		}
		if(arr[mid]>=arr[low])
		{
			if(key<=arr[mid]&&key>=arr[low])
			{
				return s(arr,low,mid-1,key);
			}
			return s(arr,mid+1,high,key);
		}
		if(key>=arr[mid]&&key<=arr[high])
		{
			return s(arr,mid+1,high,key);
		}
		return s(arr,low,mid-1,key);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		sortrotatearray s1=new sortrotatearray();
		System.out.print(s1.search(arr, n, key));

	}

}
