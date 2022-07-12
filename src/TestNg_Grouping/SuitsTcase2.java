package TestNg_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SuitsTcase2 
{
	 @Test(groups={"Sanity"})
	  public void p()
	  {
		Reporter.log("P is running ", true);  
	  }
	  
	  @Test(groups = {"Regression"})
	  public void q()
	  {
		Reporter.log("Q is running ", true);  
	  }
	  
	  @Test(groups = {"Regression"})
	  public void r()
	  {
		Reporter.log("R is running ", true);  
	  }
	  
	  @Test(groups={"Sanity"})
	  public void s()
	  {
		Reporter.log("S is running ", true);  
	  }
}
