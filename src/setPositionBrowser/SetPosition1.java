package setPositionBrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
		
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://facebook.com/");

		 System.out.println(driver.manage().window().getPosition()); //o/p is (10,10)position
		 
		 // to set position create object of point class and pass x,y coordinate
		 Point p=new Point(100,5);
		 driver.manage().window().setPosition(p);

	}

}
