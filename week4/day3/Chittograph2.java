package week4.day3;


import java.time.Duration;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chittograph2 {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
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
				Set<String> securityname =new TreeSet<String>();
				
				//print the only  the security names
				     for (int i = 1; i < rows.size(); i++) {
					   String name = driver.findElement(By.xpath("//div[@class='table-responsive']//tbody/tr[" +i+ "]//td[1]")).getText();
					   securityname.add(name);
					   }
				     System.out.println("security names :");
				     for (String string : securityname) {
				    	 System.out.println(string);
						
					}


	}}


