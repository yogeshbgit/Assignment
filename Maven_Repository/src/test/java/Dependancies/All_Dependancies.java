package Dependancies;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_Dependancies {

	
	@Test
	public void testNG()
	{
		WebDriverManager.chromedriver().setup();
		 
		

	}
}
