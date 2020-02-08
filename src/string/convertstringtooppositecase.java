package string;

import java.util.Scanner;

public class convertstringtooppositecase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String r="";
		StringBuilder s=new StringBuilder(str);
		for(int i=0;i<s.length();i++)
		{
			Character t=str.charAt(i);
			if(Character.isLowerCase(t))
			{
			s.replace(i,i+1,Character.toUpperCase(t)+"");
			}
			else
			{
				s.replace(i,i+1,Character.toLowerCase(t)+"");
			}
		}
		System.out.println(s);

	}

}
