package testNGScripts;

import org.testng.annotations.Test;

public class TestAnnotations {
	
	// @Test annotation
	// @beforeMethod
	
	@Test(priority='1')
	public void login()
	{
		System.out.println("loginto the application");
	}
	
    @Test(priority='2')
	public void ComposeEmail()
	{
		System.out.println("Compose an email");
	}
    
    @Test(priority='3')
   	public void SendEmail()
   	{
   		System.out.println("Send an email");
   	}
	

	@Test(priority='4')
	public void logout()
	{
		System.out.println("logout of application");
	}
	
	
}
