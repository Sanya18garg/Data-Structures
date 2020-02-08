package GRAPH;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class graph {
	
	static class gra
	{
		int v;
		LinkedList<Integer> d[];
		gra(int v)
		{
			this.v=v;
			d=new LinkedList[v];
		
		for(int i=0;i<v;i++)
		{
			d[i]=new LinkedList<Integer>();
		}
		}
	}
	public static void addegde(gra g,int src,int desc)
	{
		g.d[src].add(desc);
		//g.d[desc].add(src);
	}
	public static void bfs(gra g,int s)
	{
		LinkedList<Integer> q=new LinkedList();
		boolean visited[]=new boolean[g.v];
		visited[s]=true;
		q.add(s);
		while(q.size()!=0)
		{
			s=q.poll();
			System.out.print(s+" ");
			Iterator<Integer> s1=g.d[s].listIterator();
			while(s1.hasNext())
			{
				int n=s1.next();
				if(!visited[n])
				{
				visited[n]=true;
				q.add(n);
				}
			}
			
			
		}
		
		
	}
	public static void dfs(gra g,int s)
	{
		boolean visited[]=new boolean[g.v];
		dfs1(g,s,visited);
	}
	public static void dfs1(gra g,int s,boolean visited[])
	{
		visited[s]=true;
		System.out.print(s+" ");
		Iterator<Integer> i=g.d[s].listIterator();
		while(i.hasNext())
		{
			int n=i.next();
			if(!visited[n])
					{
				dfs1(g,n,visited);
					}
		}
	}
	
	
	public static boolean iscyc(gra g)
	{
		boolean visited[]=new boolean[g.v];
		for(int i=0;i<g.v;i++)
		{
			visited[i]=false;
		}
		for(int i=0;i<g.v;i++)
		{
			if(!visited[i])
			{
				if(iscycg(g,i,visited,-1))
				{
					return true;
				}
				
			}
		}
		return false;
	}
	public static boolean iscycg(gra g,int i,boolean visited[],int y)
	{
		visited[i]=true;
		Integer k;
		Iterator<Integer> t=g.d[i].iterator();
		while(t.hasNext())
		{
			k=t.next();
			if(!visited[k])
			{
				if(iscycg(g,k,visited,i))
				{
					return true;
				}
			}
			else if(k!=y)
			{
				return true;
			}
		}
		return false;
		
	}
	public static void printgraph(gra g)
	{
		for(int i=0;i<g.v;i++)
		{
			System.out.println("Vertex"+i);
			System.out.print("head");
			for(Integer h:g.d[i])
			{
				System.out.print(h+"->");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		gra g=new gra(v);
		 addegde(g,1,0); 
	        addegde(g,0,2); 
	        addegde(g,2,1); 
	        addegde(g,0,3); 
	        addegde(g,3,4); 
	        //addegde(g,3, 3); 
	  
	        if (iscyc(g)) 
	            System.out.println("Graph contains cycle"); 
	        else
	            System.out.println("Graph doesn't contains cycle");
	       gra g2 = new gra(3); 
	        addegde(g,0, 1); 
	        addegde(g,1, 2); 
	        if (iscyc(g2)) 
	            System.out.println("Graph contains cycle"); 
	        else
	            System.out.println("Graph doesn't contains cycle"); 
        // print the adjacency list representation of  
        // the above graph 
       // printgraph(g); 
        //bfs(g,2);
	       // dfs(g,2);
		

	}

}
