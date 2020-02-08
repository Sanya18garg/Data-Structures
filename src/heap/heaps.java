package heap;

public class heaps {

	public void buildmaxheap(int arr[],int n)
	{
		int j=(n/2)-1;
		for(int i=j;i>=0;i--)
		{
			heapify(arr,n,i);
		}
	}
	public void heapify(int arr[],int n,int i)
	{
		int largest=i;
		int l=i*2+1;
		int r=i*2+2;
		if(l<n&&arr[l]>arr[largest])
		{
			largest=l;
		}
		if(r<n&&arr[r]>arr[largest])
		{
			largest=r;
		}
		if(largest!=i)
		{
			int swap=arr[i];
			arr[i]=arr[largest];
			arr[largest]=swap;
			heapify(arr,n,largest);
		}
		
	}
	public void heapsort(int arr[],int n)
	{
		for(int i=(n/2)-1;i>=0;i--)
		{
			heapify(arr,n,i);
		}
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	public int delete(int arr[],int n)
	{
		int lastelement=arr[n-1];
		arr[0]=lastelement;
		n=n-1;
		heapify(arr,n,0);
		//int last=arr[n-1];
		//arr[0]=last;
//			n=n-1;
//			j.heapify(arr,n,0);
		return n;
		
		
	}
	public void insert(int arr[],int n,int h)
	{
		n=n+1;
		arr[n-1]=h;
		
		insert(arr,n-1);
	}
	private void insert(int arr[],int i)
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
			insert(arr,parent);
		}
	}
	
	public void ksmallest(int arr[],int k)
	{
		for(int i=0;i<k;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public void print(int arr[],int n)
	{
		for(int i=0;i<arr.length;++i)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}