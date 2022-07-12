package SeleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxStudy {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//Thread.sleep(10000);
		//1. Identifying list box
		WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
		
		//2. create object of select class which will accept web element
		Select s=new Select(listbox);
		
		//3. one of it's select value of list box
		s.selectByVisibleText("Option3");
		
		Thread.sleep(10000);
		//s.selectByValue("Option1");
		s.selectByVisibleText("Option1");
		
		Thread.sleep(10000);
		s.selectByIndex(2);
	}	
}
