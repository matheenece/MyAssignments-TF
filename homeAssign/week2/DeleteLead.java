package homeAssign.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
public static void main(String[] args) throws InterruptedException 
{
		
		//Lunch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Add Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the login button
		driver.findElement(By.className("decorativeSubmit")).click(); 
				
		//Click CRM/SFA link
		driver.findElement(By.partialLinkText("SFA")).click();
		
		//Click the Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//Click find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on Phone
		driver.findElement(By.linkText("Phone")).click();
		
		//Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("8877665544");
		
		//Click find leads button
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		//Capture lead ID of First Resulting lead
		String LeadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println(LeadID);
		Thread.sleep(3000);
		
		//Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		//Click Delete
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Enter captured lead ID
		driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys(LeadID);
		
		//Click find leads button
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text);
		
		//Close the browser (Do not log out)
		driver.close();
		
		
		
		
	}
}
