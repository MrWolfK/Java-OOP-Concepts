public class main 
{
public static void main(String[] args)
{
      Account acc1 = new Account(8560);
      System.out.println("Account 1 bal: " + acc1.getBalance());
      Account acc2 = new Account(acc1.getBalance());
      System.out.println("Account 2 bal: " + acc2.getBalance());
      acc1.deposit(456);
      System.out.println("Account 1 after deposit: " + acc1.getBalance());
      acc1.withdraw(125);
      System.out.println("Account 1 after withdraw: " + acc1.getBalance());
      acc2.deposit(30);
      System.out.println("Account 2 after deposit: " + acc2.getBalance());
      acc2.withdraw(856);
      System.out.println("Account 2 after withdraw: " + acc2.getBalance());
}
}
