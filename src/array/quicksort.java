package array;

import java.util.Scanner;

public class quicksort {
	static void quicksort(int arr[],int s,int e)
	{
		if(s>=e)
		{
			return ;
		}
		int p=partition(arr,s,e);
		quicksort(arr,s,p-1);
		quicksort(arr,p+1,e);
	}
	static int partition(int arr[],int s,int e)
	{
		int pivot=arr[e];
		int i=s-1;
		for(int j=s;j<e;j++)
		{
			if(arr[j]<=pivot)
			{
			i++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
		int temp1=arr[i+1];
		arr[i+1]=arr[e];
		arr[e]=temp1;
		//swap(arr[i+1],arr[e]);
		return i+1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
quicksort(arr,0,n-1);
    for(int i=0;i<n;i++)
   {
	System.out.print(arr[i]+" ");
      }
	}

}
