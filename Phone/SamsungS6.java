package main.java.ro.sci.domain;

public class SamsungS6 extends Samsung implements Behavior {

   private String androidVersion = "6";
   private final int   batteryCapacity = 30;
   private int remaningBattery = batteryCapacity;

    public SamsungS6( String color, int ram ) {
        super( color, ram );
    }

    @Override
    public void sendMessage( Contact contact, String text ){

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
