package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		WebDriver driver=new ChromeDriver();
				
			Thread.sleep(1000);
			
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

			Thread.sleep(1000);
			
			driver.switchTo().frame("iframeResult");
			
			driver.findElement(By.xpath("//button[@type='button']")).click();
			
			Thread.sleep(10000);
			
			driver.switchTo().parentFrame();// to switch focus to parent frame
			
			Thread.sleep(10000);
			
			String str = driver.findElement(By.xpath("//h2[text()='My First JavaScript']")).getText();
		    System.out.println(str);
		    
		    
	}

}
