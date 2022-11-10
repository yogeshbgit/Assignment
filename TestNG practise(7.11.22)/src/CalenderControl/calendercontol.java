package CalenderControl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calendercontol {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	public static void calendertest()
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	 List<WebElement> dates= driver.findElements(By.cssSelector("a[class='ui-state-default']"));
	 int count = dates.size();
	 for(int i=0;i<count;i++)
	 {
		 if(dates.get(i).getText().equalsIgnoreCase("23"))
		 {
			 dates.get(i).click();
			 break;
		 }
	 }
	 driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
	 List<WebElement> todate=driver.findElements(By.className("ui-state-default"));
	 int count2 = todate.size();
	 for(int i=0;i<count2;i++)
	 {
		 if(todate.get(i).getText().equalsIgnoreCase("30"))
		 {
			 todate.get(i).click();
			 break;
		 }
	 }
	 driver.findElement(By.id("divpaxinfo")).click();
	 for(int i=0;i<4;i++)
	 {
		 driver.findElement(By.id("hrefIncAdt")).click();
		 
	 }
	 
	 
	 driver.findElement(By.cssSelector(".buttonN")).click();
	 
	
	 driver.close();
	}

}
