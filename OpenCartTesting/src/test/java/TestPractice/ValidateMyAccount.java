package TestPractice;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import resources.NewBase;

public class ValidateMyAccount extends NewBase 
{
	WebDriver driver;
	@Test
	public void validateaccout() throws IOException, InterruptedException
	{
		driver = initialization();
		driver.get("https://demo.opencart.com/");
		MyAccountRegisterValidation rs = new MyAccountRegisterValidation(driver);
		/*rs.getsearch().sendKeys("Iphone");
		rs.getgosearch().click();*/
		
		rs.getmyaccount().click();
		Thread.sleep(2000);
		rs.getregister().click();
		Thread.sleep(2000);
		rs.getfirstname().sendKeys("yogesh");
		rs.getlastname().sendKeys("bingi");
		rs.getemail().sendKeys("yogeshbingi@gmail.com");
		rs.getpassword().sendKeys("yogesh@22");
		rs.getprivacycheckbox().click();
		rs.getcontinuebutton().click();
		
		
	}
}
