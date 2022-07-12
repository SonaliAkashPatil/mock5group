package SeleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEle_IsEnable {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		Thread.sleep(10000);
		
		WebElement getOtp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		System.out.println(getOtp.isEnabled()); //output is false in console
		
		Thread.sleep(7000);
		driver.findElement(By.id("mobileNumber")).sendKeys("8329416937");
		
		Thread.sleep(7000);
		
		System.out.println(getOtp.isEnabled());
		getOtp.click();

	}

}
