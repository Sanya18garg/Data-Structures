package string;

import java.util.HashSet;
import java.util.Scanner;

public class to_make_string_anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		HashSet<Character> m=new HashSet<Character>();
		char t[]=str1.toCharArray();
		for(int i=0;i<t.length;i++)
		{
			m.add(t[i]);
		}
		char t1[]=str.toCharArray();
		int count=0;
		for(int i=0;i<t1.length;i++)
		{
			if(!m.contains(t1[i]))
			{
				count++;
			}
		}
		System.out.print(count);
		

	}

}
