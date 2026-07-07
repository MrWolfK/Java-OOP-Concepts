public class main {
public static void main(String[] args)
  {
        HotDogStand stand1 = new HotDogStand(1, 0);
        HotDogStand stand2 = new HotDogStand(2, 0);
        HotDogStand stand3 = new HotDogStand(3, 0);
        stand1.sold();
        stand1.sold();
        stand1.sold();
        stand1.sold();
        stand2.sold();
        stand2.sold();
        stand2.sold();
        stand3.sold();
        stand3.sold();
        stand3.sold();
        System.out.println("Stand " + stand1.getStandID() + " sold: " + stand1.getHotDogsSold() + " hot dogs");
        System.out.println("Stand " + stand2.getStandID() + " sold: " + stand2.getHotDogsSold() + " hot dogs");
        System.out.println("Stand " + stand3.getStandID()+" sold: " + stand3.getHotDogsSold() + " hot dogs");
    }
}
