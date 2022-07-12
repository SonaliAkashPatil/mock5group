package kite_Property_Base;

import java.io.IOException;
//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kite_Property_Utility.UtilityProperty;

public class BaseProperty
{
      protected WebDriver driver;
      public void openBrowser() throws IOException
      {
          System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");

          driver=new ChromeDriver();
          
          driver.manage().window().maximize();
          
          driver.get(UtilityProperty.GetDataFromPropertyFile("URL"));
          
          //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
          
    	  
      }
}
