package stack;

import java.util.*;

public class max_of_stack {
    int least = 0;
    int y = 0;
    max_of_stack( int max , int x)
    {
        least = max ;
        y = x;
    }
    Scanner sc = new Scanner( System.in );
    Stack<Integer> main = new Stack();
    Stack<Integer> max = new Stack() ;
    Stack<Integer> min = new Stack();
    
 public void max(){
        max.push(least);
        System.out.println(" Enter no of inputs ");
           int n = sc.nextInt() ;
           for( int i=0 ; i<n ; i++ )
           {
               int item = sc.nextInt();
               main.push(item);
               int maxsofar = max.peek();
           
           if( item > maxsofar )
           {
              max.push(item);
           }
           else
           {
               max.push(maxsofar);
               
           }
           
   
    }
           System.out.println("Max value: "+max.peek());
 }
 public void min(){
        min.push(y);
        System.out.println(" Enter no of inputs ");
           int n = sc.nextInt() ;
           for( int i=0 ; i<n ; i++ )
           {
               int item = sc.nextInt();
               main.push(item);
               int minsofar = min.peek();
           
           if( item < minsofar )
           {
              min.push(item);
           }
           else
           {
               min.push(minsofar);
               
           }
           }
           System.out.println("Min Value :"+ min.peek());
 }
}
