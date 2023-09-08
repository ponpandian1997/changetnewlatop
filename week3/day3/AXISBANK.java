package week3.day3;

public class AXISBANK implements RBI {

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
   public static void main(String[] args) {
	    RBI obj =new AXISBANK();
	    obj.kyc();
	    
	    AXISBANK bank =new AXISBANK();
	    bank.kyc();
	    bank.loan();
	    bank.reporter();
	    bank.withDraw();
	    }
	 }
	
	 
	
	
	
	
	
	
	
	
	
