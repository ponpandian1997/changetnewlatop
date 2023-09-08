package week1.day1;

public class BankAccount {

	long accountNumber=123456789;
	String holderName="pandi";
	Integer accountBalance=566;
	public void getBalance() {
		System.out.println("Balance is" + accountBalance);
		System.out.println("Acccount owner name is"+ holderName);
		
		
	}
	
	
	public static void main(String[] args) {
		
	BankAccount account= new BankAccount();
	account.getBalance();
	
	
	
	}

}
