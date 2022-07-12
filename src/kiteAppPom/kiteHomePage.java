package kiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage
{
      //1. data members
	  @FindBy(xpath="//span[@class='user-id']")private WebElement UserName;
	  @FindBy(xpath="//a[@target='_self']") private WebElement logOut;
	  
	  //2. constructor
	 public kiteHomePage(WebDriver driver) 
	 {
		 PageFactory.initElements(driver,this);
	 }
	  
	 //3. method
	 
	 public void validateUserName()
	 {
	  String expectedUserName ="ELR321";
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
	 
	 public void logOut() throws InterruptedException
	 {
		 UserName.click();
		 Thread.sleep(2000);
		 logOut.click();
	 }
	 
}
