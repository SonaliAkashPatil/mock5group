package softAssertStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert 
{
  @Test
  public void myMethod()
  {
	  SoftAssert soft =new SoftAssert();
	  
	  String a="abcd";
	  String b="abcd";
	  
	  //soft.assertNotEquals(a, b, "value of a and b is equal then test case is fail");
	  //Reporter.log("value of a and b is  not equal then test case is pass",true);
	  
	  soft.assertNull(b, "value of b is null test case is fail");
	 // Reporter.log("value of a and b is  not null then test case is pass",true);
	  
	  soft.assertEquals(a, b, "values are not matching test case is fail");
	 // Reporter.log("value of a and b is equal then test case is pass",true);
	  
	  soft.assertAll();  // to achieve all the verification point
  }
  
  @Test
  public void myMethod1()
  {
	  SoftAssert soft =new SoftAssert();
	  
	  String a="abcd";
	  String b="abcd";
	  
	  soft.assertNotEquals(a, b, "value of a and b is equal then test case is fail");
	  Reporter.log("value of a and b is  not equal then test case is pass",true);
  } 
}
