package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObject.IMDB;
import Resource.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IMDB_Test extends Base {

	public  WebDriver driver;
	
	@Test(priority=1)
	public void ValidateImdb() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		 driver = initilazier();
		 driver.get("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");
		 IMDB imdb = new IMDB(driver);
		 String ReleaseDate = imdb.getreleasedate().getText();
		 String Country=imdb.getcountry().getText();
		 System.out.println("Release Date : "+ReleaseDate);
		 System.out.println("Country of Origin : "+Country);
	}
@AfterTest
public void TearDown()
{
	driver.close();
}
	
}
