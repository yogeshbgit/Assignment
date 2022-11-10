package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountRegisterValidation 
{
	WebDriver driver;
	
	public MyAccountRegisterValidation(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By myaccount = By.xpath("//span[normalize-space()='My Account']");
	By search=	By.cssSelector("input[placeholder='Search']");
	By gosearch =By.cssSelector("i[class='fas fa-search']");
	By register = By.className("dropdown-item");
	By firstname = By.id("input-firstname");
	By lastname = By.id("input-lastname");
	By email = By.className("input-email");
	By password = By.id("input-password");
	By privacycheckbox = By.cssSelector("[type='checkbox']");
	By continuebutton  = By.className("btn btn-primary");
	
	public WebElement getsearch()
	{
		return	driver.findElement(search);
	}
	public WebElement getgosearch()
	{
		return	driver.findElement(gosearch);
	}
	public WebElement getmyaccount()
	{
		return	driver.findElement(myaccount);
	}
	public WebElement getregister()
	{
		return driver.findElement(register);
	}
	public WebElement getfirstname()
	{
		return driver.findElement(firstname);
	}
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getlastname()
	{
		return driver.findElement(lastname);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getprivacycheckbox()
	{
		return	driver.findElement(privacycheckbox);
	}
	public WebElement getcontinuebutton()
	{
		return driver.findElement(continuebutton);
	}
	
}
