package stack;

public class clientdynamic {

	public static void main(String[] args)throws Exception {
	dynamicstack k=new dynamicstack(5);
	for(int i=1;i<=5;i++)
	{
		k.push(i*10);
	}
	k.display();
	k.push(60);
	k.push(70);
	k.display();

	}

}
