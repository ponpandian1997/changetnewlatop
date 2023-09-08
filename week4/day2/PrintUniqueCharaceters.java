package week4.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharaceters {

	public static void main(String[] args) {
		
		String name = "ponpandi";
		
		char[] ch = name.toCharArray();
		
		Set<Character> unique = new LinkedHashSet<Character>();
		
		for (Character charac : ch) {
			
			if(unique.contains(charac))
				
				unique.remove(charac);
				
				else
					unique.add(charac);
			}
		
		System.out.println("unique characters are" + unique);
		}

}
