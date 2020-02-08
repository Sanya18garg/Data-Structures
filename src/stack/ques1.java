package stack;

public class ques1 {
	int data[];
	int size;
	int top;
	public static final int default_capacity=10;
	public ques1()throws Exception
	{
		this(default_capacity);
	}
	public ques1(int capacity)throws Exception
	{
		if(capacity<1)
		{
			throw new Exception("capacity is invalid");
		}
		this.data=new int[capacity];
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
	public void push(int value)throws Exception
	{
		if(this.size()==this.data.length)
		{
			throw new Exception("stack is full");
		}
		this.top++;
		this.data[this.top]=value;
		//this.top++;
		
	}
	public int pop()throws Exception
	{
		if(this.size()==0)
		{
			throw new Exception("stack is empty");
		}
		int rv=this.data[this.top];
		this.data[this.top]=0;
		this.top--;
		return rv;
		
	}
	public int top()throws Exception
	{
		if(this.size()==0)
		{
			throw new Exception("stack is empty");
		}
		int rv=this.data[this.top];
		//this.data[this.top]=0;
		//this.top--;
		return rv;
	}
public void display()
{
	for(int i=this.top;i>=0;i--)
	{
		System.out.print(this.data[i]+" ");
	}
	System.out.println("End");
}
public boolean balanced(String str)throws Exception
{
	for(int i=0;i<str.length();i++)
	{
		char t=str.charAt(i);
		if(t=='['||t=='('||t=='{')
		{
			push(t);
		}
		else if(!isEmpty()&&((t=='}'&&top()=='{')||(t==']'&&top()=='[')||(t==')'&&top()=='(')))
		{
			pop();
		}
		else
		{
			push(t);
		}
	}
	if(isEmpty())
	{
		return true;
	}
	else
	{
		return false;
	}
}

}
