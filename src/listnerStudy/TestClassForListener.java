package listnerStudy;

import java.io.IOException;

import org.testng.Assert;
//import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import kitePomUsingProperties.kitePinPageExcel;
import kitePomUsingTestng.KiteHomExcel;
import kitePomUsingTestng.KiteLogInExcel;



@Listeners(listnerStudy.ListenerForFailMethod.class)
public class TestClassForListener extends BaseListner
{
	KiteHomExcel home;
	KiteLogInExcel login;
	kitePinPageExcel pin;
	String TCID="12345";
	
	
  @BeforeClass
  public void launchBrowser() throws IOException, InterruptedException 
  {
	  openBrowser();
	  Thread.sleep(2000);
	  Reporter.log("launching Browser",true);
	  login= new KiteLogInExcel(driver);
	  pin=new kitePinPageExcel(driver);
	  home=new KiteHomExcel(driver);
  }
  
  @BeforeMethod
  public void loginToKiteApp() throws IOException, InterruptedException 
  {
	      //Thread.sleep(2000);
	     login.sendUserName1(UtilityListener.GetDataFromPropertyFile("UN"));
	     login.sendPassword(UtilityListener.GetDataFromPropertyFile("PWD"));
	     login.clickLogInButton();
	     Thread.sleep(1000);
	     
	     pin.sendpin(UtilityListener.GetDataFromPropertyFile("PIN"));
	     pin.continueButton();
	    
	     Thread.sleep(1000);
  }
  
  @Test
  public void validateUserID() throws IOException 
  {
	     Reporter.log("Validate User ID Tc is Fail Take Screenshot ",true);
	     Assert.fail();
	     Assert.assertEquals(home.getActualUserName(),UtilityListener.GetDataFromPropertyFile("UN"));
	     UtilityListener.captureScreenshot(driver, TCID);
	     
  }
  
  @AfterMethod
  public void logOutFromKite() throws InterruptedException 
  {
	  Reporter.log("LogOut From Kite App ",true);
	      home.logOut();
	        
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  driver.close();
	  Reporter.log("Close the browser ",true);
  }
}
