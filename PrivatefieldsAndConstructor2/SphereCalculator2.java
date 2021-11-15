package PrivateFieldsAndConstructor2;

public class SphereCalculator2
{
    private double radius, area, volume;
    
    public SphereCalculator2( double r )
    {
        radius = r;
        area = 4*Math.PI*r*r;
        volume = 4*Math.PI*Math.pow(r,3) / 3.0;
    }
    
    public double getRadius()
    {
        return radius;
    }

    public double getSurfaceArea()
    {
        return area;
    }

    public double getVolume()
    {
        return volume; 
    }
}