package string;

import java.util.Scanner;

public class move_special_characters_toend {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String h=sc.next();
		String s="";
		String j="";
		char t[]=h.toCharArray();
		for(int i=0;i<t.length;i++)
		{
			if(t[i]>='a'&&t[i]<='z')
			{
				s+=t[i];
			}
			else
			{
				j+=t[i];
			}
		}
		String g=s+j;
		System.out.print(g);
		

	}

}
