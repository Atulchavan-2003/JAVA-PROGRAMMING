package supClass;

public abstract class Account {
	
	String holderName;
	double Balance;
	public int accountNo;
	int txnCount = 0;
	Transaction[] tr = new Transaction[50];
	
	public Account(int acNo, String hName, double b) {
		
		this.accountNo = acNo;
		this.holderName = hName;
		this.Balance = b;
	}
	int getAccountNo() {
		return accountNo;
	}
	void setAccountNo(int acNo) {
		accountNo = acNo;
	}
	String getHolderName() {
		return holderName;
	}
	void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	double getBalance() {
		return Balance;
	}
	void setBalance(double balance) {
		Balance = balance;
	}
	
	 public void display() {
		 System.out.println("Account Number :"+this.accountNo);
		 System.out.println("Account Holder Name :"+this.holderName);
		 System.out.println("Account Balance :"+this.Balance);
	 } 
	 
	  public void displayTransactions() {
	        if(txnCount == 0) {
	            System.out.println("No transactions yet");
	        } 
	        else {
	            System.out.println("Transactions for Account: " + accountNo);
	            for(int i = 0; i < txnCount; i++) {
	                tr[i].displayTxn();
	            }
	        }
	    }
	
	 public abstract void withdrow(double amt);
	 public abstract void deposit(double amt);
	
}
