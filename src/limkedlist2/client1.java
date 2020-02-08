package limkedlist2;
import java.util.*;

public class client1 {

	public static void main(String[] args)throws Exception {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		linkedlist l=new linkedlist();
		int item;
		for(int i=0;i<n;i++)
		{
			item=sc.nextInt();
		
		l.addlast(item);
		}
//		l.tocheckpalindrome();
		//int n1=sc.nextInt();
		//System.out.print(l.nthnodefromend(n1));
		//l.add(l2);
		//l.display();
		//System.out.println(l.getlast());
		//System.out.println(l.getfirst());
//		int index=sc.nextInt();
		//System.out.println("element at: "+l.getat(index));
		//System.out.println("remove element: "+l.removefirst());
		//System.out.println("remove element: "+l.removeat(index));
		//System.out.println("remove element: "+l.removelast());
		//l.insert(index);
		//l.movelasttofirst();
		//l.reversedata();
		//System.out.println("element at mid: "+l.midat());
		//l.move();
	//	linkedlist other=new linkedlist();
	//int n1=sc.nextInt();
		//int item1;
		//for(int i=0;i<n1;i++)
		//{
			//item1=sc.nextInt();
			//other.addlast(item1);
	//	}
		//l.merge(other);
		//l.sort();
		//l.display();
//int k=sc.nextInt();
//l.reverse1(k);
		//l.evenafterodd();
	//int index=sc.nextInt();
	//System.out.println(l.getnodeat(index));
		//l.duplicate1();
		//int y=sc.nextInt();
		//System.out.println(l.f());
		//l.f();
		//l.insert_sort();
		//System.out.println(l.mid());
		//l.swap();
		//l.intersection1(other);
		//l.alternateeven();
		//int m=sc.nextInt();
		//l.key(m);
		//System.out.println(l.last(index));
		//l.sum(other);
		//l.greater1();
		//int k=sc.nextInt();
	//	l.duplicate1();
		///l.duplicate();
		//l.pairwiseswap();
		//l.sort();
		//l.last(index);
		//l.ques31();
		//l.reversedata();
		//l.decimal();
		int k=sc.nextInt();
		l.rotate(k);
l.display();
	}

}
