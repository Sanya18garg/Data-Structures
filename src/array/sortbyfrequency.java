package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class sortbyfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			if(m.containsKey(arr[i]))
			{
				
				m.put(arr[i],m.get(arr[i])+1 );
			}
			else
			{
				m.put(arr[i], 1);
			}
		}
		int a[]=new int[1000];
		int k=0;
for(Entry<Integer,Integer> s:m.entrySet())
{
	a[k]=s.getValue();
	k++;
}
Arrays.sort(a);
for(int i=0;i<n;i++)
{
	System.out.print(a[i]+" ");
}
	}

}
