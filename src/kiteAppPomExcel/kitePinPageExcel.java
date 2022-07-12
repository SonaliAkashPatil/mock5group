package kiteAppPomExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitePinPageExcel 
{
	 //1. data member
		@FindBy(id="pin")private WebElement PIN;
		@FindBy(xpath="//button[@type='submit']")private WebElement contiNueButton;
		
		
		//2. constructor
		public kitePinPageExcel(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3. methods
		
		public void sendpin(String Pin) 
		{
			PIN.sendKeys(Pin);
		}
		public void continueButton()
		{
			contiNueButton.click();
		}
		

}
