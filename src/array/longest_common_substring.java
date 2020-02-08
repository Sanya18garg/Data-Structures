package array;

import java.util.Scanner;

public class longest_common_substring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		int m=str.length();
		int n=str1.length();
		char t[]=str.toCharArray();
		char t1[]=str1.toCharArray();
		int l[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			l[i][0]=0;
		}
		for(int i=1;i<=n;i++)
		{
			l[0][i]=0;
		}
		int result=0;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(t[i-1]==t1[j-1])
				{
					l[i][j]=l[i-1][j-1]+1;
					result=Math.max(result, l[i][j]);
				}
				else
				{
					l[i][j]=0;
				}
			}
		}
		System.out.print(result);

	}

}
