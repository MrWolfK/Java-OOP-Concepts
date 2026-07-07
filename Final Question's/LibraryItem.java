// Base LibraryItem class demonstrating encapsulation and static variable tracking.

public class LibraryItem {
private int itemID;
private String itemName;
public static int Titems = 0;
public String customerType;
private double LateFee;
private int publicationDate;
public int total;
      public LibraryItem(int itemID, String publicationDate2) 
      {
      this.itemID = itemID;
      this.itemName = publicationDate2;
      Titems++;
      }
  
      public LibraryItem(int itemID, String itemName, int publicationDate) 
      {
      this.itemID= itemID;
      this.itemName = itemName;
      this.publicationDate = publicationDate;
      Titems++;
      }
  
      public LibraryItem(LibraryItem other) 
      {
      this.itemID = other.itemID;
      this.itemName = other.itemName;
      this.publicationDate = other.publicationDate;
      Titems++;
      }
  
      public LibraryItem(int itemID2, int itemName2) 
        {}
  
// getter
public int getID() {
return itemID;
}
public String getName() {
return itemName;
}
// setter
public void setID(int itemID) {
this.itemID = itemID;
}
public void setName(String itemName) {
this.itemName = itemName;
}
  
      public double calculateLateFee(int days) 
      {
      return 0.0;
      }
  
public double calculateLateFee(int days, String userType) 
      {
      double fee = calculateLateFee(days);
      if (userType.equals("Student")) 
      {
      if (userType.equals("Student")) 
      {
      fee = fee - (fee * 0.10);
      }
      } else if (userType.equals("Regular Member")) {
      if (userType.equals("Regular Member")) {
      fee = fee - (fee * 0.05);
      }
      }
      return fee;
      }
  
    public static void displayTotalItems() 
      {
     System.out.println("Total Items: " + Titems);
      }
  
public double calculateLateFee(double LateFee, int days) 
  {

throw new UnsupportedOperationException("Unimplemented method 'calculateLateFee'");
  }
}
