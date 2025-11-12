package p2;

public interface Payfees {
     public void payonline();
     public default void payOffline() {
    	 System.out.println("This class ddoes not have the capability of offline payment,");
    	 this.payonline();
     }
}
