package kitePomUsingProperties;

import java.io.File;
import java.io.IOException;
//import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName 
{
	WebDriver driver;
	Sheet mysheet;
    KiteLogInExcel login;
    kitePinPageExcel pin;
    KiteHomExcel home;
	
   @BeforeClass()
   public void LaunchBrowser() throws InterruptedException, EncryptedDocumentException, IOException
   {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\ChromeDriver.exe");
		
	   ChromeOptions opt=new ChromeOptions();
	   opt.addArguments("--disable-notifications");
	   driver=new ChromeDriver(opt);
	 			
	   driver.get("https://kite.zerodha.com/");
	 		
	   Reporter.log("Browser is launching", true);
	  // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   
	   Thread.sleep(1000);
	   
	   File myfile = new File("C:\\Users\\admin\\Documents\\velocity notes\\excelsheets\\APMpom.xlsx");
	   mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	   
	   login = new KiteLogInExcel(driver);
	   pin= new kitePinPageExcel(driver);
	   home= new KiteHomExcel(driver);
   }
   
   @BeforeMethod()
  public void logInKiteApp() throws InterruptedException
  {
	 String UN = mysheet.getRow(1).getCell(0).getStringCellValue();
	 String PWD = mysheet.getRow(1).getCell(1).getStringCellValue();
	 String PIN = mysheet.getRow(1).getCell(2).getStringCellValue();
	 
	 login.sendUserName1(UN);
	 Reporter.log("sending user name", true);
	 login.sendPassword(PWD);
	 Reporter.log("sending password", true);
	 login.clickLogInButton();
	 Reporter.log("clicking login button", true);
	 //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 Thread.sleep(1000);
	 pin.sendpin(PIN);
	 Reporter.log("sending pin", true);

	 pin.continueButton();
	 Reporter.log("clicking on continue button", true);

	 Thread.sleep(1000);
	// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

  }
   
  @Test
  public void ValidateUserName()
  {
	  String expectedUN = mysheet.getRow(1).getCell(0).getStringCellValue();
	  String actualUN = home.getActualUserName();
	  Reporter.log("validating user name", true);
	  
	  Assert.assertEquals(actualUN, expectedUN,"actual and expected are not matching test case is fail");
	  Reporter.log("actual and expected are matching test case is pass", true);
  }
  
  @AfterMethod()
  public void logoutFromKite() throws InterruptedException
  {
	  home.logOut();
	  Reporter.log("Loging out......", true);
  }
  
  @AfterMethod()
  public void closebrowser() throws InterruptedException
  {
	  Thread.sleep(1000);
	  Reporter.log("browser close......", true);
	  
  }
  
}

