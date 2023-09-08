package week2.day1;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		
		int[] data = {3,2,11,4,6,7};
		
		//to get the length
		         int large=data.length;
		         System.out.println(large);
		
				//print my array
				for(int i=0; i<data.length; i++) {
					System.out.print(data[i]);
					   }
				//arrange my array
				Arrays.sort(data);
				System.out.println("order my data");
				for(int i=0; i<data.length; i++) {
					System.out.println(data[i]);
					}
				//reverse order
				for (int i=data.length-1; i>=0; i--) {
					System.out.println(data[i]);
				}
				//firt element 
				{
					System.out.println("first elemnet" + data[0]);
				}
				//last element
				{
					System.out.println("last element" + data[large-1]);
				}
				//second largest element
				{
					System.out.println("second largest elemet"  + data[large-2]);
				}
	}
}
