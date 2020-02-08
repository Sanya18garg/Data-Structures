package array;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class duplicate {

	public static void main(String[] args) {
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
				int ov=m.get(arr[i]);
				int ne=ov+1;
				m.put(arr[i], ne);
			}
			else
			{
				m.put(arr[i], 1);
			}
		}
		boolean b=false;
		Set<Entry<Integer,Integer>> s=m.entrySet();
		for(Entry<Integer,Integer> e:s)
		{
			if(e.getValue()!=1)
			{
				System.out.print(e.getKey()+" ");
				b=true;
			}
		}
		if(!b)
		{
			System.out.print("-1");
		}

	}

}
