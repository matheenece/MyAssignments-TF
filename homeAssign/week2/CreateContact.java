package homeAssign.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
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
		
		//Click on contacts button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//Click on create contacts button
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		
		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Moha");
		
		//Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Math");
				
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Math");
		
		//Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Moha");
		
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		
		//Enter Description Field Using any Locator of your choice
		driver.findElement(By.name("description")).sendKeys("Create Contact Test Leaf");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.name("primaryEmail")).sendKeys("matheen@gmal.com");
		
		//Select State/Province as NewYork Using Visible Text
		WebElement stateDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sta1 = new Select(stateDD);
				
		//Select NewYork option using visible text
		sta1.selectByVisibleText("New York");
		
		//Click on Create Contact
		driver.findElement(By.name("submitButton")).click();
		
		//Click on edit button 
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		
		//Clear the Description Field using .clear
		driver.findElement(By.name("description")).clear();
		
		//Fill ImportantNote Field with Any text
		driver.findElement(By.name("importantNote")).sendKeys("Important test leaf doc");
		
		//Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//Get the title of resulting page
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
