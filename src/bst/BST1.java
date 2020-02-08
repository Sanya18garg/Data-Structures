package bst;

import java.util.Scanner;


public class BST1 {
	class Node
	{
		int data;
		Node left;
		Node right;
	}
	Node root;
	public void insert(int item)
	{
		Node p=new Node();
		p.data=item;
		if(root==null)
		{
			root=p;
		}
		else
		{
			Node parent=null;
			Node t=this.root;
			while(t!=null)
			{
				parent=t;
				if(t.data<p.data)
				{
					t=t.right;
				}
				else
				{
					t=t.left;
				}
			}
			if(parent.data>p.data)
			{
				parent.left=p;
			}
			else
			{
				parent.right=p;
			}
		}
		
	}
	public static Node findMaximum(Node node) {
		while (node.right != null) {
			node = node.right;
		}

		return node;
	}
	public Node presuccessor(int key)
	{
		return  presuccessor(this.root,key,null);
	}
	
	private Node presuccessor(Node node,int key,Node prec)
	{
		if(node==null)
		{
			return prec;
		}
		if(node.data==key)
		{
			if(node.left!=null)
			{
				return findMaximum(node.left);
			}
		}
		else if(key<node.data)
		{
		return presuccessor(node.left,key,prec);
		}
		else
		{
			prec=node;
			return presuccessor(node.right,key,prec);
		}
		return prec;
	}
	public int min(Node node)
	{
		if(node.left!=null)
		{
			node=node.left;
		}
		return node.data;
	}
	public int successor(int key)
	{
		return su(this.root,key,null);
	}
	public int su(Node node,int key,Node suc)
	{
		if(node==null)
		{
			return 0;
		}
		if(node.data==key)
		{
			if(node.right!=null)
			{
			return min(node.right);
			}
		}
		else if(key<node.data)
		{
			suc=node;
			return su(node.left,key,suc);
		}
		else
		{
			return su(node.right,key,suc);
		}
		return suc.data;
	}


	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	BST1 s=new BST1();
	for(int i=0;i<n;i++)
	{
		int item=sc.nextInt();
		s.insert(item);
	}
	int key=sc.nextInt();
	//Node p=s.presuccessor(key);
	System.out.print(s.successor(key));

	}

}
