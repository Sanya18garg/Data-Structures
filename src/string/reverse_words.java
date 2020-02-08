package string;

import java.util.Scanner;

public class reverse_words {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		String ans="";
		for(int i=arr.length-1;i>=0;i--)
			
		{
			ans+=arr[i]+" ";
		}
		System.out.print(ans);

	}

}
