package week3.day4;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		
		String learnings = "We learn java basics as part of java sessions in java week1";	
		
		String[] arr = learnings.split("  ");
		       for(int i=0; i<arr.length-1; i++)
		{
			   for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i].equalsIgnoreCase(arr[j]))
					arr[j]="";
				
			   }
				
			 }
		
		        for (int i = 0; i < arr.length; i++) 
			    System.out.println(arr[i] + "");
		
		}
	}
