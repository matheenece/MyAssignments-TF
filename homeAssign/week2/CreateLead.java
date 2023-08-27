package homeAssign.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		
		//Lunch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the login button
		driver.findElement(By.className("decorativeSubmit")).click(); 
		
		//Click CRM/SFA link
		driver.findElement(By.partialLinkText("SFA")).click();
		
		//Click the Leads button
		driver.findElement(By.linkText("Leads")).click();
		
		//Click the create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qulitest");
		
		//Enter the firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohammed");
		
		//Enter the lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Matheen");
		
		//Enter the first name local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Math");
		
		//Enter the department name
		driver.findElement(By.name("departmentName")).sendKeys("Technical");
		
		//Enter the description
		driver.findElement(By.name("description")).sendKeys("Create lead for new joinee");
		
		//Enter the email address
		driver.findElement(By.name("primaryEmail")).sendKeys("matheenece@gmail.com");
		
		//Select State/Province drop down
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sta1 = new Select(stateDD);
		
		//Select Florida option using visible text
		sta1.selectByVisibleText("Florida");
		
		//Click create lead button
		driver.findElement(By.name("submitButton")).click();
		
		//Get the title of resulting page
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
