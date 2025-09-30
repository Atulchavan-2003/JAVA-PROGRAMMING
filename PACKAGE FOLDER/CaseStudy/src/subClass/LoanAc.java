package subClass;

import supClass.Account;

public class LoanAc extends Account {
	

	double LoanAmt;
	
	LoanAc(int acNo, String hName, double b, double loanAmt) {
		super(acNo, hName, b);
		LoanAmt = loanAmt;
	}
	
	double getLoanAmt() {
		return LoanAmt;
	}

	void setLoanAmt(double loanAmt) {
		LoanAmt = loanAmt;
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
