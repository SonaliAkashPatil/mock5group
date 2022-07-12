package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mytest {
  @Test  //this is method
  public void eg1testng() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
		
	  WebDriver driver=new ChromeDriver();
					
	 Thread.sleep(1000);
				
	 driver.get("https://kite.zerodha.com");

     Thread.sleep(1000);
   
     
     System.out.println("Hi this method is display on console only");  
     
     Reporter.log("it is printing with log o/p display only on reporter window ");
     
     Reporter.log("this method is printing with log o/p display in console also report", true);
  }
  
  
}
