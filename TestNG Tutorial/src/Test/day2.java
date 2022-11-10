package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day2 
{
	@Test
	public void M1()
	{
		System.out.println("hi this is Day 2 - First method");
	}
	
	@Test(groups= {"smoke"})
	public void M2()
	{
		System.out.println("hi this is Day 2 - Second method");
	}
	
	@Test
	public void M3()
	{
		System.out.println("hi this is Day 2 - Third method");
	}
	
	//@BeforeMethod
	public void beforemethod()
	{
		System.out.println("hi this is Day 2 - before method");
	}
	
}
