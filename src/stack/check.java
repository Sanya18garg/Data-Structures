package stack;

public class check {
    public int priority ( char m )
        {
            if( m == '*' || m == '/' )
            {
                return 3;
            }
            else if( m == '+' || m == '-' )
            {
                return 2 ;
            }
            else
            {
                return 1;
            }
        }
}