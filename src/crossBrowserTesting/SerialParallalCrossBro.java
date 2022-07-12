package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SerialParallalCrossBro 
{    
	WebDriver driver= null;
	
	@Parameters("BrowserName")
    @Test
  
   public void myMethod(String name) throws InterruptedException
  {
	 
				
	if(name.equals("firefox")) 
	{
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver.exe");
			
		  driver=new FirefoxDriver();
		  driver.get("https://skpatro.github.io/demo/iframes/");
	}
	
	else if(name.equals("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
			
		  driver=new ChromeDriver();
		  driver.get("https://skpatro.github.io/demo/iframes/");
	}
  }
}
