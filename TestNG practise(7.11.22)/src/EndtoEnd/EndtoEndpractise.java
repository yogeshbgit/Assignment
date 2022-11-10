package EndtoEnd;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EndtoEndpractise {
	
	/*@Test
	public static void testingpractise() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options = driver.findElements(By.xpath("//li/a[@class='ui-corner-all']"));
		for(WebElement option:options)	
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				System.out.println(option.getText());
				break;
			}
		}
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//li/a[@value='HYD']")).click();
		driver.findElement(By.xpath("(//li/a[@value='COK'])[2]")).click();
		List<WebElement> dates= driver.findElements(By.cssSelector("a[class='ui-state-default']"));
		int count = dates.size();
		for(int i=0;i<count;i++)
		{
			if(dates.get(i).getText().equalsIgnoreCase("16"))
			{
				dates.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		List<WebElement> todate=driver.findElements(By.cssSelector("a[class='ui-state-default']"));
		int tocount = todate.size();
		for(int i=0;i<tocount;i++)
		{
			if(todate.get(i).getText().equalsIgnoreCase("30"))
			{
				todate.get(i).click();
				break;
			}
			
		}
		driver.findElement(By.id("divpaxinfo")).click();
		for(int i=0;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		
		}
		
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText("INR");
		System.out.println("Selected Currency code: "+dropdown.getFirstSelectedOption());
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();*/
		
		//******** RedBus Booking******
		
		/* driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("solapur");
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul[class='autoFill homeSearch'] li[data-id='646']")).click();
		driver.findElement(By.cssSelector("input[tabindex='2']")).sendKeys("pune");
		//Thread.sleep(2000);
		List<WebElement> options =driver.findElements(By.className("sub-city"));
		int count1=options.size();
		System.out.println(count1);
		driver.findElement(By.cssSelector("li[data-id='67159']")).click();
		driver.close();
	}*/
	
	@Test
	public static void makemytrip() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Car rentals']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ss_origin")).sendKeys("goa");
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[role='option']"));
		int count = options.size();
		System.out.println(count);
		for(WebElement op : options)
		{
			System.out.println(op.getText());
			if(op.getText().equalsIgnoreCase("Goa"))
			{
				op.click();
				break;
				
			}
		}
		driver.findElement(By.xpath("(//button[@role='button'])[1]")).click();
		//List<WebElement> ops = driver.findElements(By.cssSelector(".c2-month-header"));
		List<WebElement> ops = driver.findElements(By.cssSelector(".bui-calendar__month"));
		int size=ops.size();
		System.out.println(size);
		for(WebElement o : ops)
		{
			System.out.println("Month : "+o.getText());
			while(!o.getText().contains("October 2022"))
			{
				driver.findElement(By.xpath("(//div[@class='c2-button c2-button-further']/span[@class='c2-button-inner'])[1]")).click();
				break;
				
			}
		}
		driver.findElement(By.cssSelector("span[aria-label='16 October 2022']")).click();
		
		Thread.sleep(8000);
		driver.close();
		
		
	}
	

}
