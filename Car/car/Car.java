package week4.car;

import week4.Main;

public abstract  class Car extends Main.Vehicle   implements  Behavior  {

    protected int currentGear = 1;
    protected final double  consumptionPer100Km;
    private final int tireSize;
    private int mileage;
    protected double consumedFuel;
    private double availableFuel;
    private final double consumptionPer1km;

    protected Car( int consumptionPer100Km, int tyreSize,int availableFuel ) {
        this.consumptionPer100Km = consumptionPer100Km;
        this.tireSize = tyreSize;
        this.availableFuel = availableFuel;
        this.consumptionPer1km= (double) this.consumptionPer100Km / 100;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public int getTireSize() {
        return tireSize;
    }

    public int getMileage() {
        return mileage;
    }


    public double getConsumedFuel() {
        return consumedFuel;
    }

    public double getConsumptionPer1km() {
        return consumptionPer1km;
    }

    /**
     * it computes how much fuel will be consumed for a particular distance (Ignoring the Gear).
     * @param distance represents the distance car has traveled.
     * @return the consumed fuel.
     */
    protected  double computeConsumption( int distance ){
        this.mileage += distance;
        return  distance * this.consumptionPer1km + consumeOfTire( this.tireSize, distance );
    }

    /**
     * @param tireSize represent the size of the wheels.
     * @param distance represents the distance car has traveled.
     * @return the consumed fuel.
     */
   protected double consumeOfTire( int tireSize,int distance ){
    return (tireSize-15) * 0.002 * distance;
}

    /**
     *
     * @param gear represent the gear that is wanted.
     */
    public void shiftGear( int gear ){
        if( gear >= 1 && gear <= 6 ){
            this.currentGear = gear;
        }
    }

    /**
     * initialise the key attributes.
     */
    public void start(){
        this.mileage = 0;
        this.consumedFuel = 0;
    }

    /**
     * it computes how much fuel has been consumed since the car start driving.
     */
    public void stop(){
        this.availableFuel -= this.consumedFuel;
    }

    /**
    it computes the average consumption since the car start driving.
     */
    public double getAverageConsumption(){
        return  ( (double) this.consumedFuel*100 ) / this.mileage;
    }

    /**
     it computes how much fuel is available.
     */
    public double getAvailableFuel(){
        return this.availableFuel;
    }
}
