// HotDogStand class demonstrating encapsulation and tracking hot dogs sold.
public class HotDogStand
{
private int standID;
private int hotDogsSold;
        public HotDogStand(int standID, int hotDogsSold)
        {
        this.standID = standID;
        this.hotDogsSold = hotDogsSold;
        }
  
        public int getStandID()
        {
        return standID;
        }
  
        public int getHotDogsSold()
        {
        return hotDogsSold;
        }
  
        public void sold()
        {
        hotDogsSold++;
        }
}
