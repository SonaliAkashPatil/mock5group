package listBoxStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listBStudy {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.name("firstname")).sendKeys("sonali");
		Thread.sleep(10000);
		
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		Thread.sleep(10000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("8329416937");
		Thread.sleep(10000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("SonaliPatil");
		Thread.sleep(10000);
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		Select s=new Select(day);
		Thread.sleep(10000);
		
		s.selectByVisibleText("1");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1=new Select(month);
		Thread.sleep(10000);
	    s1.selectByVisibleText("Apr");
		
		WebElement year = driver.findElement(By.name("birthday_year"));

		Select s2=new Select(year);
		Thread.sleep(1000);
		s2.selectByValue("1994");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(1000);
	}

}
