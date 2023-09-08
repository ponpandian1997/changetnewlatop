package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailWebTable {

	public static void main(String[] args) {


		ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.leafground.com/table.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        //locate the element
         WebElement table = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table"));
         
          List<WebElement> Rowcount = table.findElements(By.xpath("tr"));
         
         //print the row count
         
         System.out.println("total row count is" + Rowcount.size() );
		
	}

}
