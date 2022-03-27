package week4;

public class Main {
    public static void main(String[] args) {
    Behavior behavior = new Logan( 16,50 );
    behavior.start();
    behavior.shiftGear(2);
    behavior.drive(100);
    behavior.shiftGear(5);
    behavior.drive(200);
    behavior.shiftGear(6);
    behavior.drive(56);
    behavior.stop();
    System.out.println( behavior.getAvailableFuel() );
    System.out.println( behavior.getAverageConsumption() );

    Behavior behavior1 = new Golf4(15,100);
    behavior1.start();
    behavior1.shiftGear(2);
    behavior1.drive(100);
    behavior1.shiftGear(6);
    behavior1.drive(300);
    behavior1.stop();
    System.out.println( behavior1.getAvailableFuel() );
    System.out.println( behavior1.getAverageConsumption() );

}
}
