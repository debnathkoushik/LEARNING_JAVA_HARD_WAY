package FieldAccess;

public class FieldAccessDriver
{
    public static void main( String[] args )
    {
        Field j = new Field("Robert", "Parker", "Butch");
        System.out.println(j.getFullName());
    
        j.setLast("Elliott");
        j.setFirst("Samuel");
        j.setNick("Sam");
        System.out.println(j.getFullName());
    
        j.first = "Avery";
        // j.last = "Markham";
        System.out.println(j.nick);
    }
}