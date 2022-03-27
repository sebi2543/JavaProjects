package main.java.ro.sci.domain;

public class SamsungS7 extends Samsung implements Behavior{

    private String androidVersion = "7";
    private final int   batteryCapacity = 35;
    private Integer remaningBattery= new Integer( batteryCapacity );
    public SamsungS7( String color,int ram ) {
        super( color, ram);
    }

    @Override
    public void sendMessage( Contact contact, String text ) {

        super.sendMessage( contact, text);
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
