package Testing;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectRepository.LoginPage;
import Resource.base;

public class validateLoginwithInvaliddata extends base
{
	public WebDriver driver;

@Test(dataProvider="data")
public void loginwithInvalidData(String username,String password) throws InterruptedException, IOException
{
	
	driver = initilazier();
	driver.get(pro.getProperty("url"));
	driver.manage().window().maximize();
	LoginPage lp = new LoginPage(driver);
	lp.userinput().sendKeys(username);
	lp.passinput().sendKeys(password);
	lp.login().click();
	String actualerror  = lp.geterrormsg().getText();
	String expectederror = "Epic sadface: Username and password do not match any user in this service";
	System.out.println("actual error : "+actualerror);
	Assert.assertEquals(actualerror, expectederror);
	System.out.println("error msg verified");
	driver.close();
	
}

@DataProvider
public Object[][] data() 
{
	
	Object[][] data = new Object[3][2];
	data[0][0] = "01dummyemail@gmail.com";
	data[0][1] = "01dummpypass";
	
	data[1][0] = "02dummyemail@gmail.com";
	data[1][1] = "secret_sauce";
	
	data[2][0] = "standard_user";
	data[2][1] = "03dummpypass";
	
	return data;
	
}

//@AfterTest(enabled=false)
//public  void closedriver()
//{
//
//	driver.quit();
//	
//}
	

	

}
