 package kiteAppPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogIN 
{
    //1. data member
	
	@FindBy(id="userid") private WebElement username;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;
	
	//2. constructor initialization web element 
	

	public KiteLogIN(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. methods
	public void sendUserName()
	{
		username.sendKeys("ELR321");
	}
	
	public void sendPassword()
	{
		password.sendKeys("Dhana1111");
	}
	
	public void clickLogInButton()
	{
		loginbutton.click();
	}
}
