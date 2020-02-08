package stack;
import java.util.*;
public class reversestack{
	

	public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
		ques1 k=new ques1(5);
		int n=sc.nextInt();
		char t;
		for(int i=0;i<n;i++)
		{
		t=sc.next().charAt(0);
			k.push(t);
		}
		//for(int i=1;i<=5;i++)
		//{
			//k.push(i*10);
		//}
		k.display();
		
		ques1 helper=new ques1();
reverse(k, helper, 0);
	k.display();

	}
	public static void reverse(ques1 stack,ques1 helper,int index)throws Exception
	{
		if(stack.isEmpty())
		{
			return ;
		}
		int item=stack.pop();
		reverse(stack,helper,index+1);
		helper.push(item);
		if(index==0)
		{
		while(!helper.isEmpty())
		{
			stack.push(helper.pop());
		}
	}

}
}