package tableReading;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPLTable1 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://demo.guru99.com/test/web-table-element.php");
		 
		 //to find total number of row's
		 List<WebElement> TTRow = driver.findElements(By.xpath("//table//tr"));
		 int rowsize = TTRow.size();
		 System.out.println("Total number of row's "+rowsize);
		 System.out.println("***************************");
		 
		 // to find total number of columns
		List<WebElement> TTColumn = driver.findElements(By.xpath("//table//tr[1]//th"));
		int columnsize = TTColumn.size();
		System.out.println("Total number of column's "+columnsize);
		System.out.println("***************************");
		
		// find total header
	  
	   for (WebElement hdr1:TTColumn)
	    {
		  System.out.println(hdr1.getText()+" ");
	    }
		
	   // how to read all row's from table
	   List<WebElement> rowsname = driver.findElements(By.xpath("//table//tr"));
	   Iterator<WebElement> it = rowsname.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next().getText()+" ");
	   }
	}

}
