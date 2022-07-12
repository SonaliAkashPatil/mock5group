package scrollingStudy;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollingUsingSelenium {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
				
		 driver.get("https://vctcpune.com/");
		 
		 Thread.sleep(1000);
		 
		 JavascriptExecutor j=((JavascriptExecutor)driver);
		 
		 j.executeScript("window.scrollBy(80,500)");  //scroll automatically by changing x and y co-ordinate value
		 
		 Thread.sleep(1000);
		 
		 j.executeScript("window.scrollBy(180,1000)");

   
	}

}
