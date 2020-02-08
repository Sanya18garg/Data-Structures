package array;

import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int y=n/2;
		    int sum=0;
		    int sum1=0;
		    int j=0;
		    for(int i=0;i<y;i++)
		    {
		        sum=sum+arr[i];
		    }
		   // System.out.print(sum);
		    for(int i=y+1;i<n;i++)
		    {
		        sum1=sum1+arr[i];
		    }
		    if(sum==sum1)
		    {
		        j=y+1;
		    }
		    else
		    {
		        j=-1;
		    }
		    System.out.println(j);
		    t--;
		}
	}
}