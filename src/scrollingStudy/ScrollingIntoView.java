package scrollingStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
		 // direct scroll to view web element present on page
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
				
		 driver.get("https://vctcpune.com/");
		 
		 Thread.sleep(1000);
		 
		 // find particular element from web page
		 
		 WebElement ccbranch = driver.findElement(By.xpath("//strong[text()='Chinchwad Branch']"));
		 
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		j.executeScript("arguments[0].scrollIntoView(true)",ccbranch);
		
		Thread.sleep(1000);
		
		
		
	}

}
