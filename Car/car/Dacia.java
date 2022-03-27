package week4.car;

import week4.car.Car;

public abstract class  Dacia extends Car {

    protected Dacia(int  consumptionPer100Km, int tyreSize, int availableFuel){
        super(consumptionPer100Km, tyreSize, availableFuel );
    }

    /**
     * it computes how much a Dacia car consumes
     * @param distance represents the distance car has traveled.
     */
    public  void drive( int distance) {
        this.consumedFuel += consumeOfGear( distance ) + super.computeConsumption( distance );
    }
    /**
     it computes how much fuel a Dacia car consumes depending on the gear
     @param distance represents the distance car has traveled.
     */
    protected double consumeOfGear( int distance ){
        return ( this.currentGear-1 ) * 0.002 * distance;
    }
}
