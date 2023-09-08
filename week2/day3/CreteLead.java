package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreteLead {

	public static void main(String[] args) {
		
ChromeDriver driver =new ChromeDriver();
		
	    //maximize the window
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/login");
        
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
    
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//div[@id='label']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("pandi Automobile Store");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bosepandi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("xuv700");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("8852801941");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("pandipandi@gmail.com");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(text);
		

	}

}
