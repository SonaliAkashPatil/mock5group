package kite_base1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base 
{
   protected WebDriver driver;
   
   public void openBrowser() throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
		
	   WebDriver driver=new ChromeDriver();
	   
	   ChromeOptions opt=new ChromeOptions();
	   opt.addArguments("--Disable-notification");
	   driver=new ChromeDriver(opt);
	
	   driver.get("https://kite.zerodha.com/");
	   Reporter.log("Lauching Browser.....",true);

   }
	
}
