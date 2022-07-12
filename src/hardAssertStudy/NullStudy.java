package hardAssertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NullStudy
{
  @Test
  public void myMethod2() 
  {
	 
	  String a=null;
	 // String b="Pune"; // for fail test case
	  
	  Assert.assertNull(a, "Value of a is not null then Test case is fail");
	  Reporter.log("Value of a is null then test case is pass ", true);
 }
  
  
  @Test
  public void myMethod3() 
  {
	 // String a=null;   // for fail test case

	  String b="Pune"; 	  
	  Assert.assertNotNull(b,"Value of b is  null then Test case is fail");
	  Reporter.log("Value of b is  not null then test case is pass ", true);
	 
  }
}
