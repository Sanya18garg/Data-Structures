package array;
import java.util.*;
public class Bubblesort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the size of the array ");
        int m=sc.nextInt();
        int arr[] = new int[m];
        for( int i=0 ; i<m ; i++)
        {
            arr[i] = sc.nextInt();
        }
        one o=new one();
       int ans[]= new int[m];
      o.check( arr );
    }
}
class one
{
    
   public void check( int arr[] )
   {
     for( int k=0 ; k<arr.length-1 ; k++ )
     {
       for( int i=0 ; i<arr.length-k-1 ; i++ )
       {
               if( arr[i] > arr[i+1])
               {
                   int temp;
                   temp = arr[i];
                   arr[i]=arr[i+1];
                   arr[i+1] = temp;
               }
           
       }
   }
       for( int i=0 ; i<arr.length ; i++)
       {
           System.out.println(arr[i]);
       }
   }
}