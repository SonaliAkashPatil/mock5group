package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		 WebElement textBox = driver.findElement(By.id("autocomplete"));
		// textBox.sendKeys("Mock GROP 5");  //using webelement method
		 
		 //create actions of object class
		 Actions act =new Actions(driver);
		 act.sendKeys(textBox, "Good Morning").perform();
		 
		 // how to be handle list box using action class
		 WebElement DropDown = driver.findElement(By.id("dropdown-class-example"));
		 
		 act.click(DropDown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	}

}
