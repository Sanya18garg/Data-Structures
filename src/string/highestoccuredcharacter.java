package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class highestoccuredcharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		HashMap<Character,Integer> m=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char t=str.charAt(i);
			if(m.containsKey(t))
			{
				m.put(t,m.get(t)+1);
			}
			else
			{
				m.put(t, 1);
			}
		}
		int max=0;
		char h='\0';
		for(Entry<Character, Integer> s:m.entrySet())
		{
			if(s.getValue()>max)
			{
				h=s.getKey();
				max=s.getValue();
			}
		}
		
		System.out.print(h);

	}

}
