package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FACEBOOK {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//maximize the window
        driver.manage().window().maximize();
        //wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        
        Thread.sleep(2000);
        
        
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ponpandi");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("poominathan");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("flgtbvr@telegmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("flgtbvr@telegmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ponpandi123");
        
     WebElement select1 = driver.findElement(By.xpath("//select[@id='day']")); 
     Select day =new Select(select1);
     day.selectByValue("28");
     
     WebElement select2 = driver.findElement(By.xpath("//select[@id='month']"));
     Select month =new Select(select2);
     month.selectByValue("5");
        
     WebElement select3 = driver.findElement(By.xpath("//select[@id='year']"));
     Select year =new Select(select3);
     year.selectByValue("1998");
     
     driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();
     driver.findElement(By.xpath("//button[@name='websubmit']")).click();
     
     
        

	}

}
