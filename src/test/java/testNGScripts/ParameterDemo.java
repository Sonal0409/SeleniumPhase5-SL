package testNGScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser() throws MalformedURLException
	{

		driver = new ChromeDriver();
		
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
