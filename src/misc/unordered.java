package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unordered {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://www.google.com/");

		 //Thread.sleep(10000);
		 
		 driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("pune univercity");
		 Thread.sleep(10000);
		 
		 List<WebElement> searchresult = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
         System.out.println(searchresult.size());
		 
		 Thread.sleep(10000);
		 
		 //for each loop getting text only
		 for(WebElement sr:searchresult)
		 {
			 System.out.println(sr.getText());
		 }
		 
		 for(WebElement result:searchresult)
		 {
			 String actualresult = result.getText();
			 String exceptedresult = "pune university convocation";
		 
		 
		    if(actualresult.equals(exceptedresult))
		    {
			   result.click();
			   break;
		    } 
		    Thread.sleep(10000);
	     }
	
	
	     driver.findElement(By.linkText("images")).click();
}
}
