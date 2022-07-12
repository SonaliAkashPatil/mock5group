package TestNg_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SuitsTcase1 
{
  @Test(groups={"Sanity"})
  public void a()
  {
	Reporter.log("A is running ", true);  
  }
  
  @Test(groups = {"Regression"})
  public void b()
  {
	Reporter.log("B is running ", true);  
  }
  
  @Test(groups = {"Regression"})
  public void c()
  {
	Reporter.log("C is running ", true);  
  }
  
  @Test(groups={"Sanity"})
  public void d()
  {
	Reporter.log("D is running ", true);  
  }
}
