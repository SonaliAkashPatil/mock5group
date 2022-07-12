package kiteAppPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage
{
     //1. data member
	@FindBy(id="pin")private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']")private WebElement contiNueButton;
	
	
	//2. constructor
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. methods
	
	public void sendpin() 
	{
		PIN.sendKeys("982278");
	}
	public void continueButton()
	{
		contiNueButton.click();
	}
	
}
