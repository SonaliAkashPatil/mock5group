package testngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityKeyword
{
	//by default priority is 0....alphabetically execute
	
  @Test
  public void C() 
  {
	  Reporter.log("C is Running", true);
  }
  
  @Test
  public void L() 
  {
	  Reporter.log("L is Running", true);
  }
  
  @Test
  public void M() 
  {
	  Reporter.log("M is Running", true);
  }
  
  @Test(priority = -2)
  public void a() 
  {
	  Reporter.log("a has -2 priority ", true);
  }
  
  @Test(priority = 7)
  public void b() 
  {
	  Reporter.log("b has 7 is Running", true);
  }

}

