package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://vctcpune.com/");

		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 System.out.println(links.size());
		 
		 Iterator<WebElement> it = links.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 

	}

}
