package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class Draggable {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01h6qn4y6u7aeb175m2quvpqolw456494.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//find the element
		WebElement drag = driver.findElement(By.xpath("//div[@id='form:conpnl_content']"));
		 drag.getLocation();
		System.out.println(drag.getLocation());
		//create object for Actins
		Actions builder =new Actions(driver);
		//Actions Medhod
		builder.dragAndDropBy(drag, 159, 120).perform();
		//verify the location
		System.out.println(drag.getLocation());
		
		}

  }
