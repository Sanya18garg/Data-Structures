package stack;

import java.util.Scanner;

public class reverse1 {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ques2 k=new ques2();
		char t[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			k.push(t[i]);
		}
		k.display();
		// TODO Auto-generated method stub


	}

}
