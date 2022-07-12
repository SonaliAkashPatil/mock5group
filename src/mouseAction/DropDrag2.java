package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDrag2 {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://facebook.com/");
		 
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 Thread.sleep(5000);
		 
		 WebElement days = driver.findElement(By.id("day"));
		 
		 Actions act=new Actions(driver);
		 
		 act.click(days).perform();
		 Thread.sleep(1000);
		 
		 for(int i=0; i<=9; i++)
		 {
			 act.sendKeys(Keys.ARROW_DOWN).perform();
			 Thread.sleep(1000);
		 }
		 
		 act.sendKeys(Keys.ENTER).perform();
		 
		 
		 //first name in capital
		 WebElement firstname = driver.findElement(By.name("firstname"));
		 //firstname.sendKeys("Sonali");//by we method
		 
		 act.sendKeys(firstname,Keys.SHIFT).sendKeys("vi").keyUp(Keys.SHIFT).sendKeys("shwaraj").build().perform();
		 	 

	}

}
