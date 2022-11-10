package AssignmentTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.snapdeal.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement sign = driver.findElement(By.xpath("//span[normalize-space()='Sign In']"));
		Actions action = new Actions(driver);
		action.moveToElement(sign).perform();
		driver.findElement(By.xpath("//a[normalize-space()='login']")).click();
//		driver.findElement(By.cssSelector("#userName")).sendKeys("yogeshbingi0@gmail.com");
//		driver.findElement(By.id("#checkUser")).click();
		driver.close();

	}

}
