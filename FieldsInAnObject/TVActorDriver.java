package FieldsInAnObject;

public class TVActorDriver
{
    public static void main( String[] args )
    {
        TVActor a = new TVActor();
        a.name = "Thomas Middleditch";
        a.role = "Richard Hendricks";
        a.rating = "good";
        
        TVActor b = new TVActor();
        b.name = "Martin Starr";
        b.role = "Bertram Gilfoyle";
        b.rating = "better";
        
        TVActor c = new TVActor();
        c.name = "Kumail Nanjiani";
        c.role = "Dinesh Chugtai";
        c.rating = "best";

        System.out.println( a.name + " played " + a.role + " and it was " + a.rating);
        System.out.println( b.name + " played " + b.role + " and it was " + b.rating);
        System.out.println( c.name + " played " + c.role + " and it was " + c.rating);
    }
}