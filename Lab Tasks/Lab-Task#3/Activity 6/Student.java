// Student class demonstrating encapsulation and array processing to find average marks.
public class Student 
{
private String name;
private int[] ansArr;
      public Student(String name, int[] ansArr)
      {
      this.name = name;
      this.ansArr = ansArr;
      }
  
      public String getName()
      {
      return name;
      }
  
      public int[] getansArr()
      {
      return ansArr;
      }
  
      public double average()
      {
      int total = 0;
      for (int i=0; i<ansArr.length;i++)
        {
      total = total + ansArr[i];
        }
        
      return total/ansArr.length;
    }
}
