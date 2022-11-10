package Dependancies;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandle {

	public WebDriver driver;
	
	
	@Test
	public void initializer()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void validateRadioButton()
	{
		List<WebElement> radios =  driver.findElements(By.className("radioButton"));
		for(WebElement radio : radios)
		{
			System.out.println(radio.getText());
			radio.click();
		}
	}
	
	@Test(enabled=false)
	public void validateSuggessionClass() throws InterruptedException
	{
		driver.findElement(By.id("autocomplete")).sendKeys("testing automation");
		
	}
	
	@Test
	public void validateDropDown()
	{
		Select drop = new Select(driver.findElement(By.id("dropdown-class-example")));
		drop.selectByVisibleText("Option1");
		drop.selectByVisibleText("Option2");
		drop.selectByVisibleText("Option3");
		//System.out.println("Option : "+drop.getFirstSelectedOption().getText());;
	}
	
	@Test
	public void validateCheckbox()
	{
		List<WebElement> checkboxes = driver.findElements(By.xpath("//label/input[@type='checkbox']"));
		for(WebElement checkbox : checkboxes)
		{
			System.out.println(checkbox.getText());
			checkbox.click();
		}
	}
	@Test(enabled=false)
	public void validateSwitchWindow()
	{
		driver.findElement(By.id("openwindow")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String  parent =it.next();
		String child = it.next();
		driver.switchTo().window(parent);
		//driver.switchTo().window(child);
		
	}
	
	@Test
	public void validateIframe()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.id("courses-iframe")));
		driver.switchTo().frame("courses-iframe");
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("(//div[@class='inner-box']//h3)[1]")));
		String act = driver.findElement(By.xpath("(//div[@class='inner-box']//h3)[1]")).getText();
		//js.executeScript("arguments[0].style.border='3px solid red", driver.findElement(By.xpath("(//div[@class='inner-box']//h3)[1]")));
		System.out.println(act);
		driver.switchTo().defaultContent();
		Assert.assertEquals(act, "CONSULTING123");
		
		
		
	}
	
}
