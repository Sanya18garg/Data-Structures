package stack;

import java.util.*;

public class infix_to_postfix {
    public static void main( String args[] )
    {
        Scanner sc = new Scanner( System.in );
        int top = 0 ; 
        String infix = sc.next(); 
        String postfix = "";
        Stack<Character> stack = new Stack();
        infix = infix + ")";
        stack.push('(');
        check x = new check() ;
        
        for( int i=0 ; i < infix.length() ; i++ )
        {
            if( infix.charAt(i) >= 'a' && infix.charAt(i) <= 'z' )
            {
                postfix = postfix + infix.charAt(i);
            }
            else if ( infix.charAt(i) == '(' )
            {
                stack.push('(');
            }
            else if ( infix.charAt(i) == ')' )
            {
                char ch = stack.pop();
                
                while ( ch != '(' )
                {
                    postfix = postfix + ch ;
                    ch = stack.pop();
                }
            }
            else
            {
                char ch = stack.pop();
                
                while( x.priority(ch) >= x.priority(infix.charAt(i)) )
                {
                postfix = postfix + ( ch + " " );
                ch = stack.pop();
                }
                stack.push(ch);
                stack.push(infix.charAt(i));
               
            }
        }
        System.out.println(postfix);
    }
}