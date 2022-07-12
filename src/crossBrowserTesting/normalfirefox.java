package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class normalfirefox 
{
  @Test
  public void firefox1() throws InterruptedException 
  {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver.exe");
		
	  WebDriver driver=new FirefoxDriver();
					
	  Thread.sleep(1000);
				
	  driver.get("https://vctcpune.com/");
	  Thread.sleep(1000);	 
  }
}
