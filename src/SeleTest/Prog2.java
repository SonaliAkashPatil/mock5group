package SeleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//driver.close();// close current open tab of browser opened by selenium. 
		
		//driver.quit();// close all the tab present in browser opened by selenium tool
		
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		driver.navigate().to("https://www.amazon.in"); //page navigate to another url.
		
		driver.navigate().back();//navigate back to 1st page
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		//System.out.println(output);
		
		//driver.findElement(By.xpath("//input[@type='radio']")).click();

		//driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi am Sonali");
		
		//driver.findElement(((WebElement) By.xpath("[2]")).click();
		
		//driver.getCurrentUrl();
		//System.out.println(driver.getCurrentUrl());
	}

}
