package homeAssign.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Add Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on create new button
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Math");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Moha");
		
		//Enter the mobile number
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[3]")).sendKeys("8562563");
		
		//Enter the password
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Password");
		
		//Handle date drop down
		WebElement DateDD = driver.findElement(By.xpath("//select[@id='day']"));
		Select sec = new Select(DateDD);
		sec.selectByIndex(10);
		
		//Handle Month drop down
		WebElement MonthDD = driver.findElement(By.xpath("//select[@id='month']"));
		Select sec1 = new Select(MonthDD);
		sec1.selectByIndex(10);
		
		//Handle year drop down
		WebElement YearDD = driver.findElement(By.xpath("//select[@id='year']"));
		Select sec2 = new Select(YearDD);
		sec2.selectByVisibleText("1989");
		
		//Select the radio button female
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
		//Close the browser
		driver.close();
		
	}
}
