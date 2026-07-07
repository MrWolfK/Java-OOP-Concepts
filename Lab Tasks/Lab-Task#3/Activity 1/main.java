public class main 
{
public static void main(String[] args) 
  {
Circle c1 = new Circle();
Circle c2 = new Circle();
c1.setRadius(5);
System.out.println("Circumference of Circle#1 is: "+c1.CalcCircum());
double r = c1.getRadius();
c2.setRadius(25);
System.out.println("Circumference of Circle#1 is: "+c2.CalcCircum());
  }
}
