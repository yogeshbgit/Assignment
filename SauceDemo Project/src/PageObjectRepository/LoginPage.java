package PageObjectRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	public  LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginbutton = By.id("login-button");
	By userdetail = By.id("login_credentials");
	By pass = By.cssSelector(".login_password");
	By errormsg = By.cssSelector("h3");
	
	public WebElement userinput()
	{
		return driver.findElement(username);
	}
	
	public WebElement passinput()
	{
		return driver.findElement(password);
	}
	public WebElement login()
	{
		return driver.findElement(loginbutton);
	}
	
	public String userdetail()
	{
		 String[] user = this.driver.findElement(userdetail).getText().split(":");
			String[] user1 =user[1].split("locked_out_user");
			String finaluser = user1[0];
			return finaluser;
	}
	
	public String passworddetail()
	{
		String[] password = this.driver.findElement(pass).getText().split(":");
		String finalpass = password[1];
		return finalpass;
	}
	
	public WebElement geterrormsg() 
	{
		
		return driver.findElement(errormsg);
		
	}
}
