package array;

import java.util.Scanner;

public class maximum_subarray_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int maxi=Integer.MIN_VALUE;
		int max=0;
		int start=0;
		int end=0;
		int s=0;
		for(int i=0;i<n;i++)
		{
			max+=arr[i];
			if(maxi<max)
			{
				maxi=max;
				start=s;
				end=i;
			}
			if(max<0)
			{
				max=0;
				s=i+1;
			}
		}
		int y=end-start+1;
		System.out.print(y);

	}

}
