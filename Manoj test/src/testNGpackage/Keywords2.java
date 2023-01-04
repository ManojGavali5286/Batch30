package testNGpackage;

import org.testng.annotations.Test;

public class Keywords2 
{
	@Test
	public void login()
	{
		System.out.println("test1");
	}
   @Test (enabled=false)  // for use skipp
	public void home()
	{
		System.out.println("test2");
	}
   @Test (invocationCount=0)  // also skiped
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
