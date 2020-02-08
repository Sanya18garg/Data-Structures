package limkedlist2;

import java.util.*;
public class reverse {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
 	         String str=sc.nextLine();
		        int n=0;
		        int count=0;
                	 String str1="";
		
		str=str+'\0';
		for (int i = 0; str.charAt(i) !='\0'; i++) 
		{
	        n++;
	    }
		for(int i=n-1;i>=0;i--) 
		{	
			if(str.charAt(i)==32) {
				if(count==0) {
					str1=str1+str.charAt(i);
					count++;
				}
			}
			else {
				str1=str1+str.charAt(i);
				if(count>0)
				{
					 count=0;
				}
			}
			
			
		}
		System.out.println(str1);
	}


}
