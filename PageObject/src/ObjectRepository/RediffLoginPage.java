package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By sign = By.linkText("Sign in");
		
	By username =  By.id("login1");
	By password = By.id("password");
	By go = By.name("proceed");
	
	
	public WebElement signin()
	{
		return driver.findElement(sign);
	}
	public WebElement email()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(go);
	}
	
}
