package stack;

import java.util.Scanner;

public class client1 {

	public static void main(String[] args)throws Exception {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		ques2 q1=new ques2();
	//q1.infixtopostfix(str);
		q1.postfix_to_infix(str);
		//boolean h=q.balanced(str);
		//if(h==true)
		//{
			//System.out.print("balanced");
		//}
		//else
		//{
			//System.out.print("unbalanced");
		//}

	}

}
