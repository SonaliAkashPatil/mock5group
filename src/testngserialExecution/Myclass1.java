package testngserialExecution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Myclass1
{
	@Test
	public void MyMethod1()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
	
	 RemoteWebDriver driver=new ChromeDriver();
				
	driver.manage().window().maximize();
			
	 driver.get("https://facebook.com/");
	}
}
