// Bank Account class demonstrating encapsulation for deposit and withdrawal.
public class Account
{
      private double balance=0;
      public Account()
      {
      balance = 0;
      }
  
      public Account(double balance)
      {
      this.balance = balance;
      }
  
      public double getBalance()
      {
      return balance;
      }
  
      public void deposit(double amount)
      {
      balance = balance + amount;
      System.out.println("deposit: " + amount);
      }
  
      public void withdraw(double amount)
      {
      balance = balance - amount;
      System.out.println("withdrawal: " + amount);
      }
}
