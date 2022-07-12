package mouseAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction1 {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 
         WebElement SeleniumButton = driver.findElement(By.linkText("Selenium"));
         
        //  SeleniumButton.click();
        //1. how to perform click() 
         Actions act= new Actions(driver);
         //using move to element method
         act.moveToElement(SeleniumButton).click().build().perform();//click selenium popup open
		 Thread.sleep(1000);
       
		 //using click()
		 act.click(SeleniumButton).perform();

		 //2. how to perform right click()
		// WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		// act.moveToElement(RightClick).contextClick().build().perform();
		// act.contextClick(RightClick).perform();
		 
		 //3. how to perform Double Click()
		 WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		// act.moveToElement(DoubleClick).doubleClick().build().perform();
		 act.doubleClick(DoubleClick).perform();
		 
		 //handle alert
		  Alert alt = driver.switchTo().alert();
		  alt.accept();
		  
		  
		  
		  
		  
		  
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
