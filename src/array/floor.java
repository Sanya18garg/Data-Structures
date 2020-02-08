package array;

import java.util.Scanner;

public class floor {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		    int x=sc.nextInt();
		    int flag=0;
		    int y[]=new int[n];
		    int k=0;
		    for(int i=n-1;i>=0;i--)
		    {
		        y[k]=arr[i];
		        k++;
		    }
		    
		    for(int i=0;i<k;i++)
		    {
		        if(x>=y[i])
		        {
		            flag=1;
		            System.out.println(n-i);
		            break;
		            
		        }
		    }
		    if(flag==0)
		    {
		        System.out.println("-1");
		    }
		    t--;
		}

	}

}
