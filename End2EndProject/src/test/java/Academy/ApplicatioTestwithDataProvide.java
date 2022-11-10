package Academy;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.Base;

public class ApplicatioTestwithDataProvide extends Base 
{
	public WebDriver driver;
	/*public static Logger log = LogManager.getLogManager().getLogger(Base.class.getName());
	@BeforeTest
	public void initialization() throws IOException 
	{
		
		System.out.println("browser");
		
	}*/
	@Test(dataProvider="getdata")
	public void logintest(String username,String password) throws IOException, InterruptedException
	{
		
		driver = initializeDriver();
		driver.get("http://qaclickacademy.com/");
		landingPage landp = new landingPage(driver);
		landp.getloginlink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getemail().sendKeys(username);
		lp.getpassword().sendKeys(password);
		Thread.sleep(2000);
		lp.getlogin().click();
		 
	}
	@AfterTest
	public void closetab()
	{
		driver.close();
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="test1111@gmail.com";
		data[0][1]="test123";
		
		data[1][0]="test2222@gmail.com";
		data[1][1]="test456";
		
		data[2][0]="test3333@gmail.com";
		data[2][1]="test789";
		
		return data;
	}
}
