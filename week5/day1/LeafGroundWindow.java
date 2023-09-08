package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWindow {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on WebElement
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//verification
		System.out.println(driver.getTitle());
		//get the current page title(current open window address)
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		//use get windowhandles for handling Next m windows
		
		//step:1 driver.getwindowhandles use when handling more than one window
		Set<String> windowHandles = driver.getWindowHandles();
		//Step:2 convert set into List
		List<String> windows = new ArrayList<String>(windowHandles);
		//Step ;Tranfer the driver Control
		driver.switchTo().window(windows.get(1));
		//verify the control is changing or not
		System.out.println(driver.getTitle());
		//Close the Current page
		driver.close();
		//In Window Handling we get only one exception that NoSuchElement Exception
		//System.out.println(driver.getTitle());--we Get NoSuchElement Exception
		//Switch Back Into MainWindow
		driver.switchTo().window(windows.get(0));
		System.out.println(driver.getTitle());
		//Close All Open Window
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
