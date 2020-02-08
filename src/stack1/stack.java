package stack1;

import java.util.Stack;

public class stack {
	public int data[];
	int top;
	public static final int default_capacity=10;
	stack()
	{
		this(default_capacity);
	}
	public stack(int capacity)
	{
		this.data=new int[capacity];
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
	public void push(int value)
	{
		this.top++;
		this.data[this.top]=value;
		
	}
	public int pop()
	{
		int rv=this.data[this.top];
		this.data[this.top]=0;
		this.top--;
		return rv;
	}
	public int top()
	{
		int rv=this.data[this.top];
		
		return rv;
	}
	public void display()
	{
		for(int i=this.top;i>=0;i--)
		{
			System.out.print(data[i]+" ");
			
		}
		
	}
	public void reverse(stack k)
	{
		stack j=new stack();
		reverse(k,j,0);
	}
	private void reverse(stack k,stack j,int index)
	{
		if(k.isEmpty())
		{
			return ;
		}
		int item=k.pop();
		reverse(k,j,index+1);
		j.push(item);
		if(index==0)
		{
			while(!j.isEmpty())
			{
				k.push(j.pop());
			}
		}
	}
	
public boolean balancedparenthesis(String str)
{
	for(int i=0;i<str.length();i++)
	{
		char t=str.charAt(i);
		if(t=='['||t=='{'||t=='('){
			push(t);
		}
		else if(!isEmpty()&&((t==')'&&top()=='(')||(t=='}'&&top()=='{')||(t==']'&&top()=='[')))
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
public int priority(char m)
{
	if(m=='^'){
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
public void infix_to_postfix(String str)
{
	Stack<Character> s=new Stack();
	String postfix="";
	str=str+')';
	s.push('(');
	for(int i=0;i<str.length();i++)
	{
		char t=str.charAt(i);
		if((t>='A'&&t<='Z')||(t>='a'&&t<='z'))
		{
			postfix=postfix+t;
		}
		else if(t=='(')
		{
			s.push('(');
		}
		else if(t==')')
		{
			char r=s.pop();
			while(r!='(')
			{
				postfix=postfix+r;
				r=s.pop();
			}
			
			
		}
		else
		{
			char ch=s.pop();
			while(priority(ch)>=priority(t))
			{
				postfix=postfix+ch;
				ch=s.pop();
			}
			s.push(ch);
			s.push(t);
			
		}
		
	}
	System.out.print(postfix);
	
}
public void postfix_to_infix(String str)
{
	Stack<String> s=new Stack();
	for(int i=0;i<str.length();i++)
	{
		char t=str.charAt(i);
		if((t>='a'&&t<='z')||(t>='A'&&t<='Z'))
		{
			s.push(t+"");
		}
		else
		{
			String h=s.pop();
			String h1=s.pop();
			String g=h1+t+h;
			s.push(g);
		}
	}
	String result=s.pop();
	System.out.print(result);
}
public boolean checkstring_palindrome(String str)
{
	int flag=0;
	Stack<Character> s=new Stack();
	for(int i=0;i<str.length();i++)
	{
		char t=str.charAt(i);
		s.push(t);
		
	}
	for(int i=0;i<str.length();i++)
	{
		char t=str.charAt(i);
		if(t==s.pop())
		{
			flag=1;
		}
		else
		{
			flag=0;
			break;
		}
	}
	if(flag==1)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public boolean operator(char t)
{
	if(t=='*'||t=='^'||t=='/'||t=='+'||t=='-')
	{
		return true;
	}
	else
	{
		return false;
	}
}
public void prefix_to_infix(String str)
{
	Stack<String> s=new Stack();
	for(int i=str.length()-1;i>=0;i--)
	{
		char t=str.charAt(i);
		if(operator(t))
		{
			String h=s.pop();
			String h1=s.pop();
			String c=h+t+h1;
			s.push(c);
		}
		else
		{
			s.push(t+" ");
		}
	}
	System.out.print(s.pop());
}
public Stack<Integer> sort_stack(stack l)
{
	Stack<Integer> s=new Stack();
	while(!l.isEmpty())
	{
	int y=l.pop();
	while(!s.isEmpty()&&(s.peek()<y))
	{
		l.push(s.pop());
	}
	l.push(y);
	}
	return s;
}

}

