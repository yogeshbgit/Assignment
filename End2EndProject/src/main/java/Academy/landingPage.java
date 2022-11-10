package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage 
{
	public WebDriver driver;
	
	public landingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By loginlink = By.xpath("//span[normalize-space()='Login']");
	By title = By.cssSelector("div[class='text-center'] h2");
	
	public WebElement getloginlink()
	{
		return driver.findElement(loginlink);
		
	}
	
	public WebElement gettitle()
	{
		return driver.findElement(title);
		
	}
	
	
}
