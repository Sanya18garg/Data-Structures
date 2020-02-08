package string;

import java.util.Scanner;

public class titlecaseconversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] str1 = str.split(" ");
		for (int k = 0; k < str1.length; k++) {
		    StringBuilder j=new StringBuilder(str1[k]);
		Character s=j.charAt(0);
		j.replace(0,1,Character.toUpperCase(s)+"");
		System.out.print(j+" ");
		}
		

	}

}
