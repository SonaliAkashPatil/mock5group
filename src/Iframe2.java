import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://skpatro.github.io/demo/iframes/");

		 Thread.sleep(1000);
		 
		 String test = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
		 
		 System.out.println(test);
		 
		 Thread.sleep(1000);
		
		 // switching to frame
		 
		 driver.switchTo().frame("Frame1");
		 
		 String test1 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
		 
		 System.out.println(test1);
		 
		 //switch to main page
		 
		 driver.switchTo().defaultContent();
		 Thread.sleep(1000);
		 
		 driver.switchTo().frame("Frame2");
		 
		 String test2 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
		 
		 System.out.println(test2);
		 Thread.sleep(10000);
		 
		 driver.switchTo().defaultContent();
		 Thread.sleep(10000);
		 
		 String test3 = driver.findElement(By.name("Blogger")).getText();
		 
		 System.out.println(test3);
		 Thread.sleep(1000);			
	}

}
