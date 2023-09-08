package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
	   // STEP:1 LOCATE THE DROPDOWN WEBELEMENT
		WebElement drop1 = driver.findElement(By.className("ui-selectonemenu"));
	   //STEP 2-- INSTANTIATE THE SELECT CLASS
		Select tools =new Select(drop1);
	    //Call select class method to pick the option from the dropdown
		//tools.selectByIndex(3);
		//tools.selectByVisibleText("Playwright")
		tools.selectByValue("ui-selectonemenu-label");
		
		

	}

}
