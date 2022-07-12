package testngKeywords;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tryPriority 
{
  @Test
  public void tcase() 
  {
	  Reporter.log("test case is running", true);
  }
  
  @BeforeMethod//(priority= -7)......>>not applicable to decide the priority to before method
  public void Before2()
  {
	  Reporter.log("Before method  2 is running",true);
  }

  
  @BeforeMethod
  public void Before1()
  {
	  Reporter.log("Before method 1 is running",true);
  }

}
