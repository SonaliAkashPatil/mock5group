package waitStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IimplicitWait {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//1. normal wait west remaining time 
		//Thread.sleep(1000);//.....>>100ms...>>1900msis west time

		//2. execution time is minimize 
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.close();
		
	}

}
