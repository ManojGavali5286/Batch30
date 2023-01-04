package testNGpackage;

import org.testng.annotations.Test;

public class TestNGKeywords 
{
@Test(priority=1)
	public void A()
	{
		System.out.println("test1");
	}
@Test (priority=3)
	public void B()
	{
		System.out.println("test2");
	}
@Test ( priority=2)
	public void C()
	{
		System.out.println("test3");
	}
@Test(priority=-4)
	public void D()
	{
		System.out.println("test4");
	}
@Test (priority=5)
	public void E()
	{
		System.out.println("test5");
	}
	
	
	
	
	
	
	
}
