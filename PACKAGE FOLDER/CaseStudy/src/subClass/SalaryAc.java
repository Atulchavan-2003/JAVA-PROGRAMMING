package subClass;

import supClass.Account;

public class SalaryAc extends Account {
	int monthNO;
	double salaryLimit;
	SalaryAc(int acNo, String hName, double b, int monthNO, double salaryLimit) {
		super(acNo, hName, b);
		this.monthNO = monthNO;
		this.salaryLimit = salaryLimit;
	}
	int getMonthNO() {
		return monthNO;
	}
	void setMonthNO(int monthNO) {
		this.monthNO = monthNO;
	}
	double getSalaryLimit() {
		return salaryLimit;
	}
	void setSalaryLimit(double salaryLimit) {
		this.salaryLimit = salaryLimit;
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
