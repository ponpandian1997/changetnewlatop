package week1.day3.assignments;

import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Number = {3,2,11,4,6,7};
		
		Arrays.sort(Number);
		System.out.println(Number[Number.length-2]);
		

	}

}
