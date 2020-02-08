package array;

import java.util.Scanner;

public class insertion_sort {

	public static void insertion(int arr[],int n)
	{
		int hole;
		int value;
		for(int i=1;i<n-1;i++)
		{
			value=arr[i];
			hole=i;
		
		while(hole>0&&arr[hole-1]>value)
		{
			arr[hole]=arr[hole-1];
			hole--;
		}
		arr[hole]=value;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void selection_sort(int a[],int n)
	{
	
		for(int i=0;i<a.length;i++)
		{
			int small=a[i];
			int index=i;
			for(int j=i;j<a.length;j++)
			{
				if(small>a[j]){
					small=a[j];
					index=j;
				}
			}
			int temp=a[i];
				a[i]=small;
				a[index]=temp;
			}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//insertion(arr,n);
		selection_sort(arr,n);

	}

}
