package week3.day3;

public class ICICIBANK extends HDFCBANK implements RBI,Banker {
	
	@Override
	public void credidcard() {
    System.out.println("your credit card id permitted");
	}
    public static void main(String[] args) {
    	
    	ICICIBANK bank =new ICICIBANK();
    	bank.Houseloan();
    	bank.Deposite();
    	bank.credidcard();
    	bank.kyc();
    	bank.withDraw();
    	bank.loan();
    	bank.reporter();
	}
    public void kyc() {
		System.out.println("submit kyc");
	}
    public void withDraw() {
		System.out.println("WITHRAW IS PERMITTED");
	}
    public void reporter() {
		System.out.println("ABOVE 10LACK NEED TO REPORT");
	}
    public void loan() {
		System.out.println("LOAN AMOUNT IS APPROVED");
	}

	
   }
