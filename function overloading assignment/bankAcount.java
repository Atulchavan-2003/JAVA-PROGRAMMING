import java.util.Scanner;

class BankAccount {

     int accountNo;
     String name;
     double balance;
    static double interestRate; //
         static {
		    interestRate = 9.3;	
		}
        BankAccount(){
	   this.accountNo = 103;
           this.name = "chavan";
	   this.balance = 1000;
	}
   
    // Constructor parameterize
    BankAccount(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    // Setters
    void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

   static void setInterestRate(double i) {
         interestRate = i;
    }

    // Getters
    int getAccountNo() {
        return this.accountNo;
    }

    String getName() {
        return this.name;
    }

    double getBalance() {
        return this.balance;
    }

    double getInterestRate() {
        return this.interestRate;
    }

     
    void display() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate );
    }
}

// Test Class
class Test{
    public static void main(String[] args) {
        
        BankAccount b1 = new  BankAccount(101,"atul",10000);
        b1.display();
	BankAccount b2 = new  BankAccount(102,"sandeep",20000);
	b2.display();
	BankAccount b3 = new  BankAccount();
	b3.display();

         BankAccount.setInterestRate(4.3);
	b3.display();
       b2.display();
      b1.display();
    }
}

