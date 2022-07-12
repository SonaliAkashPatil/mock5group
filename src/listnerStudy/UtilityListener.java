package listnerStudy;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class UtilityListener 
{
	 
	 public static String GetDataFromPropertyFile(String key) throws IOException
     {
  	   Properties prop=new Properties();
  	   FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\SeleniumStudy\\MyFile1.properties");
  	 
  	   prop.load(myfile);
  	   
  	   String value=prop.getProperty(key);
  	   
  	   return value;
  	   
     }
	 


	 public static void captureScreenshot(WebDriver driver, String TCID) throws IOException
     {
  	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  	  
        File destination=new File("C:\\Users\\admin\\Downloads\\MyScreensho\\myscreenshot"+TCID+".png");

		FileHandler.copy(src, destination);
     }
     
	
}
