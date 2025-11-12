package b1;

public class Testbank {

	public static void main(String[] args) {
		BankAccount ac = new BankAccount(10);
		try {
			ac.withdraw(11);
		}catch(InsufficientfundsException e) {
			System.out.println(e);
		}
	}

}
