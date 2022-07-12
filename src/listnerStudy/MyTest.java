package listnerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listnerStudy.Listener.class)
		
public class MyTest {
     @Test
     public void A() 
     {
	    Reporter.log("A is running ", true); 
	 }
     
     @Test
     public void B() 
     {
    	 Assert.fail();
	    Reporter.log("B is running ", true); 
	 }
     
     @Test(dependsOnMethods = {"B"})
     public void C() 
     {
	    Reporter.log("C is running ", true);  
	 }
     
}
