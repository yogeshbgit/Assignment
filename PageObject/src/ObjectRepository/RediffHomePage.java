package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {

	WebDriver driver;
	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
		
	@FindBy(id="srchword")
	WebElement search;
	
	@FindBy(xpath = "//input[@value=' '][1]")
	WebElement gosearch;
	
	
	public WebElement search()
	{
		return search;
	}
	
	public WebElement gosearch()
	{
		return gosearch;
	}
	
	
	
}
