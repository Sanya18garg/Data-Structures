package array;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		
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
		    int sum=0;
		    for(int i=0;i<n-1;i++)
		    {
		        for(int j=i+1;j<n;j++)
		        {
		            if((arr[j]-arr[i])>1)
		            {
		                sum=sum+(arr[j]-arr[i]);
		            }
		            else if((arr[j]-arr[i]==-1)&&(arr[j]-arr[i]==1))
		            {
		                sum=sum+0;
		            }
		            else
		            {
		            	sum=sum+(arr[j]-arr[i]);
		            }
		        }
		    }
		    System.out.println(sum);
		    t--;
		}
	}

}
