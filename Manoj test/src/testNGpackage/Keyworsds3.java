package testNGpackage;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Keyworsds3 
{
	@Test(priority=1)
	public void login()
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
@Test(dependsOnMethods= {"login"}) // logout is depend on login test so login is failed then it wont run logout
	public void logout()
	{
		System.out.println("test4");
	}
@Test(timeOut=2000)
    public void abc()
    {
    	System.out.println("test5"); // if it took more 2sec time to run then its execution will fail
    }
@Test(timeOut=2000)
public void def() throws InterruptedException
{
	Thread.sleep(5000);
	System.out.println("test6"); // this case will b fail cause it take 5 sec > 2sec
}
@Test
public void testA()
{
	System.out.println("test-A");
}

@Test(enabled=false)  //skipped
public void testB()
{
	System.out.println("test-B");
}

//enabled =false ->TC will not participate in execution
//enabled = true -> default in all Test cases till u not mention it false


@Test
public void loginTest()
{
	System.out.println("loginTest");
	Assert.assertTrue(false);       // Assert method-->to  willingly fail the Test 
                                    // also use for validation and verification(assertion topic)
}

}
