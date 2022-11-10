package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By upload = By.cssSelector("input[type='file']");
	By name = By.id("g2599-name");
	By email = By.id("g2599-email");
	By website = By.id("g2599-website");
	By dropdown = By.id("g2599-experienceinyears");
	By checkbox = By.xpath("(//input[@type='checkbox'])[2]");
	By radio = By.xpath("(//input[@type='radio'])[1]");
	By button = By.xpath("(//button)[2]");
	By comment = By.id("contact-form-comment-g2599-comment");
	By submit = By.cssSelector("button[type='submit']");
	
	public WebElement getupload()
	{
		return driver.findElement(upload);
	}
	
	public WebElement getname()
	{
		return driver.findElement(name);
	}
	
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getwebsite()
	{
		return driver.findElement(website);
	}
	public Select getdropdown(String selecteddropdown)
	{
		Select drop = new Select(driver.findElement(dropdown));
		drop.selectByValue(selecteddropdown);
		return drop;
		
	}
	public WebElement getcheckbox()
	{
		return driver.findElement(checkbox);
	}
	public WebElement getradio()
	{
		return driver.findElement(radio);
	}
	public WebElement getalertbutton()
	{
		return driver.findElement(button);
	}
	
	public WebElement getcommentarea()
	{
		return driver.findElement(comment);
	}
	public WebElement getsubmit()
	{
		return driver.findElement(submit);
	}
}


