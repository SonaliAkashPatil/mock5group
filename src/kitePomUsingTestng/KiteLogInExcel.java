package kitePomUsingTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogInExcel 
{
	    //1. data member
	
		@FindBy(id="userid") private WebElement userName;
		@FindBy(xpath="//input[@type='password']")private WebElement password;
		@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;
		
		//2. constructor initialization web element 
		public KiteLogInExcel(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//3. methods
		public void sendUserName1(String UserName)
		{
			userName.sendKeys(UserName);
		}
		
		public void sendPassword(String PassWord)
		{
			password.sendKeys(PassWord);
		}
		
		public void clickLogInButton()
		{
			loginbutton.click();
		}   
	
}
