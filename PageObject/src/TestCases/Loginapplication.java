package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffLoginPage;

public class Loginapplication 
{

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://m.rediff.com/");
		driver.manage().window().maximize();
		RediffLoginPage rh = new RediffLoginPage (driver);
		rh.signin().click();
		rh.email().sendKeys("test@gmail.com");
		rh.password().sendKeys("test@2022");
		driver.navigate().back();
		RediffHomePage rd = new RediffHomePage (driver);
		rd.search().sendKeys("t shirt");
		rd.gosearch().click();
		driver.close();
		
	}

}
