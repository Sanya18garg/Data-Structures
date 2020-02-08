package string;

import java.util.Scanner;

public class string_trim {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	String str1=sc.next();
	String h=str.replace(str1, " ");
	System.out.print(h.trim());

	}

}
