package week4.car;

import week4.Behavior;
import week4.car.Dacia;

public class Logan extends Dacia  {

    public Logan( int tyreSize, int availableFuel ){
        super( 5, tyreSize, availableFuel );
    }

    @Override
    public void drive( int distance ){
        super.drive( distance );
    }
}
