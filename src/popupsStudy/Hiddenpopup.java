package popupsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenpopup {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://www.flipkart.com/");

		 Thread.sleep(10000);
		 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		 Thread.sleep(10000);

		 driver.findElement(By.name("q")).sendKeys("redmi 10 prime mobile");
		 Thread.sleep(10000);

		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(10000);
		 
		 


	}

}
