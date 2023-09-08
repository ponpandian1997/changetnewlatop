package week1.day2.assignments;

public class FactoriaOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  GivenNumber = 5;
		int fact=1;
		
		for (int i=1; i<=GivenNumber; i++) {
			fact =fact*i;
			
		}
		
		System.out.println("Factorial:"+ fact);
	}

}
