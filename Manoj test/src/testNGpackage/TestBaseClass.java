package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseClass 
{
	WebDriver driver;
@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");

	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		WebElement username= driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");	
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");	
		
	
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();	
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
}
