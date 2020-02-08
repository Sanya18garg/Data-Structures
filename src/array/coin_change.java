package array;

import java.util.Scanner;

public class coin_change {
	public static int coin(int arr[],int n,int sum)
	{
		int l[][]=new int[sum+1][n+1];
		
		for(int i=0;i<=n;i++)
		{
			l[0][i]=1;
		}
		for(int i=1;i<=sum;i++)
		{
			l[i][0]=0;
		}
		for(int i=1;i<=sum;i++)
		{
			for(int j=1;j<=n;j++)
			{
				l[i][j]=l[i][j-1];
				if(i>=arr[j-1])
				{
					l[i][j]=l[i][j-1]+l[i-arr[j-1]][j];
				}
			}
		}
		return l[sum][n];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print(coin(arr,n,sum));

	}

}
