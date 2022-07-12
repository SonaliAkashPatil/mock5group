package listnerStudy;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Reporter;

public class BaseListner 
{
	 protected WebDriver driver;
	   
	 public void openBrowser() throws IOException, InterruptedException
	 {
		 ChromeOptions opt=new ChromeOptions();
		 opt.addArguments("--Disable-notification");
		   
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 driver=new ChromeDriver(opt);
		
	     driver.get(UtilityListener.GetDataFromPropertyFile("URL"));
	     
		// Reporter.log("Lauching Browser.....",true);
		 
		 Thread.sleep(2000);
		 
	 }
	 
	 
}