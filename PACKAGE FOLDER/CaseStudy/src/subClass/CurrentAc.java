package subClass;

import supClass.Account;

public class CurrentAc extends Account{
	double overDroftLimit;
	static int intrestRate;
	static {
		intrestRate = 7;
	}
	CurrentAc(int acNo, String hName, double b, double overDroftLimit) {
		super(acNo, hName, b);
		this.overDroftLimit = overDroftLimit;
	}
	double getOverDroftLimit() {
		return overDroftLimit;
	}
	void setOverDroftLimit(double overDroftLimit) {
		this.overDroftLimit = overDroftLimit;
	}
	static int getIntrestRatec() {
		return intrestRate;
	}
	static void setIntrestRatec(int intrestRatec) {
		CurrentAc.intrestRate = intrestRatec;
	}


	public void display() {
		super.display();
		System.out.println("overDraft Limit "+this.overDroftLimit);
		System.out.println("intrestRate "+intrestRate);
	}
	@Override
	public void withdrow(double amt) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deposit(double amt) {
		// TODO Auto-generated method stub
		
	}
	
}
