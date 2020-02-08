package stack;

import java.util.Scanner;

public class client3 {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str[]=new String[n];
		ques1 q=new ques1();
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		int count=0;
		for(int j=0;j<n;j++)
		{
		for(int i=0;i<str[j].length();i++)
		{
			char t=str[j].charAt(i);
			if(t=='['||t=='('||t=='{')
			{
				q.push(t);
			}
			else if(!q.isEmpty()&&((t=='}'&&q.top()=='{')||(t==']'&&q.top()=='[')||(t==')'&&q.top()=='(')))
			{
				q.pop();
			}
			else
			{
				q.push(t);
			}
		}
		if(q.isEmpty())
		{
		count++;
		}


	}
		System.out.println(count);
	}
}
