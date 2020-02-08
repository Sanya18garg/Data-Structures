package array;

import java.util.HashMap;
import java.util.Scanner;

public class length_subarray_sum0 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
		int sum=0;
		int length=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			if(arr[i]==0&&length==0)
			{
				length=1;
			}
			if(sum==0)
			{
				length=i+1;
			}
			Integer prev=m.get(sum);
			if(m.containsKey(sum))
			{
				length=Math.max(length, i-prev);
				
			}
			else
			{
				m.put(sum,i);
			}
		}
		System.out.print(length);

	}

}
