package week2.day1.assignments;

import java.util.Scanner;

public class Ifclass {

	public static void main(String[] args) {
		
		
int marks;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your mark (0-100) ");
		
		marks=scanner.nextInt();
		
		if (marks>=90)
			System.out.println("grade A");
		else if (marks>=80)
			System.out.println("grade B");
		else 
			System.out.println("grade c");
		
	}

}


	


