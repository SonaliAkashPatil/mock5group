package kiteApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppTest {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://kite.zerodha.com");

		 Thread.sleep(1000);
		 //1. fined locator of required element
         WebElement userid = driver.findElement(By.id("userid"));
         WebElement password = driver.findElement(By.id("password"));
         userid.sendKeys("ELR321");
         password.sendKeys("Dhana1111");
         //login button locator 
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         Thread.sleep(5000);
         
         WebElement pin = driver.findElement(By.id("pin"));
         WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
         
         pin.sendKeys("982278");
         continueButton.click();
         Thread.sleep(5000);
		 
         WebElement UserNameid = driver.findElement(By.xpath("//span[@class='user-id']"));
         String ActualUserID = UserNameid.getText();
         String ExpectedUserID = "ELR321";
         
         if(ActualUserID.equals(ExpectedUserID))   //match excepted user id to the actual user id
         {
        	 System.out.println("UserNameid is matched test case is pass");
         }
         else
         {
        	 System.out.println("UserNameid not match then test case is fail");
         }
         
         UserNameid.click();   // to fined out logout click the user name present on web page.
         Thread.sleep(3000);
         driver.findElement(By.xpath("//a[@target='_self']")).click();   ///logout the user
         driver.close();
	}

}
