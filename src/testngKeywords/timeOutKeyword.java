package testngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeOutKeyword
{
  @Test(timeOut=10)
  public void S() throws InterruptedException 
  {
	  Thread.sleep(100);
	  Reporter.log("S is running", true);
  }


@Test
public void A() 
{
	  Reporter.log("A is running", true);
}

@Test
public void K() 
{
	  Reporter.log("K is running", true);
}

}
