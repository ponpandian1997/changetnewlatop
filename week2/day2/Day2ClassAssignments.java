package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2ClassAssignments {

	public static void main(String[] args) {
		
		//setup the path and launch the browser
		
		ChromeDriver driver =new ChromeDriver();
		
		// Load The URL
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
		//click on Leads
		driver.findElement(By.linkText("Leads")).click();
		//click on CREATE CLICK
		driver.findElement(By.linkText("Create Lead")).click();
		//enter the company NAME
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TVS SOLUTIONS");
		//Enter the First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PON PANDI");
		//ENTER THE LAST NAME
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("POOMINATHAN");
		//ENTER THE EMAIL ID
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pandipbose@gmail.com");
		// ENTER THE PHONE NUMBER
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8838361638");
		//click on SUBMIT
		driver.findElement(By.name("submitButton")).click();
		// CILCK ON EDIT
		driver.findElement(By.linkText("Edit")).click();
		//clear THE COMPANY NAME
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		// CHANGE THE COMPANY NAME
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("ZOHO PVT LTD");
		//CLICK UPADATE
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		
		}

}
