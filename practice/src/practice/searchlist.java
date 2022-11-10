package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class searchlist {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//***** Dynamic search
		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement opt : list)
		{
			if(opt.getText().equalsIgnoreCase("India"))
			{
				opt.click();
				break;
			}
		}
		
		//****** Checkbox start here ***********
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); // check true or false
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // get all checkbox  size
		//********** checkbox end here ************
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GOI']")).click();
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("display: block; opacity: 0.5;"))
		{
			System.out.println("Its Disabled");
		
		}
		else
		{
			System.out.println("Its Enabled");
		}
		WebElement staticdrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drop = new Select(staticdrop);
		drop.selectByIndex(2);
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByValue("INR");
		drop.selectByVisibleText("USD");
		//driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());// it will show true /false
		//driver.close();
		
		
	}

}
