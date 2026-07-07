public class Stud
{
      public int regno;
      public String name;
  
      public Stud()
        {
        regno = 000;
        name = "Unknown";
        }
  
public Stud(int r, String n)
        {
        this.regno = r;
        this.name = n;
        }
public Stud(Stud s)
        {
        this.regno = s.regno;
        this.name = s.name;
        }
public void displayinfo()
        {
        System.out.println("Regno is = "+ regno);
        System.out.println("Name is "+ name);
        System.out.println("~~~~~~~~~~~");
        }
}
