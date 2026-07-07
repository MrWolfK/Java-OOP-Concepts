// Circle class demonstrating encapsulation with radius getter and setter.
public class Circle
{
private double radius;
  
    public Circle()
    {
    radius = 7;
    }
  
    public void setRadius(double r)
    {
    radius = r;
    }
    public double getRadius()
    {
    return radius;
    }
    public void display()
    {
    System.out.println("Radius is: " + radius);
    }
    public double CalcCircum()
    {
    double a = 3.14 * radius * radius;
    return a;
  }
}
