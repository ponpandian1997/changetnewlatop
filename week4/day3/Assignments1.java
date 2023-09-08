package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments1 {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
        driver.get("https://html.com/tags/table/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Locate The Table
        WebElement table = driver.findElement(By.xpath("//div[@class='render']/table"));
      //Row count
        List<WebElement> rowCount = table.findElements(By.tagName("tr"));
     //column count
        List<WebElement> columnCount = table.findElements(By.tagName("th"));
        System.out.println("Row Size :"+rowCount.size());
        
        System.out.println("column Count :"+columnCount.size());
    
		}
	}
