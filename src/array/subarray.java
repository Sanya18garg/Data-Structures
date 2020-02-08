package array;

import java.util.HashMap;
import java.util.Scanner;

public class subarray {
	boolean subarray(int arr[],int arr1[],int n,int m)
	{
		HashMap<Integer,Boolean> h=new HashMap<Integer,Boolean>();
		for(int i=0;i<n;i++)
		{
			if(!h.containsKey(arr[i]))
			{
				 h.put(arr[i], false);
			}
		}
		for(int i=0;i<m;i++)
		{
			if(!h.containsKey(arr1[i]))
			{
	return false;
			}
	
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int arr1[]=new int[m];
		for(int i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		subarray s=new subarray();
		System.out.print(s.subarray(arr, arr1, n, m));
		
		

	}

}
