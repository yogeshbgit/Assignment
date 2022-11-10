package Academy;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class validationTitle extends Base 
{	
	public WebDriver driver;
	
	@Test
	public void titlevalidation() throws IOException
	{
		driver = initializeDriver();
		driver.get("http://qaclickacademy.com/");
		landingPage lp = new landingPage(driver);
		//System.out.println(lp.gettitle().getText());
		Assert.assertEquals(lp.gettitle().getText(), "FEATURED COURSES123");
	}
	@AfterTest
	public void closetab()
	{
		driver.close();
	}

}
