package b1;

public class BankAccount {
	private double balance;

	BankAccount(double balance) {
		
		this.balance = balance;
	}
	void withdraw(double amount) throws InsufficientfundsException {
		if(amount > this.balance) {
			throw new InsufficientfundsException();
		}
		else
			balance -=amount; 
			
	}
		
}
