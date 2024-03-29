package week4.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LearnWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.leafground.com/dashboard.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        //Locate the table //table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']
        WebElement table = driver.findElement(By.xpath("//div[@id='j_idt154_content']/table"));
    
        //Row count
    
        List<WebElement> rowCount = table.findElements(By.tagName("tr"));
       
        //column count
        List<WebElement> columnCount = table.findElements(By.tagName("th"));
     
        System.out.println("Row Size :"+rowCount.size());
        
        System.out.println("column Count :"+columnCount );
    
		
		
		

	}

}
