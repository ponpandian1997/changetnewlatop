package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		
		List <String> companyName =new ArrayList<String>();
		
		companyName.add("Hp");
		 companyName.add("Testleaf");
	        companyName.add("Qeagle");
	        companyName.add("CTS");
	        companyName.add("TCS");
	        companyName.add("Qeagle");
	        companyName.add("google");
	        companyName.add("google");
	        companyName.add("GOOGLE");
	        //print my list
	        System.out.println(companyName);
	        //arrange the list
	        Collections.sort(companyName);
	        //after sort print list
	        System.out.println(companyName);
	        //size of list
	        System.out.println(companyName.size());
	        //particular element
	        System.out.println(companyName.get(5));
	        //remove element
	        System.out.println(companyName.remove(8));
	        //clear
	        //companyName.clear();
	        //isEmpty
	        System.out.println(companyName.isEmpty());
	        System.out.println(companyName);
	        System.out.println(companyName.contains("TCS"));
	        List <String> companyName1 =new ArrayList<String>();
	         companyName1.add("WIPRO");
	         companyName1.addAll(companyName);
	
	        boolean removeAll = companyName1.removeAll(companyName);
	        System.out.println(removeAll);
	        System.out.println(companyName.removeAll(companyName1));
	        System.out.println(companyName1);
		
		

	}

}
