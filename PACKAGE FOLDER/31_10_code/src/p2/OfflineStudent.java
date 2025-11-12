package p2;

public class OfflineStudent implements Payfees {
		
	public void payOffline() {
		System.out.println("payfees offline");
	}

	@Override
	public void payonline() {
		System.out.println("pay fees offline Student");
	}
	
}
