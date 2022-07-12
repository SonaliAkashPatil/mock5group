package tableReading;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableReading {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		 // to find total number of rows
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']//tr"));
		 int TotleNOfRow = rows.size();
		 System.out.println("Total number of row's " +TotleNOfRow);
		 System.out.println("******************************");
		 
		 // to find total number of column
		 List<WebElement> column = driver.findElements(By.xpath("//table//tr[1]//th"));
		 int TotalNColumn = column.size();
		 System.out.println("Total number of column's "+TotalNColumn);
		 System.out.println("******************************");
		 
		 // how to read header
		 for(WebElement hdr:column)
		 {
			 System.out.println(hdr.getText() +" ");
		 }
		
		 // how to read all row's from table
		 List<WebElement> AllRowName = driver.findElements(By.xpath("//table//tr"));
		 Iterator<WebElement> it = AllRowName.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next().getText()+" ");
		 }
		 
	}

}
