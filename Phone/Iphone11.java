package main.java.ro.sci.domain;

public class Iphone11 extends  Apple implements  Behavior{

   private String iosVersion= "11";
   private final int   batteryCapacity = 40;
   private  int remaningBattery= batteryCapacity;

    public Iphone11(String color) {
        super(color);
    }

    @Override
    public void sendMessage( Contact contact, String text ) {

        super.sendMessage( contact, text );
        remaningBattery--;
    }

    @Override
    public void makeCall( Contact contact ) {
        super.makeCall( contact);
        remaningBattery -= 2;
    }

    /**
     * it displays how much battery ( in hours) is available at particular moment
     */
    public  void seeHours(){
        System.out.println( this.remaningBattery );
    }
}
