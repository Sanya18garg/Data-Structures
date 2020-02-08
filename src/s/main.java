package s;
import java.util.*;
class k
{
	public void heapify(int arr[],int n,int i)
	{
	int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[l]>arr[i])
		{
			largest=l;
		}
		if(r<n && arr[r]>arr[largest])
		{
			largest=r;
	   }
		if(largest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
		
		heapify(arr,n,largest);
		}
	}
	public void display(int n,int arr[])
	{
		for(int i=0;i<n;i++)
		{
			
			
				System.out.print(arr[i]);
			
		}
	}
	public void insert_h(int arr[],int i)
	{
		
		int parent=0;
		int temp=0;
		if(i%2!=0)
		{
		 parent=i/2;
		}
		else
		{
			parent=(i-1)/2;
		}
		if(arr[parent]<arr[i])
		{
			temp=arr[parent];
			arr[parent]=arr[i];
			arr[i]=temp;
			insert_h(arr,parent);
		}
		
	}
}
public class main {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int s=(n/2)-1;
	int arr[]=new int[n+1];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	k j=new k();
	for(int i=s;i>=0;i--)
	{
		j.heapify(arr,n,i);
	}
int last=arr[n-1];
arr[0]=last;
	n=n-1;
	j.heapify(arr,n,0);
	
	//int h=sc.nextInt();
	//n=n+1;
	//arr[n-1]=h;
	//j.insert_h(arr,n-1);
	//for(int i=n-1;i>=0;i--)
	//{
		//int t=arr[i];
		//arr[i]=arr[0];
		//arr[0]=t;
		//j.heapify(arr,i,0);
	//}
//int	k=sc.nextInt();
	
	j.display(n,arr);
	
}
}
