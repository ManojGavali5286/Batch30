package TestCasesVerification;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass_verifyHomePage 
{
	@Test(invocationCount=0)   // used Test annotation- here no need to use main method
       public void method2() 
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");

		driver.manage().window().maximize();	
		System.out.println("browser is maximized");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("url is opened");
		
		//login activity
		PomLoginPage ab=new PomLoginPage(driver);
		
		ab.sendusername();
		System.out.println("usernaeme is entered");
		
		ab.sendpassword();
		System.out.println("password eneterd");
	
		ab.sendlogin();
		System.out.println("clicked on login button");
		
		//creat object of homepage class
		
		Pom_HomePage cd=new Pom_HomePage(driver);
		
		cd.clicksettingBtn();
		System.out.println("clicked on settingBtn");
		cd.clicklogiutBtn();
		System.out.println("went to login page");
	}

}
