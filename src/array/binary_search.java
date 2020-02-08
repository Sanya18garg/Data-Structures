package array;

import java.util.Scanner;

public class binary_search {
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int m=sc.nextInt();
	System.out.print(binarysearch(arr,n,m));
}
static int binarysearch(int arr[],int n,int m)
{
	int temp=0;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				  temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			}
		}
	}
	int start=0;
	int end=n-1;
	for(int i=0;i<n;i++)
	{
		
		int mid=(start+end)/2;
				if(arr[mid]==m)
				{
					return mid;
				}
				else if(m>arr[mid])
				{
					
					start=mid+1;
				}
				else
				{
					end=mid-1;
				}
				
	}
	return -1;
}
}