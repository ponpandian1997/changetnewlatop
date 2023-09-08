package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittograph {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.chittorgarh.com/");
		//click on StockMarket
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		//find the Row and Table
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']"));
	    List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<WebElement> columns = table.findElements(By.tagName("th"));
		//print the rows and column sizes
		System.out.println("number of row is:" + rows.size() );
		System.out.println("Number of Column is:" + columns.size());
		//print the only  the security names
		     for (int i = 1; i < rows.size(); i++) {
			 List<WebElement> securinames = driver.findElements(By.xpath("//div[@class='table-responsive']//tbody/tr[" +i+ "]//td[1]"));
			 System.out.println(securinames.size());
		     
			 List<String> sortname =new ArrayList<String>();
			 for (int j = 0; j < securinames.size(); j++) 
			 {
			 String text = securinames.get(j).getText();
			  sortname.add(text);
				}
			 
		//Remove Duplicate security names(convert list into Set
			Set<String> Securitysort =new TreeSet<String>(sortname); 
			 System.out.println("After Removing Duplicate names : ");
			 Object[] array = Securitysort.toArray();
			 for (int j = 0; j < array.length; j++) 
				 System.out.println(array[j]);
				
	}	}
		     
			
	}

	

	


