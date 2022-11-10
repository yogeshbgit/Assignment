package AssignmentTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PageObject.DragnDroprepository;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDropPractice {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		DragnDroprepository resp = new DragnDroprepository(driver);
		driver.switchTo().frame(resp.getframe());
		Thread.sleep(2000);
		dragndrop(resp.getsrc(),resp.getdest());
		Thread.sleep(2000);
		recycle(resp.getrecycle());
		Thread.sleep(3000);
		zoomNclose(resp.getzoom());
		driver.close();
	}
	public static void dragndrop(List<WebElement>src ,WebElement dest) throws InterruptedException
	{
		Actions ac = new Actions(driver);
		for(WebElement s : src)
		{
			Thread.sleep(2000);
			ac.dragAndDrop(s, dest).perform();
		}
	}
	public static void recycle(List<WebElement>recycle) throws InterruptedException
	{
		for(WebElement r : recycle)
		{
			Thread.sleep(2000);
			r.click();
		}
	}
	public static void zoomNclose(List<WebElement>zoom) throws InterruptedException
	{
		for(int i=0;i<zoom.size();i++)
		{
			zoom.get(i).click();
			List<WebElement> close = driver.findElements(By.cssSelector("span[class*='ui-button-icon ui-icon']"));
			Thread.sleep(2000);
			close.get(i).click();
			Thread.sleep(500);
			
		}
	}
}
