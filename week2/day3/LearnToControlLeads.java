package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnToControlLeads {

	public static void main(String[] args) {
		
		ChromeOptions op =new ChromeOptions();
		
		op.setBinary("C:\\Users\\HP\\Downloads\\chrome-win64");
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
      	// Select Employee in source using By Index
      	WebElement drop1 = driver.findElement(By.className("inputBox"));
      	Select source =new Select(drop1);
        source.selectByIndex(4);
      	//Select Automobile in Market Camppaign using Visible Text
      	WebElement drop2 = driver.findElement(By.className("inputBox"));
      	Select MarketCampaign =new Select(drop2);
      	MarketCampaign.selectByVisibleText("Automobile");
      	//Select Corporation in ownership using Value
      	WebElement drop3 = driver.findElement(By.className("inputBox"));
      	Select ownership =new Select(drop3);
      	ownership.selectByValue("Corporation");
      	
      	//Click Create Lead
      	driver.findElement(By.name("submitButton")).click();
      	
       //Verify the Title
      	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
      	System.out.println(text);
      	
    
	}

}
