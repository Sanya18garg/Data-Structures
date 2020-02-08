package binarytree;

import java.util.Scanner;


public class treefrominorderndpostorder {
	class Node
	{
		int data;
		Node left;
		Node right;
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
	class Index
	{
		int tree;
	}

	Node buildtree(int in[],int post[],int n)
	{
		Index c=new Index();
		c.tree=post.length-1;
		return buildtree1(in,post,0,n-1,c);
	}
	private Node buildtree1(int in[],int post[],int start,int end,Index c)
	{
	if(start>end)
	{
		return null;
	}
	Node t=new Node(post[c.tree]);
	(c.tree)--;
	if(start==end)
	{
		return t;
	}
	int y=search(in,start,end,t.data);
	
	t.right=buildtree1(in,post,y+1,end,c);
	t.left=buildtree1(in,post,0,y-1,c);
	return t;
	
	
	
	}
	int search(int in[],int start,int end,int value)
	{
		int j;
		for(j=start;j<=end;j++)
		{
			if(in[j]==value)
			{
				return j;
			}
		}
		return j;
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

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		treefrominorderndpostorder c=new treefrominorderndpostorder();
		Node v=c.buildtree(arr, arr2,n);
		c.preorder(v);

	}

}
