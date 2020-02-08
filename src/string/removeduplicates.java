package string;

import java.util.HashSet;
import java.util.Scanner;

public class removeduplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		HashSet<Character> s=new HashSet<Character>();
		String h="";
		for(int i=0;i<str.length();i++)
		{
			char t=str.charAt(i);
			if(s.contains(t))
			{
				s.add(t);
			}
			else
			{
				h=h+t;
				s.add(t);
			}
			
		}
		System.out.print(h);
		

	}

}
