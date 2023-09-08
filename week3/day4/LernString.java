package week3.day4;

import java.util.Iterator;

public class LernString {

	public static void main(String[] args) {
		
		String s1 ="Testleaf";
		String s2 ="TestLeaf";
		String s3 ="Ponpandi";
		
		String str = new String("Testleaf");
		int count =0;
		
		String input = "bosepandi";
		char[] pandi = input.toCharArray();
		for(int k=0; k<pandi.length; k++) {
			if(pandi[k]=='a') {
				count++;
			}
			System.out.println(pandi[k]);
		}
		
		
		System.out.println(s1.equals(str));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1==s2);
		System.out.println(s1==str);
		System.out.println(s1.length());
		System.out.println(s1.contains(str));
		System.out.println(s1.contains("Test"));
		//charAt(index)
		System.out.println(s1.charAt(6));
		
		char[] ch = s1.toCharArray();
		for(int i=0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
			
			 char[] charArray = s3.toCharArray();
			 
			 for(int j=charArray.length-1; j>=0; j--) {
				 System.out.println(charArray[j]);
			 }
			
			
			
			
			
				
			
			
			
		
	}

}
