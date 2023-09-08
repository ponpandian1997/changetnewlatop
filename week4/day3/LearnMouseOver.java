package week4.day3;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LearnMouseOver {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       //find the element
        WebElement makeUp = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
        //Create obj for actions
        Actions builder =new Actions(driver);
        //method
        builder.moveToElement(makeUp).perform();
    
		
	}

}
