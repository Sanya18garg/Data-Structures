package stack;

public class client {

	public static void main(String[] args)throws Exception {
	ques1 q=new ques1(5);
	for(int i=1;i<=5;i++)
	{
		q.push(i*10);
	}
	q.display();
	System.out.println(q.pop());
	q.display();
	System.out.println(q.top());

	}

}
