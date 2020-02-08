package string;

import java.util.Scanner;

public class distinctpermutation {
	public static void permutation(String str,String h)
	{
		if(str.length()==0)
		{
			System.out.print(h+" ");
			return;
		}
		boolean alpha[]=new boolean[26];
		for(int i=0;i<str.length();i++)
		{
			char t=str.charAt(i);
			String d=str.substring(0,i)+str.substring(i+1);
			if(alpha[t-'a']==false)
			{
				permutation(d,h+t);
				alpha[t-'a']=true;
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		permutation(str,"");

	}

}
