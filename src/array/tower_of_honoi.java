package array;

import java.util.Scanner;

public class tower_of_honoi {
public static void pro(int n,char start,char aux,char end)

{
	if(n==1)
	{
		System.out.println("1 disk "+start+ " "+end);
		return ;
	}
	pro(n-1,start,end,aux);
	System.out.println(n+" disk "+start+" "+end);
	pro(n-1,aux,start,end);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int disk=sc.nextInt();
		pro(disk,'a','b','c');

	}

}
