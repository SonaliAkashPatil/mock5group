package popupsStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://demoqa.com/alerts");

		 Thread.sleep(10000);
		 //1. click to find alert
		 driver.findElement(By.id("alertButton")).click();
		 
		 Thread.sleep(1000);
		 //2. accept alert
		 Alert alt = driver.switchTo().alert();
		 
		 alt.accept();
		 
		 Thread.sleep(10000);
		 
		 //3. click another pop up to find alert pop up
		 
		 driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		 
		 Thread.sleep(10000);
		 //4. get alert of close ok with text
		 Alert alt1 = driver.switchTo().alert();
		 
		 Thread.sleep(10000);
		 //5. get text present on alert
		 System.out.println(alt1.getText()); 
		 
		 Thread.sleep(10000);
		 
		 alt1.dismiss();
		 
		 
		 
		 

	}

}
