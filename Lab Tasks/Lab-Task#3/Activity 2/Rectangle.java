// Rectangle class demonstrating encapsulation for length and width.
public class Rectangle
{
  
private double length, width;
  
        public Rectangle()
        {
        length = 5;
        width = 7;
        }
  
        public Rectangle(double length, double width)
        {
        this.length = length;
        this.width = width;
        }
  
        public void setLength(double L)
        {
        length = L;
        }
        public double getLength()
        {
        return length;
        }
        public void setWidth(double W)
        {
        width = W;
        }
  
        public double getWidth()
        {
        return width;
        }
        public double area()
        {
        return (length*width);
  }
}
