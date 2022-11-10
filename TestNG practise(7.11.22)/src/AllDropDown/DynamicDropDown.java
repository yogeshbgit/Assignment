package AllDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicDropDown {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
	}
	@Test
	public static void demo2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  driver.findElement(By.xpath("//li/a[@value='GOI']")).click(); 
		  Thread.sleep(2000);
		// driver.findElement(By.xpath("(//li/a[@value='CCU'])[2]")).click();
		  // option select by if condition
		 WebElement kolkata = driver.findElement(By.xpath("(//li/a[@value='CCU'])[2]"));
		 if(kolkata.getText().equalsIgnoreCase("Kolkata"))
		 {
			 kolkata.click();
		 }
		  driver.close();
	}
	

}
