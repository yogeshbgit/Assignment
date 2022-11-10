package Testing;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjectRepository.LoginPage;
import Resource.base;

public class validateLoginPage extends base
{
	public WebDriver driver;

@Test(priority = 1)
public void loginpage() throws InterruptedException, IOException
{
	
	driver = initilazier();
	driver.get(pro.getProperty("url"));
	driver.manage().window().maximize();
	LoginPage lp = new LoginPage(driver);
	String username = lp.userdetail();
	String password = lp.passworddetail();
	lp.userinput().sendKeys(username);
	lp.passinput().sendKeys(password);
//	flash(lp.login(), driver);
//	getscreenshot(driver, "login1");
//	bordercolor(lp.login(), driver);
//	getscreenshotElement(driver, "login3", lp.login());
	lp.login().click();
	//scrolling(500, driver);
	//refreshpage(driver);
//	generatealert(driver,"you have successfully logged in.!!");
//	driver.switchTo().alert().accept();
}

	

}
