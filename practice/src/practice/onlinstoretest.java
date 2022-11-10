package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class onlinstoretest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wix.com/website/templates/html/online-store");
		driver.findElement(By.cssSelector(".xs9py")).sendKeys("tshirt");
		//List<WebElement> list = driver.findElement(By.id("search-dropdown"));
		//driver.findElement(By.cssSelector("input[aira-expanded='true']"));
		
	}

}
