package TestCasesVerification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//1.WebDriver declared
//2.Find WebElement
//3.Ele --> action perform
//4.constructor declare

public class PomLoginPage 
{
	//1.WebDriver declared
	WebDriver driver;
	
	//2.Find WebElement
	@FindBy(xpath="//input[@id=\"user-name\"]")
	WebElement username;

	@FindBy(xpath="//input[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@id=\"login-button\"]")
	WebElement login;
	
	//3.Ele --> action perform
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	public void sendlogin()
	{
		login.click();
	}
	
	//4.constructor declare
	public PomLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
