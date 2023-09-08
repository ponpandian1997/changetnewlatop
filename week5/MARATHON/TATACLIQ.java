package week5.MARATHON;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TATACLIQ {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notfications");
		ChromeDriver driver =new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launch The Browser
		driver.get("https://www.tatacliq.com/");
		Thread.sleep(2000);
		 //mousover to brands	
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));	
		Actions builder =new Actions(driver);
		builder.moveToElement(brands).perform();
		
		//driver.findElement(By.xpath("//div[@id='bannerContainer']")).click();
		//driver.findElement(By.xpath("//select[@label='New Arrivals']")).click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
