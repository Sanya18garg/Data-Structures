package string;

import java.util.HashSet;
import java.util.Scanner;

public class isogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		HashSet<Character> s=new HashSet();
		char t[]=str.toCharArray();
		int flag=0;
		for(int i=0;i<t.length;i++)
		{
			if(s.contains(t[i]))
			{
				flag=1;
				break;
			}
			else
			{
				s.add(t[i]);
			}
		}
		if(flag==0)
		{
			System.out.print("string is isogram");
		}
		else
		{
			System.out.print("no");
		}
		

	}

}
