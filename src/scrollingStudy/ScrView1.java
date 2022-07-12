package scrollingStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrView1 {

	public static void main(String[] args) throws InterruptedException
	{
		 // direct scroll to view web element present on page
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
				
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		 Thread.sleep(1000);
		 
		 // find particular element from web page
		 
		 WebElement ref = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		 
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		j.executeScript("arguments[0].scrollIntoView(true)",ref);
		ref.click();
		
		Thread.sleep(1000);
		
		WebElement ref1 = driver.findElement(By.xpath("//option[text()='Option2']"));
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		je.executeScript("arguments[0].scrollIntoView(true)",ref1);
		
		ref1.click();		
	}

}
