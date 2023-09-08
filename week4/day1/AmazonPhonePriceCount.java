package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPhonePriceCount {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		//search box pass input phone
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		//store the String of element change into List of Integer
	    List<Integer> sortPrice=new ArrayList<Integer>();
	    List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//print list size
	    System.out.println(price.size());
	    for (int i = 0; i < price.size(); i++) {
	    	//get all element from list as a String
	    	String text = price.get(i).getText();//" 10,999"
	    	//replace the , by empty
	    	String replaceAll = text.replaceAll("[^0-9]", "");//10999
	    	//convert string into integer
	    	int parseInt = Integer.parseInt(replaceAll);
	    	//add the converted data to new list
	    	sortPrice.add(parseInt);//element add into list
	    	}
	    //Arrange the price
	    Collections.sort(sortPrice);
	    //print the list
	    System.out.println(sortPrice);
	    //get the lowest price
	    System.out.println("lowestPrice is:" + sortPrice.get(0));
	    
		
	}

}