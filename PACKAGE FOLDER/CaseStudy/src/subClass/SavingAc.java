package subClass;

import supClass.Account;

class SavingAc extends Account{
	double minBalance;
	static int intrestRate;
	
	static {
		intrestRate = 9;
	}

	SavingAc(int acNo, String hName, double b, double minBalance) {
		super(acNo, hName, b);
		this.minBalance = minBalance;
	}

	double getMinBalance() {
		return minBalance;
	}

	void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	static int getIntrestRate() {
		return intrestRate;
	}

	static void setIntrestRate(int iRate) {
		intrestRate = iRate;
	}
	
    public void deposit(double amt) {
    	
    }
    public void withdrow(double amt) {
    	
    }
	
    public void display() {
    	super.display();
    	System.out.println("min balance "+this.minBalance);
    	System.out.println("intrestRate "+intrestRate);
    }

	
	
}
