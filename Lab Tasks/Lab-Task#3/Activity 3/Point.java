// Point class demonstrating encapsulation and moving 2D coordinates.
public class Point
      {
      private int x,y;
      public Point()
      {
      x=0;
      y=0;
  }
      public Point(int a, int b)
       {
      x=a;
      y=b;
      }
        
      public void Xset(int a)
       {
      x=a;
      }
        
      public void Yset(int b)
       {
      y=b;
       }
        
      public int Xget()
      {
      return x;
      }
        
      public int Yget()
       {
      return y;
       }
        
      public void display()
      {
      System.out.println("X Coords: " + x);
      System.out.println("Y Coords: " + y);
      }
        
      public void movePoint(int a, int b)
      {
      x=x+a;
      y=y+b;
      }
}
