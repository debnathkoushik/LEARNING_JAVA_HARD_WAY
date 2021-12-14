package PointSwapper;

public class PointSwapperDriver
{
    public static void main( String[] args )
    { 
        PointSwapper<Integer> pg1 = new PointSwapper<Integer>(2, 6);
        PointSwapper<Double> pg2 = new PointSwapper<Double>(1.3, 5.7);
        
        System.out.println( "\nbefore: " + pg1 );
        pg1.swap();
        System.out.println( "after: " + pg1 );
        pg1.swap();
        System.out.println( "after after: " + pg1 );
        
        System.out.println( "\nbefore: " + pg2 );
        pg2.swap();
        System.out.println( "after: " + pg2 );
        pg2.swap();
        System.out.println( "after after: " + pg2 );
    }
}