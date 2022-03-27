package week4;

public interface Behavior {

    void  drive ( int distance );

    void shiftGear( int gear );

    void start( );

    void stop();

    double getAverageConsumption( );

   double  getAvailableFuel( );
}
