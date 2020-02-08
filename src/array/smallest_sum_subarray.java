package array;

import java.util.Scanner;

public class smallest_sum_subarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			max+=arr[i];
			if(min>max)
			{
				min=max;
			}
			if(max>0)
			{
				max=0;
			}
		}
		System.out.print(min);

	}

}
