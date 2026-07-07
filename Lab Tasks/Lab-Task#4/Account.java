// Base Account class with basic deposit and withdrawal functionality.
public class Account
{
      public String title;
      public int num;
      public double bal;
      public Account(String title, int num, int bal)
          {
          this.title = title;
          this.num = num;
          this.bal = bal;
          }
  
      public void withdraw(double amt)
          {
          if (bal>amt)
          {
          bal = bal - amt;
          }
          else
          {
          System.out.println("Error, Insufficient Balance!!! ");
          }
        }
  
      public void deposit(double amt)
      {
      bal = bal + amt;
      }
}
