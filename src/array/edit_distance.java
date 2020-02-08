package array;

import java.util.Scanner;

public class edit_distance {
	public static int edit(String str1,String str2)
	{
		char t[]=str1.toCharArray();
		char t1[]=str2.toCharArray();
		int n=t.length;
		int n1=t1.length;
		int l[][]=new int[n+1][n1+1];
		for(int i=0;i<=n;i++)
		{
			l[i][0]=i;
		}
		for(int i=1;i<=n1;i++)
		{
			l[0][i]=i;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n1;j++)
			{
				
			 if(t[i-1]==t1[j-1])
				{
					l[i][j]=l[i-1][j-1];
				}
				else
				{
					l[i][j]=Math.min(l[i][j-1],l[i-1][j-1]);
					l[i][j]=Math.min(l[i][j], l[i-1][j])+1;
					
				}
			}
		}
		return l[n][n1];
	}
	static int min(int x, int y, int z) 
    { 
        if (x <= y && x <= z) 
            return x; 
        if (y <= x && y <= z) 
            return y; 
        else
            return z; 
    } 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		int s=edit(str,str1);
		System.out.print(s);

	}

}
