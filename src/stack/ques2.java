package stack;

public class ques2 {
	String data[];
	int size;
	int top;
	public static final int default_capacity=10;
	public ques2()throws Exception
	{
		this(default_capacity);
	}
	public ques2(int capacity)throws Exception
	{
		if(capacity<1)
		{
			throw new Exception("capacity is invalid");
		}
		this.data=new String[capacity];
		//this.size=0;
		this.top=-1;
	}
	public int size()
	{
		return this.top+1;
	}
	
	public boolean isEmpty()
	{
		return this.size()==0;
	}
	public void push(String  value)throws Exception
	{
		if(this.size()==this.data.length)
		{
			throw new Exception("stack is full");
		}
		this.top++;
		this.data[this.top]=value;
		//this.top++;
		
	}
	public String  pop()throws Exception
	{
		if(this.size()==0)
		{
			throw new Exception("stack is empty");
		}
		String rv=this.data[this.top];
		this.data[this.top]=null;
		this.top--;
		return rv;
		
	}
	public String top()throws Exception
	{
		if(this.size()==0)
		{
			throw new Exception("stack is empty");
		}
		String rv=this.data[this.top];
		//this.data[this.top]=0;
		//this.top--;
		return rv;
	}
	public int priority(char m)
	{
		if(m=='^')
		{
			return 4;
		}
		else if(m=='*'||m=='/')
		{
			return 3;
		}
		else if(m=='+'||m=='-')
		{
			return 2;
		}
		else 
		{
			return 1;
		}
	}
	
	public void postfix_to_infix(String str)throws Exception
	{
	
		for(int i=0;i<str.length();i++)
		{
		//t=str.charAt(i);
		if(str.charAt(i)>='a'&&str.charAt(i)<='z')
		{
			push(str.charAt(i)+"");
		}
		else
		{
			String  a=pop();
			String b=pop();
			String c=b+str.charAt(i)+a;
			push(c);
			
		}
		}
		String result=pop();
		System.out.println(result);
		
	}
	public void  infixtopostfix(String infix)throws Exception
	{
		infix=infix+")";
		String postfix="";
		push('(');
		//char t;
		for(int i=0;i<infix.length();i++)
		{
			// t=infix.charAt(i);
			if((infix.charAt(i)>='a'&&infix.charAt(i)<='z'))
			{
				postfix=postfix+infix.charAt(i);
			}
			else if(infix.charAt(i)==')')
			{
				char ch=pop();
				while(ch!='(')
				{
					postfix=postfix+ch;
					ch=pop();
				}
			}
			else if(infix.charAt(i)=='(')
			{
				push('(');
			}
			else
			{
				char ch=pop();
				while(priority(ch)>=priority(infix.charAt(i)))
				{
					postfix=postfix+(ch+"");
					ch=pop();
				}
				push(ch);
				push(infix.charAt(i));	
				}
		}
		System.out.print(postfix);
	}
public void display()
{
	for(int i=this.top;i>=0;i--)
	{
		System.out.print(this.data[i]);
	}
	//System.out.println("End");
}

}
