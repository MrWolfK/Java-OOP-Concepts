// Main class to test the SavingAcc inheritance, profit calculation, and withdrawal.

public class TestApp 
{
public static void main(String args[])
{
  
      SavingAcc c1 = new SavingAcc("Malik M Ahmed Awan", 900, (int) 10000);
      System.out.println("Account Title: " + c1.title + "\nAccount Number:" + c1.num + "\nBalance: " + c1.bal);
      System.out.println("Balance Before = "+c1.bal);
      c1.calculateProfit(32);
      c1.withdraw(2000);
      System.out.println("Balance Now =" + c1.bal);
  }    
}
