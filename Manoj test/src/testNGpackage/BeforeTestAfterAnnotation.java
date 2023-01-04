package testNGpackage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeTestAfterAnnotation

{
 @BeforeMethod  //supporting annotation
public void method1() 
{
	System.out.println("method1");
}
	@Test
public void method2() 
{
	System.out.println("method2");
}
	@AfterMethod  //supporting
public void method3()
{
	System.out.println("method3"); 
	
}

}
