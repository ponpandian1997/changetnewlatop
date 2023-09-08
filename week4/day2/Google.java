package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Google {

	public static void main(String[] args) {
		
		
		
		String companyname ="google";
		
		char[] ch = companyname.toCharArray();
		
		Set<Character> cname=new LinkedHashSet<Character>();
		
		for (Character character : ch) 
			{
			System.out.println(cname.add(character));
			
		}
        System.out.println(cname);
	}

 }
