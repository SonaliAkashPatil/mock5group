package setPositionBrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
		
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://facebook.com/");
		 
		 System.out.println(driver.manage().window().getSize()); // o/p(1050,708)size of browser

		 //to set size need object dimension class
		 
		 Dimension d=new Dimension(1200, 708);
		 driver.manage().window().setSize(d);
		 	 
	}

}
