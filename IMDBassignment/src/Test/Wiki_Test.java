package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObject.Wiki;
import Resource.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Wiki_Test extends Base {
public  WebDriver driver;
	
	@Test(priority=1)
	public void Validatewiki() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		 driver = initilazier();
		 driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		 Wiki wiki = new Wiki(driver);
		 String ReleaseDate = wiki.getreleasedate().getText();
		 String Country=wiki.getcountry().getText();
		 System.out.println("Release Date : "+ReleaseDate);
		 System.out.println("Country of Origin : "+Country);
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}
}
