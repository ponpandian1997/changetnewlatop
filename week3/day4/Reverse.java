package week3.day4;

public class Reverse {

	public static void main(String[] args) {
		
		
		String input ="Amazon Devolopement Centre, Chennai";
		
	    System.out.println("string before converting the lower case" + input);
	    String stringlowerCase = input.toLowerCase();
	    System.out.println("string after converting lower case" + stringlowerCase );
	    //split and count
	    
	    String[] split = stringlowerCase.split("  ");
	    System.out.println("printing the words in reverse");
	    
	 for (int i=0; i<split.length;i++) {
		System.out.println(split[i]);
		}
	
	}

}
