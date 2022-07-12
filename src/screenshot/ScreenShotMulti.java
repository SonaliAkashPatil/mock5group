package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotMulti {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
			WebDriver driver=new ChromeDriver();
				
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(1000);
			//driver.manage().window().maximize();
			
			//1. driver.getScreenshot
			//2. output file
			//3. source
		 	  
		   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
		   Thread.sleep(1000);
		   
		    String str = RandomString.make(3);
		    
			File destination=new File("C:\\Users\\admin\\Downloads\\MyScreensho\\myscreenshot"+str+".png");
			Thread.sleep(1000);
			
			FileHandler.copy(source, destination);
			
			
	}

}
