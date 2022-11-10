package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 
{
	@Test
	public void test1()
	{
		System.out.println("hi this is Day 1 - First method");
	}
	
	@Test(groups= {"smoke"})
	public void test2()
	{
		System.out.println("hi this is Day 1 - Second method");
	}
	
	@Test
	public void test3()
	{
		System.out.println("hi this is Day 1 - Third method");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("hi this is Day 1 - beforetest method");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("hi this is Day 1 - aftertest method");
	}
	
	//@AfterMethod
	public void aftermethod()
	{
		System.out.println("hi this is Day 1 - After method");
	}
}
