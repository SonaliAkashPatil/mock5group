package hardAssertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleVerification 
{
  @Test
  public void f() 
  {
	  String a=null;	  
	  Assert.assertNull(a, "Value of a is not null then Test case is fail");
	  Reporter.log("Value of a is null then test case is pass ", true);
	
  }
  @Test
  public void myMethod()
  {
	  String b="Pune";
	  Assert.assertNotNull(b, "Value of b is null test case is fail");
	  Reporter.log("Value of b is not null then test case is pass", true);
  }
  
}