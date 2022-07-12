package kiteApp;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{     System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
	      File myfile=new File("C:\\Users\\admin\\Documents\\velocity notes\\excelsheets\\dynamic1.xlsx");    
	       
	      Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	      String UN = mysheet.getRow(10).getCell(0).getStringCellValue();
	      String PWD = mysheet.getRow(10).getCell(1).getStringCellValue();
	      String PIN = mysheet.getRow(10).getCell(2).getStringCellValue();
	      
          WebDriver driver=new ChromeDriver();
			
          Thread.sleep(1000);
		
          driver.get("https://kite.zerodha.com");

          Thread.sleep(1000);
          //1. fined locator of required element
          WebElement userid = driver.findElement(By.id("userid"));
          WebElement password = driver.findElement(By.id("password"));
           // userid.sendKeys("ELR321");    
          //  password.sendKeys("Dhana1111");
          
          //using excel sheet set user name and password
          userid.sendKeys(UN);
          Thread.sleep(1000);
          password.sendKeys(PWD);
          
 //login button locator 
          driver.findElement(By.xpath("//button[@type='submit']")).click();
          Thread.sleep(3000);
 
          WebElement pin = driver.findElement(By.id("pin"));
          WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
 
         // pin.sendKeys("982278");   
          pin.sendKeys(PIN);   // using excel send pin
          Thread.sleep(1000);
          continueButton.click();
          Thread.sleep(5000);
 
          WebElement UserNameid = driver.findElement(By.xpath("//span[@class='user-id']"));
          String ActualUserID = UserNameid.getText();
          String ExpectedUserID = UN;
 
       if(ActualUserID.equals(ExpectedUserID))   //match excepted user id to the actual user id
        {
	       System.out.println("UserNameid is matched test case is pass");
        }
      else
       {
	       System.out.println("UserNameid not match then test case is fail");
       }
 
            UserNameid.click();   // to fined out logout click the user name present on web page.
            Thread.sleep(3000);
            driver.findElement(By.xpath("//a[@target='_self']")).click();   ///logout the user
            driver.close();
	}

}
