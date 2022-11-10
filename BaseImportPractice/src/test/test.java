package test;




import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resource.Base;

public class test extends Base {
	 WebDriver driver;
	@Test
	public void mehtodnaem() throws IOException
	{
		driver = initilazier();
		driver.get("https://www.saucedemo.com/");
		getscreenshot(driver, "test1");
		WebElement name = driver.findElement(By.id("user-name"));
		bordercolor(name, driver,"pink");
		getscreenshot(driver, "borderColor");
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		flash(login, driver);
		
	}
	

}
