package BankP;



import supClass.Account;

public class Bank {
	int count=0;
	String BankName;
	Account[] arr = new Account[50];
	
	Bank( String bankName) {	
		BankName = bankName;	
	}

	void addAccount(Account acc) {
		arr[count++] = acc;
		System.out.println("Accout add successfull ");
	}
	
	void removeAccount(int acNO) {
		
		for(int i = 0; i<count;i++) {
			if(arr[i].accountNo == acNO) {
				for(int j = i; j<count-1;j++) {
				 	arr[j]=arr[j+1];
				}
				count--;
				System.out.println("Account removed successfull "+acNO);
				return;
			}
		}
	}
	
	void findAccount(int acNo) {
		for(int i = 0;i <count;i++) {
			if(arr[i].accountNo == acNo ) {
				arr[i].display();
				return;
			}
		}
	}
	void genRateReport() {	
		for(int i = 0;i<count;i++) {
			arr[i].display();
			arr[i].displayTransactions();
		}
	}
	
}
