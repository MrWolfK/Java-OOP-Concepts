public class main 
{
public static void main(String[] args) 
{
      int[] marks1 = {77, 85, 90, 62, 88};
      int[] marks2 = {55, 70, 65, 80, 49};
      Student s1 = new Student("Ahmed", marks1);
      Student s2 = new Student("Ayeha", marks2);
      System.out.println(s1.getName()+" average: "+s1.average());
      System.out.println(s2.getName()+" average: "+s2.average());
  
      if (s1.average()>s2.average())
          {
      System.out.println(s1.getName() + " has the Highestt avg");
          }
        
      else if (s2.average()> s1.average())
          {
      System.out.println(s2.getName()+" has the HIGHER avg");
          }
        
      else
          {
            System.out.println("Both students have the SAME avg ");
          }
  
      Student s3 = new Student(s1.getName(), s2.getansArr());
      System.out.println("third student name: " + s3.getName());
      System.out.println("third student average: " + s3.average());
  
      }
}
