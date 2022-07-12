package SeleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDispleyedMe {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(5000);
		
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		
		WebElement show = driver.findElement(By.id("show-textbox"));
		
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		
		
		if(textbox.isDisplayed())
		{
			System.out.println("Thank you textbox is display");
		}
		else
		{
			System.out.println("Can't find textbox");
		}
		Thread.sleep(5000);
		hide.click();
		
		if(textbox.isDisplayed())
		{
			System.out.println("text box is already displayed");
		}
		else
		{
			System.out.println("Can not find text box");
		}
		Thread.sleep(5000);
		show.click();
		
		if(textbox.isDisplayed())
		{
			System.out.println("text box is now  displayed");
		}
		else
		{
			System.out.println("text box is not displayed");
		}
		
		
		

	}

}
