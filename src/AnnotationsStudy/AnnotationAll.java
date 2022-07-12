package AnnotationsStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationAll
{
  @Test
  public void ValidatePin()
  {
	  Reporter.log("pin validation done",true);
  }
  
  @Test
  public void ValidateuserID()
  {
	  Reporter.log("userID validation done",true);
  }
  @BeforeMethod
  public void EnterUIdPwd()
  {
	  Reporter.log("Entered UId and Pwd is done",true);
  }

  @AfterMethod
  public void Logout()
  {
	  Reporter.log("Log Out is done",true);
  }

  @BeforeClass
  public void BrowserLaunch() 
  {
	  Reporter.log("BrowserLaunch is done",true);
  }

  @AfterClass
  public void CloseBrowser() 
  {
	  Reporter.log("CloseBrowser is done",true);
  }

}
