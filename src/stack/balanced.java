package stack;
import java.util.*;

public class balanced extends ques1 {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ques1 stack=new ques1();
		
		System.out.print(balance(str,stack));

	}
	public static boolean balance(String str,ques1 stack)throws Exception 
	{
		for(int i=0;i<str.length();i++)
		{
			char t=str.charAt(i);
			 if(t=='['||t=='{'||t=='(')
	            {
	                stack.push(t);
	            }
	            else if((t==']'&&stack.top()=='[')||(t==')'&&stack.top()=='(')||(t=='}'&&stack.top()=='{'))
	            {
	            	stack.pop();
	            }
		}
		if(stack.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
