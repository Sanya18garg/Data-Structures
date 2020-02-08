package HEAP1;



import java.util.Scanner;

public class heap {
	public void buildheap(int arr[],int n)
	
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
		int l=2*i+1;
		int r=2*i+2;
		if(l<n&&arr[l]<arr[largest])
		{
			largest=l;
		}
		if(r<n&&arr[r]<arr[largest])
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
		buildheap(arr,n);
		for( int i=n-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	public void insert(int arr[],int n,int x)
	{
		n=n+1;
		arr[n-1]=x;
		insert(arr,n-1);
	}
	public void insert(int arr[],int i)
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
	public void display(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		//1 3 5  4 6 13 10 9 8 15 17
				//17 15 13 9 6 5 10 4 8 3 1
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				heap h=new heap();
				int arr[]=new int[n];
				for(int i=0;i<n;i++)
				{
				arr[i]=sc.nextInt(); 
				
				}
				int x=sc.nextInt();
				h.buildheap(arr,n);
				h.insert(arr,n,x);
				//h.heapsort(arr, n);
				h.display(arr, n);

	}

}
