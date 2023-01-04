package TestCasesVerification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass 
	{
		WebDriver driver;
	@Parameters("browserName")
	@BeforeMethod
		public void setup(String browserName)
		{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");

		    driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\geckodriver.exe");
			

			 driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("throw error");
		}
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


