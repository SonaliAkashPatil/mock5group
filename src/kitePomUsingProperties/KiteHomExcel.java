package kitePomUsingProperties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomExcel 
{
      
	 //1. data members
	  @FindBy(xpath="//span[@class='user-id']")private WebElement UserName;
	  @FindBy(xpath="//a[@target='_self']") private WebElement logOut;
	  
	  //2. constructor
	 public KiteHomExcel(WebDriver driver) 
	 {
		 PageFactory.initElements(driver,this);
	 }
	  
	 //3. method
	 
	 public void validateUserName(String expecteduserid)
	 {
	  String expectedUserName = expecteduserid;
	  String actualUserName = UserName.getText();
	  
	       if(expectedUserName.equals(actualUserName))
	       {
		     System.out.println("actual and expected user id are matching test case is pass"); 
		  
	       }
	       else
	       {
		     System.out.println("actual and expected user id are not matching test case is fail"); 
	       }
	  
	 }
	 // to get actual user name
	 
	 public String getActualUserName()
	 {
		 String actualUserName = UserName.getText();
		return actualUserName;
	 }
	 
	 
	 public void logOut() throws InterruptedException
	 {
		 UserName.click();
		 Thread.sleep(2000);
		 logOut.click();
	 }
	 
	   
}
