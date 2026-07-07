// Magazine subclass extending LibraryItem and overriding late fee calculation.
public class Magazine extends LibraryItem 
{
private static int itemName;
  
      public Magazine(int itemID, String itemName) 
      {
      super(itemID, itemName);
      Titems++;
      }
  
      public Magazine(int publicationDate) 
      {
      super(publicationDate, itemID, itemName);
      }
  
      @Override
      public double calculateLateFee(int days) {
      return days * 0.5;
      }
}
