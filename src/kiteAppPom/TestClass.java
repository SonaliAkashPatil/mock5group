package kiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://kite.zerodha.com");

		 Thread.sleep(1000);
		 
		 //1. for log in page
		 KiteLogIN login=new KiteLogIN(driver);
		 login.sendUserName();
		 login.sendPassword();
		 login.clickLogInButton();
		 
		 Thread.sleep(5000);
		
		 //2. for pin button
		 KitePinPage pin =new KitePinPage(driver);
		 pin.sendpin();
		 pin.continueButton();
		 
		 Thread.sleep(5000);
		 
		 //3. for home page
		 kiteHomePage home=new kiteHomePage(driver);
		 home.validateUserName();
		 home.logOut();
		 
		 Thread.sleep(5000);
	}

}
