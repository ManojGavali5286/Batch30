package testNGpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class automation1
{
    @Test
   public void method1() throws InterruptedException
   {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\MANOJ GAVALI\\Desktop\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	//Dimension d= new Dimension(300,500);
	
	//driver.manage().window().setSize(d);
	
	driver.get("https://www.google.com");
	
	driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMI6rrz1Nat-wIVHZlmAh2N2g_cEAAYASAAEgK7QfD_BwE%26hvadid%3D398134035836%26hvdev%3Dc%26hvlocphy%3D1007788%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D7716743481543841561%26hvtargid%3Dkwd-294882733100%26hydadcr%3D24542_1971411%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
	WebElement username= driver.findElement(By.id("ap_email"));
	username.sendKeys("8624003523");	
	
//	
//	
//	WebElement password= driver.findElement(By.id("continue"));
//	password.sendKeys("secret_sauce");	
//	
//	
	WebElement Btn= driver.findElement(By.id("continue"));
   Btn.click();	
   
   WebElement Forgotpass= driver.findElement(By.id("auth-fpp-link-bottom"));
	Forgotpass.click();
	
	WebElement otp= driver.findElement(By.id("ap_email"));
	otp.sendKeys("");
	
	
//	WebElement Continue = driver.findElement(By.linkText("a-button-input"));
//	Continue.click();	
	WebElement abc= driver.findElement(By.id("continue"));
	   abc.click();	
	
//  WebElement Loginbtn =	driver.findElement(By.id("login-button"));
//	
//	Loginbtn.click();
//	
//	
////	driver.get("https://www.facebook.com");
////	
////   driver.navigate().back();
////    
//   
////    
// // driver.navigate().forward();
////    
//	//Thread.sleep(3000);
////	
////
////
////	driver.navigate().refresh();
////	
////driver.close();
////	
////	
//	String url = driver.getCurrentUrl();
//	System.out.println("url is--->"  +url);
////	
////   String title =	driver.getTitle();
////   System.out.println("title is ---->"+title);
////   driver.quit();
// Thread.sleep(5000);
// 
//   driver.close();
  }

}




