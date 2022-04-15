package testNGScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	
	
WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
        driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
        driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
		
		
	}
	
	@Parameters({"username","Password"})
	
	@Test(priority='1')
	public void login(String username, String Password)
	{
		
		driver.findElement(By.id("wpName1")).sendKeys(username);
	
		driver.findElement(By.id("wpPassword1")).sendKeys(Password);
	}
	
	@Parameters({"searchInput"})
	@Test(priority='2')
	public void method2(String searchInput) throws InterruptedException
	{
   
		driver.navigate().to("https://www.google.com");
		
		// enter data in the search input box
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(searchInput);
		Thread.sleep(1500);
	}
	
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
