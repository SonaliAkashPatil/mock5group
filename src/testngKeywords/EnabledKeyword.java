package testngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledKeyword 
{
  @Test
  public void A() 
  {
	  Reporter.log("A is Running", true);
  }
  
  @Test
  public void Z() 
  {
	  Reporter.log("Z is Running", true);
  }
  
  @Test(enabled=true)//......to skip the method
  public void L() 
  {
	  Reporter.log("L is Running", true);
  }
}
