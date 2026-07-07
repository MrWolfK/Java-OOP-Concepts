public class main
{
public static void main(String args[])
{
  
    Stud s1 = new Stud();
    Stud s2 = new Stud(234, "Ahmad");
    Stud s3 = new Stud(234, "Awan");
    Stud s4 = new Stud(s2);
    
    s1.displayinfo();
    s2.displayinfo();
    s3.displayinfo();
    s4.displayinfo();
    }
}
