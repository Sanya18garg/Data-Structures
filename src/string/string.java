package string;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		    String s=in.next();
String g[]=s.split(" ");
for(int i=0;i<g.length-1;i++)
{
	System.out.print(g[i]+"%20");
}
//System.out.print(g[g.length-1]);



	}

}
