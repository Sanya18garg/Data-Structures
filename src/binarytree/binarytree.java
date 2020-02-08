package binarytree;
import java.util.*;
public class binarytree {
	Scanner sc=new Scanner(System.in);
	private class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data,Node left,Node right)
		{
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
		private Node root=null;
		private int size=0;
	
	binarytree()
	{
		//Scanner sc=new Scanner(System.in);
		this.root=inputType(sc,null,false);
	}
	private Node inputType(Scanner sc,Node parent,boolean isleftorright)
	{
		if(parent==null)
		{
			System.out.print("Enter data for root node");
		}
		else
		{
			if(isleftorright)
			{
				System.out.println("Enter the data for the left child"+parent.data);
			}
			else
			{
				System.out.println("Enter the data for the right child"+parent.data);
			}
			
		}
		int nodedata=sc.nextInt();
		Node node=new Node(nodedata,null,null);
		this.size++;
		boolean choice=false;
		System.out.println("Do you want a left child of "+node.data);
		choice=sc.nextBoolean();
if(choice)
{
	node.left=inputType(sc,node,true);
}
choice =false;
System.out.println("Do you want a right child of "+node.data);
choice=sc.nextBoolean();
if(choice)
{
node.right=inputType(sc,node,false);
}

		return node;
	}
	public void display()
	{
		this.display(this.root);
	}
	public void display(Node node)
	{
		String str="";
		if(node.left!=null)
		{
			str=str+node.left.data+"=>";
		}
		else
		{
			str=str+"END=>";
		}
		str=str+node.data;
		if(node.right!=null)
		{
			str=str+"<="+node.right.data;
		}
		else
		{
			str=str+"<=END";
		}
		
		System.out.println(str);
		if(node.left!=null)
		{
			this.display(node.left);
		}
		if(node.right!=null)
		{
			this.display(node.right);
		}
		
		
	}
	public int height()
	{
		return this.height(this.root);
	}
	public int height(Node node)
	{
		if(node==null)
		{
			return -1;
		}
		int lheight=this.height(node.left);
		int rheight=this.height(node.right);
		int max=Math.max(lheight, rheight)+1;
		return max; 
	}
	public void preorder()
	{
		this.preorder(this.root);
	}
	public void preorder(Node node)
	{
		if(node==null)
		{
			return ;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	public void inorder()
	{
		this.inorder(this.root);
	}
	public void inorder(Node node)
	{
		if(node==null)
		{
			return ;
		}
		inorder(node.left);
		System.out.print(node.data+" ");
		
		inorder(node.right);
	}
	public void postorder()
	{
		this.postorder(this.root);
	}
	public void postorder(Node node)
	{
		if(node==null)
		{
			return ;
		}
		
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
	}
}
	


