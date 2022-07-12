package multiselects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectUse {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(10000);
		//driver.manage().window().maximize();
		
		WebElement multiselect = driver.findElement(By.name("cars"));
		Select s=new Select(multiselect);
		System.out.println("Multiselect is "+ s.isMultiple());
		Thread.sleep(15000);
		
		s.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		
		s.selectByValue("saab");
		Thread.sleep(1000);
		
		s.selectByIndex(2);
		Thread.sleep(1000);
		
		s.selectByValue("audi");
		Thread.sleep(1000);
		
		//s.deselectAll();
		//Thread.sleep(1000);
		
		System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		
		s.deselectByValue("audi");
		Thread.sleep(1000);
		
		s.deselectByIndex(2);
		
		s.deselectByValue("saab");
		Thread.sleep(5000);
		
		s.deselectByVisibleText("Volvo");
	    Thread.sleep(5000);
		
		s.getAllSelectedOptions();
		
	}

}
