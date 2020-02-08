package stack;

public class dequeuestack {
	dynamicstack primary;
	dynamicstack secondary;
	public dequeuestack()throws Exception
	{
		this.primary=new dynamicstack();
		this.secondary=new dynamicstack();
	}
	
	public int size()
	{
		return this.primary.size();
	}
	public boolean isEmpty()
	{
		return this.primary.isEmpty();
	}
	public void enqueue(int data)throws Exception
	{
		while(primary.size()!=0)
		{
			secondary.push(primary.pop());
		}
		primary.push(data);
		while(secondary.size()!=0)
		{
			primary.push(secondary.pop());
		}
	}
	public int dequeue()throws Exception
	{
		return this.primary.pop();
		
	}
	public int front()throws Exception
	{
		return this.primary.top();
	}
	public void display()throws Exception
	{
		this.primary.display();
	}

}
