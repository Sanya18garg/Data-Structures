package array;

import java.util.HashSet;
import java.util.Scanner;

public class count_subarray_withsum_x {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int sum=sc.nextInt();
		HashSet<Integer> m=new HashSet<Integer>();
		int count=0;
		for(int i=0;i<n;i++)
		{
			int k=sum-arr[i];
			if(m.contains(k))
			{
				count++;
			}
			else
			{
				m.add(arr[i]);
			}
		}
		
		

	}

}
