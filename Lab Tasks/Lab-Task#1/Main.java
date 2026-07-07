public class Main
{
public Main()
{}
public static void main(String args[])
{
  
      Wolf obj=new Wolf();
      int n = obj.sum(10,20);
      System.out.println("Sum=" + n);
      int m=obj.mul(5,6);
      System.out.println("mul="+m);
      int o = obj.sub (50,9);
      System.out.println("Substract ="+o);
      double p = obj.div (50,9);
      System.out.println("Division ="+p);
  }
}
