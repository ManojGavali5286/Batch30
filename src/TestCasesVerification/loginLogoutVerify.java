package TestCasesVerification;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class loginLogoutVerify extends Baseclass
{
	@Test  //1
 public void login()
 {
	//validation
		
		//--homePage--//
		System.out.println("Went on HomePage");
				
		//Validation
		System.out.println("Apply the Validation");

		String givenTitle = "Swag Labs";   
	    String ActualTitle=driver.getTitle();
	 
//	    if(givenTitle.equals(ActualTitle))
//	    {
//	    System.out.println("test case passed");
//	    }
//	    else
//	    {
//	    	System.out.println("test case failed");
//	    }
	    
	  //******  //Soft assertion --> verification ********* instead of using for loop its used 
	   // it is non static method so we have to creat Object
	    
	   SoftAssert soft = new SoftAssert();
	   soft.assertEquals(ActualTitle,givenTitle);  // use for verifiaction //not hard checking
	   soft.assertAll();
	   
 }
	@Test //2
	public void logout() //logout useing pom class
	{
		Pom_HomePage ab=new Pom_HomePage(driver);
			ab.clicksettingBtn();
			ab.clicklogiutBtn();
			System.out.println("went to login page");
			//Validation
			System.out.println("Apply the Validation");

			String givenTitle = "Swag La";     //wrote wrong title for chrcking failure
		    String ActualTitle=driver.getTitle();
		 
//		    if(givenTitle.equals(ActualTitle))
//		    {
//		    System.out.println("test case passed");
//		    }
//		    else
//		    {
//		    	System.out.println("test case failed");
//		    }
		    // hard assertion ---> strict validation
		    //use method Assert instead of for loop
			Assert.assertEquals(ActualTitle,givenTitle ," fail due to title mismatch");
	}
}
