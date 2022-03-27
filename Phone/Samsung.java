package main.java.ro.sci.domain;

public abstract class  Samsung extends Phone {

    protected static final String operationSystem ="Android" ;
    protected static final String chargeType ="USB type C";
    protected int ram;
    private  String color;

    public void seeOperationSystem(){
        System.out.println( Samsung.operationSystem );
    }

    public Samsung( String color, int ram ){
        this.color = color;
        this.ram = ram;
    }
}
