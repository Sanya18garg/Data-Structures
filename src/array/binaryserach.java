package array;

import java.util.Scanner;

public class binaryserach {
int search(int arr[],int l,int r,int x)
{
	if(r>=l)
	{
		int mid=l+(r-1)/2;
		if(arr[mid]==x)
		{
			return mid;
		}
		else if(arr[mid]>x)
		{
			return search(arr,l,mid-1,x);
		}
		else
		{
			return search(arr,mid+1,r,x);
		}
	}
	return -1;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		binaryserach s=new binaryserach();
		int x=sc.nextInt();
		int x1=s.search(arr,0,n-1,x);
		if(x1==-1)
		{
			System.out.print("element not found");
		}
		else
		{
			int y=x-1;
			System.out.print(y);
		}

	}

}
