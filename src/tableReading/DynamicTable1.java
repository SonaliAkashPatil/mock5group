package tableReading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable1 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
		
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://www.flipkart.com/");

         driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
         
		 Thread.sleep(100);

		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("redmi note 10 pro");
		 Thread.sleep(1000);

		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(5000);

	     String review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[2]//span)[6]")).getText();
		 Thread.sleep(5000);
         System.out.println(review);
         
	}

}
