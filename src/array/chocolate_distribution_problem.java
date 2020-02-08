package array;

import java.util.Arrays;
import java.util.Scanner;

public class chocolate_distribution_problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int max=Integer.MAX_VALUE;
		Arrays.sort(arr);
		int first=0;
		int last=0;
		for(int i=0;i+m-1<n;i++)
		{
			int temp=arr[i+m-1]-arr[i];
			if(temp<max)
			{
				max=temp;
				first=i;
				last=i+m-1;
			}
		}
		int y=arr[last]-arr[first];
		System.out.print(y);

	}

}
