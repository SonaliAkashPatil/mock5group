package popupsStudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopupStudy {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
	   //  driver.manage().window().maximize();
		 Thread.sleep(10000);

		 driver.get("https://skpatro.github.io/demo/links/");
		
		 String mainpagID = driver.getWindowHandle();//get id of main page
		 
		 System.out.println(mainpagID);
		 
		 System.out.println("*******************************");
		 //to open child window
		 driver.findElement(By.name("NewWindow")).click();
		 Thread.sleep(10000);
		 
         //to handle multiple window get multiple ids
		 
		 Set<String> allpageID = driver.getWindowHandles();
		 
		 Iterator<String> it = allpageID.iterator(); 
//		 while(it.hasNext())
//		 {
//			 System.out.println(it.next());
//		 }
//		 
		
		 String mainpageID = it.next();//will return to main page 
		 String childpageID = it.next();//will return to child page
		 
		 System.out.println(mainpageID);
		 System.out.println(childpageID);
		
		 //to switch focus to child window
		 driver.switchTo().window(childpageID);
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
		 Thread.sleep(10000);
		 
		 driver.switchTo().window(mainpageID);
		 WebElement myelement = driver.findElement(By.xpath("//p[text()='Click below to open link in new browser window']"));
		 
		 System.out.println(myelement.getText());
	}

}
