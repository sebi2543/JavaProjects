package week4.car;

import week4.Behavior;

public class Tiguan extends Volkswagen {

    public Tiguan( int tyreSize, int availableFuel ){
        super( 5, tyreSize, availableFuel );
    }

    @Override
    public void drive( int distance ){
        super.drive( distance );
    }
}
