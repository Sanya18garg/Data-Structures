package array;

import java.util.Scanner;

public class mergesort {
	public static void mergesort(int arr[])
	{
		p(arr,0,arr.length-1);
	}
	static void p(int arr[],int s,int e)
	{
		if(s>=e)
		{
			return ;
		}
		int mid=(s+e)/2;
		p(arr,s,mid);
		p(arr,mid+1,e);
		merge(arr,s,e);
		
		
	}
	public static void merge(int arr[],int s,int e)
	{
		int mid=(s+e)/2;
		int i=s;
		int j=mid+1;
		int k=s;
		int temp[]=new int[100];
		while(i<=mid&&j<=e)
		{
			if(arr[i]>arr[j])
			{
				temp[k]=arr[j];
				k++;
				j++;
			}
			else
			{
				temp[k]=arr[i];
				k++;
				i++;
			}
		}
		while(i<=mid)
		{
			temp[k]=arr[i];
			k++;
			i++;
		}
		while(j<=e)
		{
			temp[k]=arr[j];
			k++;
			j++;
			
		}
		for(int h=s;h<=e;h++)
		{
			arr[h]=temp[h];
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		mergesort(a);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
