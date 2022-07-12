package testngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodKey
{
  @Test
  public void Z()
  {
	  Reporter.log("Z is Running", true);
  }
  
  @Test(dependsOnMethods= {"L"})
  public void C()
  {
	  Reporter.log("C is Running", true);
  }
  
  @Test//(timeOut=100)
  public void L() throws InterruptedException 
  {
	 // Thread.sleep(1000);
	  Reporter.log("L is Running", true);
  }
  
  @Test
  public void A() 
  {
	  Reporter.log("A is Running", true);
  }
  
}
