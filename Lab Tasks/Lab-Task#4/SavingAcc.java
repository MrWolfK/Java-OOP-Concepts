// Main class to test the SavingAcc inheritance, profit calculation, and withdrawal.
public class SavingAcc extends Account
{
  
        public SavingAcc(String title, int num, int bal)
        {
        super(title, num, bal);
        }
  
        public double calculateProfit(double profit)
        {
        profit = bal * 0.075;
        bal = bal + profit;
        return profit;
        }
  
        @Override
        public void withdraw(double amt)
        {
        if (bal>amt)
        {
        bal = bal - amt;
        }
          
        if (bal<10000)
        {
        bal = bal - 250;
        }
    }
}
