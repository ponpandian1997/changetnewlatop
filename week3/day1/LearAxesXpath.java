package week3.day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearAxesXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	     //get the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    //enter username
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("demosalesmanager");
		//enter password
		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.xpath("(//label[text()='Username']/following::input)[3]")).click();
		
				
				
			}
		
		
		
	}


