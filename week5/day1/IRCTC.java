package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) {
		
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// click on Fights
		driver.findElement(By.xpath(" //a[text()=' FLIGHTS ']")).click();
		//Get The Tittle of The Current Page
		System.out.println(driver.getTitle());
		//Open the New window by using window handles 
		//step :1 store into set the Session Id
		Set<String> windowHandles = driver.getWindowHandles();
		//step :2 convert the set Session Id Into List
		List<String> trainwindow =new ArrayList<String>(windowHandles);
		//step :3  Change The Driver Control
		driver.switchTo().window(trainwindow.get(1));
		//Verify control is Changing or Print the Current Page
		System.out.println(driver.getTitle());
		//switch to MainWindow and close the main window maintain air ticketwind
		driver.switchTo().window(trainwindow.get(0));
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
