package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
			WebDriver driver=new ChromeDriver();
				
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			Thread.sleep(10000);
			//driver.manage().window().maximize();
			
			//1. driver.getScreenshot
			//2. output file
			//3. source
		 	  
		   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			File destination=new File("C:\\Users\\admin\\Downloads\\MyScreensho\\MSa.png");
			
			FileHandler.copy(source, destination);
	}

}
