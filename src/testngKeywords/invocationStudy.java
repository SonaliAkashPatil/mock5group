package testngKeywords;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class invocationStudy
{
  @Test (invocationCount =4)
  public void TestCase1()
  {
	  Reporter.log("Test Case1 is running ", true);
  }
  
  @BeforeMethod
  public void Before()
  {
	  Reporter.log("Before method is running",true);
  }
  
}
