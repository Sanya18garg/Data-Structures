package array;

import java.util.Arrays;
import java.util.Scanner;

public class radixsort {
	public static void radixsort(int arr[])
	{
		int m=max(arr);
		for(int i=1;m/i>0;i=i*10)
		{
			countsort(arr,i);
		}
		
	}
	public static void countsort(int arr[],int exp)
	{
		int result[]=new int[arr.length];
		int p;
		int lsd;
		int count[]=new int[10];
		Arrays.fill(count, 0);
		for(int i=0;i<arr.length;i++)
		{
			lsd=(arr[i]/exp)%10;
			count[lsd]++;
		
	}
		for(int i=1;i<arr.length;i++)
		{
			count[i]+=count[i-1];
		}
		for(int i=arr.length-1;i>=0;i--)
		{
			lsd=(arr[i]/exp)%10;
			p=count[lsd-1];
			result[p]=arr[i];
			count[lsd]--;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=result[i];
		}
	}
	public static int max(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		return max;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		radixsort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
