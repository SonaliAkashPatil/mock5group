package popupsStudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandl {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://www.w3schools.com/");
		 
         String mainpagID = driver.getWindowHandle();//get id of main page
		 
		 System.out.println(mainpagID);
		 
		 System.out.println("*******************************");
		 
		 driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();//try it yourself click
		 
//		 driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();//perform operation on webelement
		 
		 driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		 
//		 driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		 
		 driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[1]")).click();
		 
		 Set<String> allpageID = driver.getWindowHandles();// get all page id
		 System.out.println("total no. of id's "+allpageID.size());
		 
		 System.out.println("*******************************");
		 Thread.sleep(1000);

		 Iterator<String> it = allpageID.iterator();
		/* while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		 //if(mainpagID==)*/
		 
		 String Main_WindowId=it.next();
		 String First_WindowId=it.next();
		 String Second_WindowId=it.next();
		 String Third_WindowId=it.next();

		 //Switch focus to 3rd window
		 driver.switchTo().window(Third_WindowId);
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		 Thread.sleep(1000);
		 driver.close();
		 
		 //Switch focus to 2rd window
		 driver.switchTo().window(Second_WindowId);
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		 Thread.sleep(1000);
		 driver.close();
		 
		 //Switch focus to 1rd window
		 driver.switchTo().window(First_WindowId);
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		 Thread.sleep(1000);
		 driver.close();
		 
		 
		 
		 //Switch focus to main window
		 driver.switchTo().window(Main_WindowId);
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		 Thread.sleep(1000);
		 driver.close();
		 
		 
		 
		 
	}

}
