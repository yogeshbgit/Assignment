package Dependancies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import Resource.NewBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_test {

	public WebDriver driver;

@Test(enabled =true)
public void Validate_TestNG_URL()
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://testng.org/doc/maven.html");
	
			List<WebElement> all= driver.findElements(By.xpath("(//div[@class='lines'])[1]/div"));		
	for(WebElement line :all)
	{
		//System.out.println("******------TestNG------******");
		System.out.println(line.getText());
	}
	
}

@Test(enabled =true)
public  void Validate_WebDriverManager_URL() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager");
	String name= driver.findElement(By.xpath("//h2/a")).getText();
	NewBase bs = new NewBase();
	bs.bordercolor(driver.findElement(By.xpath("//h2/a")), driver, "red");
	Assert.assertEquals(name, "WebDriverManager123");
	
	
}

@Test(enabled =true)
public void Validate_SeleniumJava_URL()
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java");
	
}



@AfterMethod
public void teardown()
{
	driver.close();
}

}
