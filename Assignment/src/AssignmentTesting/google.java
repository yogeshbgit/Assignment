package AssignmentTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
 
	}
	@Test(groups = "smoke")
	public static void google() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Selenium Webdriver");
		Thread.sleep(2000);
		//List<WebElement> suggestlist= driver.findElements(By.cssSelector("div[class='wM6W7d'] span"));
		List<WebElement> suggestlist= driver.findElements(By.className("sbct"));
		System.out.println("size of suggetlist : "+suggestlist.size());
		for(WebElement list: suggestlist)
		{
			System.out.println("suggesion list : "+list.getText());
			if(list.getText().equalsIgnoreCase("selenium webdriver with java"))
				{
				list.click();
				break;
				}
			
		}
		driver.close();
	}

}
