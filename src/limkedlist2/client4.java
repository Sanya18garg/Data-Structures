package limkedlist2;
import java.util.*;
public class client4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int item;
	circular c=new circular();
	for(int i=0;i<n;i++)
	{
		item=sc.nextInt();
		c.insert_atend(item);
	}
	c.display();

	}

}
