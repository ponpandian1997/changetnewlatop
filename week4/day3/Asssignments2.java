package week4.day3;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asssignments2 {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
        driver.get("https://html.com/tags/table/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Locate The Table header
        WebElement tablerow = driver.findElement(By.xpath("//div[@class='render']/table"));
        //Locate The Table body
        WebElement tablecolumn = driver.findElement(By.xpath("//div[@class='render']/table"));
        //Row count	
      	List<WebElement> rowCount = tablerow.findElements(By.tagName("tr"));   
      	//column count
      	List<WebElement> columnCount = tablecolumn.findElements(By.tagName("th"));
      	System.out.println("Row Size :"+rowCount.size());
      	System.out.println("column Count :"+columnCount.size());
      	
      	//print the Table Header
      	 String header = driver.findElement(By.xpath("//div[@class='render']/table/thead")).getText();
      	 System.out.println(header + " ");
      	//print table body
      	for (int i = 1; i < rowCount.size(); i++) 
      	for (int j = 1; j < columnCount.size() ; j++) {
    	   String text3 = driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]/td[" +j+ "]")).getText();
    	   System.out.print(text3 +" ");
    	   
      	}
      	
      		
         }
      	
      	 }
	
	



