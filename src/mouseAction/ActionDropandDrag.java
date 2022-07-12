package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDropandDrag {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 //1. find source element and store it in reference variable
		 WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));

		 //2. find destination element and store it in reference variable
		 WebElement destination = driver.findElement(By.xpath("(//div[@id='shoppingCart4'])[2]"));
		 
		 //Drag and Drop using action class and pass driver as a object
		 
		 Actions act=new Actions(driver);
		// act.dragAndDrop(source, destination).perform();
		 
		 act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
		
		 //1st way
		/* act.moveToElement(source).perform();
		 act.clickAndHold().perform();
		 act.moveToElement(destination).perform();
		 act.release().perform();    */
		 
		 //2nd way
		/* act.moveToElement(source).perform();
		 act.clickAndHold().perform();
		 act.moveToElement(destination).release()act.build().perform();      */
	}
	

}
