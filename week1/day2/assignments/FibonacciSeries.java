package week1.day2.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int FirstNumber =0;
		int SecondNumber =1;
		int ThirdNumber;
		int LengthOfSeries =8;
		for (int i=0; i<LengthOfSeries; i++) {
			System.out.println(FirstNumber);
			ThirdNumber =FirstNumber+SecondNumber;
			FirstNumber=SecondNumber;
			SecondNumber=ThirdNumber;
		}
	}

}
