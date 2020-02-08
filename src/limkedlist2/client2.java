package limkedlist2;
import java.util.*;







public class client2 {
	
	
	private Node head;
	private Node tail;
	private int size=0;
	public void addlast(int item)
	{
	Node p=new Node();
	p.data=item;
	p.next=null;
	if(this.size>=1)
	{
		this.tail.next=p;
	}
	if(size==0)
	{
		this.head=p;
		this.tail=p;
		this.size++;
		
	}
	else
	{
		this.tail=p;
		this.size++;       
	}
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public Node getnodeat(int index)throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("ll is empty");
		}
		if(index<0||index>this.size)
		{
			throw new Exception("invalid index");
		}
		Node temp=this.head;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	public int fun1(int k)throws Exception
	{
		Node r=getnodeat(this.size-k-1);
		return r.data;
	}

	public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
int count=0;
client2 g=new client2();
int item;
while(count!=-1)
{
	item=sc.nextInt();
	//p.data=sc.nextInt();
	g.addlast(item);
	count=item;
	
	}
int k=sc.nextInt();
System.out.println(g.fun1(k));
g.display();	// TODO Auto-generated method stub


}
}
