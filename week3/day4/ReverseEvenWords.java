package week3.day4;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		 String test ="Im a software engineer";
		 String[] split = test.split("  ");
		 
	     for (int i = 0; i < split.length; i++) 
	   {
		     if(i%2!=0)
			 System.out.println(split[i]);	
		    
	  else		
		  {
		
		     char[] ch = split[i].toCharArray();
			 for (int j= ch.length-1; j>=0; j--) 
		     System.out.println(ch[j]);
				} 
	
	        System.out.println("  ");
	     }
	   }
	}
   
