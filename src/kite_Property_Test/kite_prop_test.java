package kite_Property_Test;

import java.io.IOException;
//import java.sql.Driver;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kitePomUsingProperties.kitePinPageExcel;
import kitePomUsingTestng.KiteHomExcel;
import kitePomUsingTestng.KiteLogInExcel;
import kite_Property_Base.BaseProperty;
import kite_Property_Utility.UtilityProperty;
//import kite_utility.Utility;

public class kite_prop_test extends BaseProperty
{
	KiteHomExcel home;
	KiteLogInExcel login;
	kitePinPageExcel pin;
	String TCID="444";
	
	
  @BeforeClass
  public void launchBrowser() throws IOException 
  {
	  openBrowser();
	  Reporter.log("lounchiong Browser ",true);
	  login= new KiteLogInExcel(driver);
	  pin=new kitePinPageExcel(driver);
	  home=new KiteHomExcel(driver);
  }
  
  @BeforeMethod
  public void loginToKiteApp() throws IOException, InterruptedException 
  {
	     login.sendUserName1(UtilityProperty.GetDataFromPropertyFile("UN"));
	     login.sendPassword(UtilityProperty.GetDataFromPropertyFile("PWD"));
	     login.clickLogInButton();
	     Thread.sleep(1000);
	     
	     pin.sendpin(UtilityProperty.GetDataFromPropertyFile("PIN"));
	     pin.continueButton();
	    
	     Thread.sleep(1000);
  }
  
  @Test
  public void validateUserID() throws IOException 
  {
	     Assert.assertEquals(home.getActualUserName(),UtilityProperty.GetDataFromPropertyFile("UN"));
	     UtilityProperty.captureScreenshot(driver, TCID);
  }
  
  @AfterMethod
  public void logOutFromKite() throws InterruptedException 
  {
	      home.logOut();
	        
  }
  
  @AfterClass
  public void closeBrowser() 
  {
	  driver.close();
  }
}
