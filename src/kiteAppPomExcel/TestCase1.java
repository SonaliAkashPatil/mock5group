package kiteAppPomExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{    //1. for excel reading
		File myfile=new File("C:\\Users\\admin\\Documents\\velocity notes\\excelsheets\\APMpom.xlsx");
	    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String UN = mysheet.getRow(1).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(1).getCell(1).getStringCellValue();
	    String PIN1 = mysheet.getRow(1).getCell(2).getStringCellValue();
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
			
		 WebDriver driver=new ChromeDriver();
					
		 Thread.sleep(1000);
				
		 driver.get("https://kite.zerodha.com");

		 Thread.sleep(1000);
		 
		 //1. for log in page
		 KiteLogInExcel ln=new KiteLogInExcel(driver);
		 ln.sendUserName1(UN);
		 ln.sendPassword(PWD);
		 ln.clickLogInButton();
	     Thread.sleep(5000);
		 
		
		 //2. for pin button
		 kitePinPageExcel pin =new kitePinPageExcel(driver);
		 pin.sendpin(PIN1);
		 pin.continueButton();
		 
		 Thread.sleep(5000);
		 
		 //3. for home page
		 KiteHomExcel home=new KiteHomExcel(driver);
		 home.validateUserName(UN);
		 home.logOut();
		 
		 Thread.sleep(5000);
	}
}


