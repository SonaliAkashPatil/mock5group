package hardAssertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EqualsStudy
{
  @Test
  public void myMethod()
  {
	 //1. assertEquals 
	 String a="Pune"; 
	 String b="Pune"; 
	 
	 Assert.assertEquals(a, b,"a and b is not equal test case is fail");
	 Reporter.log("value of a and b is equal test case is pass",true);
  }
  
  @Test
  public void myMethod1()
  {
  //2. assertNotEquals
 
     String c="Pune1"; 
	 String d="Pune"; 
	 
	 Assert.assertNotEquals(c, d,"Value of c and d is matching then test case is fail");
	 Reporter.log("value of c and d is not matching test case is pass",true);	
  }
}
