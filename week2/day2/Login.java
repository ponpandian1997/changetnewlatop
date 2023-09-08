package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
	
		//setup the path and Launch the browser
		
		ChromeDriver driver =new ChromeDriver();
		
		//load the URL
		
		driver.get("http://leaftaps.com/opentaps/control/logout");
		//maximize the window
		driver.manage().window().maximize();
		//findElement and enter the UserName
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//findElement and Enter the UserName
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//FindElement and ClickLogIn
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//get title
		String title = driver.getTitle();
		//print the Title
		System.out.println(title);
		
		//click CRMSFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click Leads
		driver.findElement(By.linkText("Leads")).click();
		// click create leads
		driver.findElement(By.linkText("Create Lead")).click();
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TEST LEAF");
		//enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PON PANDI");
		//enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("PANDI");
		//create click
		driver.findElement(By.name("submitButton")).click();
		// verify the text
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		// print the text
		System.out.println(text);
		
		
		
		
		

	}

}
