package testNGpackage;

import org.testng.annotations.Test;

public class Keywords 
{
	@Test(invocationCount=3) //multiple calling/validation
	public void login()
	{
		System.out.println("test1");
	}
   @Test (priority=-5,invocationCount=1) // work as priority in invocation * also simultanious add other keys
	public void home()
	{
		System.out.println("test2");
	}
   @Test (invocationCount=0)  // skiped
	public void addcart()
	{
		System.out.println("test3");
	}
   @Test(priority=-4)
	public void logout()
	{
		System.out.println("test4");
	}
}
