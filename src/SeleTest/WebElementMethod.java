package SeleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			driver.findElement(By.xpath("//input[@type='radio']")).click();

			//1.send key()
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi this is java");
			
			Thread.sleep(1000);
			//2.clear()
			//driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
			
			//3.click()
			driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
			
			//4.get text()
			String output = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText();
			
		    System.out.println(output);
		    //5.IsEnable()
		    //6.IsSelected()
		    //7.IsDisabled()
		

	}

}
