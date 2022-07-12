package hardAssertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TrueStudy
{
  @Test
  public void myClass() 
  {
	  boolean a=true;
	  
	  Assert.assertTrue(a,"value of a is false then test case is fail");
	  Reporter.log("value of a is true then test case is pass");
  }
  
  
  @Test
  public void myClass1() 
  {
	  //Assert.fail();
	  
	  boolean a=false;
	  
	  Assert.assertFalse(a,"value of a is true then test case is fail");
	  Reporter.log("value of a is false then test case is pass");
  }
  
  
}   
