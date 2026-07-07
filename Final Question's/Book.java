// Book subclass extending LibraryItem and overriding late fee calculation.

public class Book extends LibraryItem 
{
private static int itemName;
  
      public Book(int publicationDate) 
      {
      super(publicationDate, itemName);
      }
      public Book(int itemID, int itemName) 
      {
      super(itemID, itemName);
      Titems++;
      }
  
      @Override
      public double calculateLateFee(int days) 
      {
      return days * 1.0;
      }
}
