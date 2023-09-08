package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		
		 Integer[] nums ={1,2,1,2,3,4,5,4,5,6};
		 
		 Set<Integer> numbers=new LinkedHashSet<Integer>();
		 for (Integer duplicate : nums)
		
		 {
			 System.out.println(numbers.add(duplicate));
			
		}
		 //System.out.println(numbers);
		
		

	}

}
