package listnerStudy;

//import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
   @Override
   public void onTestFailure(ITestResult result)
   {
	   Reporter.log("Test is fail take ScreenShot ",true);
       
   }
    
    @Override
    public void onTestSuccess(ITestResult result)
    {
 	   Reporter.log("Test is pass ",true);
    }
    
    @Override
    public void onTestSkipped(ITestResult result)
    {
 	   Reporter.log("Test is skip check depends on method ",true);	
    }
}
