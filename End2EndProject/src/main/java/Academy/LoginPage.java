package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By email = By.id("user_email");
	By password = By.id("user_password");
	By loginbutton = By.xpath("//input[@value='Log In']");
	
	public WebElement getemail()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement getlogin()
	{
		return driver.findElement(loginbutton);
		
	}
	
	
	
}
