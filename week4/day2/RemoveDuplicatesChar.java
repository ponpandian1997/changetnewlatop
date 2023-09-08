package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesChar {

	public static void main(String[] args) {

     // Declare a String as "PayPal India"
		String cname="PayPal India";
		
		char[] charArray = cname.toCharArray();
		
		Set<Character> charset =new LinkedHashSet<Character>();
		Set<Character> dupcharset =new LinkedHashSet<Character>();
		
		for (Character character : charArray)
	//if the character is already in the charSet then, add it to the dupCharSet
			if(charset.contains(character))
				
				dupcharset.add(character);
			else
	//Check the dupCharSet elements and remove those in the charSet
                charset.add(character);
		      System.out.println("after removing" +dupcharset + "from" + charset);
		      charset.removeAll(dupcharset);
		      System.out.println(charset);
		      for (Character character : charset) 
		      {
				if(character !=' ') 
					System.out.print(character);
					
			}
				
		      
			
			
			}
			
		}

  
