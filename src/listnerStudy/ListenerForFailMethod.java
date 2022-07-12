package listnerStudy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class ListenerForFailMethod implements ITestListener
{
      // BaseListner b=new BaseListner();
	   WebDriver driver;
       String TCID="12345";
       
       @Override
    public void onTestSuccess(ITestResult result) 
    {
    	   Reporter.log("TC is pass TCase name is "+result.getName(),true);
    }
       
       @Override
    public void onTestFailure(ITestResult result)
    {
    	  // String TCID = result.getName();
    	Reporter.log("TC is fail TC name is...."+result.getName(),true);
    	try
    	{
			UtilityListener.captureScreenshot(driver,TCID);
    
		} 
    	catch (IOException e) 
    	{
			e.printStackTrace();
    	}
       
    }
       @Override
    public void onTestSkipped(ITestResult result)
    {
    	   Reporter.log("TC is Skipped TC name is...."+result.getName(),true);
    }
}
