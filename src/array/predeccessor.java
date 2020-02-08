package array;

import java.util.Arrays;
import java.util.Scanner;

public class predeccessor {

	public static void predeccessor(int arr[],int n)
	{
		int temp[]=new int[n];
		for(int i=0;i<n;i++)
		{
			temp[i]=arr[i];
		}
		
		Arrays.sort(arr);
		int flag=0;
		int a=0;
		int b=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
if(arr[j]==temp[i])
					
				{
			if(temp[i]==arr[0])
			{
				System.out.println("does not exist");
				
			}
			else
			{
				
				System.out.println(temp[i]+" "+arr[j-1]);
				}
			}
			}
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
		//int key=sc.nextInt();
		predeccessor(arr,n);
		

	}

}
