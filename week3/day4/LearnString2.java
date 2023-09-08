package week3.day4;

import java.util.Iterator;

public class LearnString2 {

	public static void main(String[] args) {
		

		String s4 ="test leaf is super started in 2015";
		
		//split
		
		String[] split = s4.split(" ");
		
		for(int i=0; i<split.length; i++) {
			System.out.print(split[i]);
			
		}
		//replace
		String replace = s4.replace('e', 'a');
		System.out.println(replace);
		//print only string
		System.out.println(s4.replaceAll("\\d", ""));
		//print only numbers
		System.out.println(s4.replaceAll("\\D", ""));
		//sub string
		
		
        //upper to lower case 
		String browser ="ChroMe";
		String browser2 = "edge";
		System.out.println(browser.toLowerCase());
		System.out.println(browser2.toUpperCase());
		//concat
		System.out.println(browser + browser2);
		System.out.println(browser.concat(browser2));
		
		
		
		
		
		
		
		
		
	}

}
