package testNGpackage;

import org.testng.annotations.Test;

public class TestNGAnnotataion 
{
	@Test
public void method1() 
{
	System.out.println("method1");
}
	@Test
public void method2() 
{
	System.out.println("method2");
}
	@Test
public void method3()
{
	System.out.println("method3"); 
	
}
//main
//if we use Test annotation then no need to use below main method
//public static void main(String[] args) 
//{
//	TestNGAnnotataion x= new TestNGAnnotataion ();
//	x.method1();
//	x.method2();
//	x.method3();
//}
}
