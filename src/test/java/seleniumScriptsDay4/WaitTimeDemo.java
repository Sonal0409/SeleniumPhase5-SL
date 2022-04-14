package seleniumScriptsDay4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// app is going to take time to load all the elements
		// you can provide a PoageLoadWait time, so that tool will wait for certain time before it executes the next step
		//Sets the amount of time to wait for a page load to complete before throwing an error.
		//If the timeout is negative, page loads can be indefinite.
		
		// implicit wait: appliend for every element
		
		//Specifies the amount of time the driver should wait when searching for an element 
		//if it is not immediately present. 
		//When searching for a single element, the driver should poll the page until the element hasbeen found,
		//or this timeout expires before throwing a NoSuchElementException. 
		//Whensearching for multiple elements, the driver should poll the page until at least one elementhas been found or this timeout has expired. 


		// Explicit wait: applied for single element
		
		// 2 details have to provided : time to wait & condition to be satisfied
		
		// 10 sec to wait
		// condition : element is visible, list of values visible, wait until checkbox is clickable
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	    
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	
    
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gmail.com");
	
	//driver.findElement(By.xpath("//input[@id='545passwd3242353534']")).sendKeys("passwd@123");
	
	
	
	WebDriverWait wait = new WebDriverWait(driver, 15);
	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='passwd']"))));
	
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("passwd@123");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	}

}
