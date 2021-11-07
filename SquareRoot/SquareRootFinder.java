package SquareRoot;

public class SquareRootFinder
{

    double n;
    int iterations;
    
    public void setNumber( double number )
    {
        n = number;
        iterations = 7;
        if ( n < 10 )
        iterations++;
    }
    
    public double getRoot()
    {
        double x = n/4;
        for ( int i=0; i<iterations; i++ )
        {
            System.out.println("1st part : " + ( x+(n/x) ) + "\n");
            x = (x+(n/x))/2.0;
            System.out.println("2nd part : " + x);
        }
        return x;
    }
}