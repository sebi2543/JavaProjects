package Phone;

public abstract  class Apple extends Phone {

   protected   static final String operationSystem ="IOS" ;
   protected   static final String chargeType ="Lightning";
   protected   String color;

    public void seeOperationSystem(){
        System.out.println( Apple.operationSystem );
    }

    public Apple( String color ){
        this.color = color;
    }
}
