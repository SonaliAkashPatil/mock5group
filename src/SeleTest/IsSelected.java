package SeleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(5000);
		
		 WebElement checkBoxOption1 = driver.findElement(By.name("checkBoxOption1"));
	    
		 //checkBoxOption1.click();
		 
	    if(checkBoxOption1.isSelected())
	    {
	    	System.out.println("check Box is already selected");
	    }
	    else
	    {
	    	checkBoxOption1.click();

	    	System.out.println("check Box is now selected");
	    }

	}

}
