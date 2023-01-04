package TestCasesVerification;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass_verifyLoginFunctionality 
{
	@Test(invocationCount=0)  //for skip test
	public void method1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");

		driver.manage().window().maximize();	
		System.out.println("browser is maximized");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("url is opened");
    
		//creat POMclass object here and call 

		PomLoginPage ab=new PomLoginPage(driver);
				
			ab.sendusername();
			System.out.println("usernaeme is entered");
			
			ab.sendpassword();
			System.out.println("password eneterd");
		
			ab.sendlogin();
			System.out.println("clicked on login button");
		
		//validation
		
			//--homePage--//
			System.out.println("Went on HomePage");
					
			//Validation
			System.out.println("Apply the Validation");

			String givenTitle = "Swag Labs";   
		    String ActualTitle=driver.getTitle();
		 
		    if(givenTitle.equals(ActualTitle))
		    {
		    System.out.println("test case passed");
		    }
		    else
		    {
		    	System.out.println("test case failed");
		    }
		driver.close();
	}

}
