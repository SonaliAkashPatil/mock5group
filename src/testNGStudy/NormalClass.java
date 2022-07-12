package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalClass {

	public static void main(String[] args) throws InterruptedException 
	{
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://vctcpune.com/selenium/practice.html");
			
		Thread.sleep(1000);
	
		
		driver.get("https://flipkart.com/");
		
		Thread.sleep(1000);
		driver.close();
	}

}
