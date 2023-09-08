package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		
		 int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer> numbers = new LinkedHashSet<Integer>();
		System.out.println("Duplicate Numbers Are");
		for (int i = 0; i < data.length; i++) {
			if(numbers.contains(data[i]))
				System.out.print(data[i]);
			else
				numbers.add(data[i]);
			
		}
		
	}

}
