package kite_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kitePomUsingTestng.KiteHomExcel;
import kitePomUsingTestng.KiteLogInExcel;
import kitePomUsingTestng.kitePinPageExcel;
import kite_base1.Base;
import kite_utility.Utility;

public class ValidateKiteUserID extends Base
{
	     KiteHomExcel home;
	     KiteLogInExcel login;
	     kitePinPageExcel pin;
	
  @BeforeClass
  public void LaunchBrowser() throws InterruptedException 
  {  
	     openBrowser();
	     login=new KiteLogInExcel(driver);
	     pin=new kitePinPageExcel(driver);
	     home=new KiteHomExcel(driver);
  }
  
  @BeforeMethod
  public void LogInKiteApp() throws EncryptedDocumentException, IOException, InterruptedException
  {
	     login.sendUserName1(Utility.readDataFromExcel(1,0));
	     login.sendPassword(Utility.readDataFromExcel(1,1));
	     login.clickLogInButton();
	
	     Thread.sleep(2000);
	
	    pin.sendpin(Utility.readDataFromExcel(1, 2));
     	pin.continueButton();
	
	    Thread.sleep(2000);
	
  }
  
  @Test
  public void ValidateUserID() throws EncryptedDocumentException, IOException
  {
	  Assert.assertEquals(home.getActualUserName(),Utility.readDataFromExcel(1, 0),"Actual and excepted are not matchiong test case is fail");
	  
  }
  
  @AfterMethod
  public void LogOutKiteApp() throws InterruptedException
  {
	  home.logOut();
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
