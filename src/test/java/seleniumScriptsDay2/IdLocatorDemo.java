package seleniumScriptsDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");

		// find the inputbox and perfoem action on it
		
	// to find an element we use method findElement(By.locatorname("value")).actionMethod();
		
		driver.findElement(By.id("wpName1")).sendKeys("admin");
	// find the password textbox and enter data
		
	driver.findElement(By.id("wpPassword1")).sendKeys("admin@123");
		
		
	}

}














