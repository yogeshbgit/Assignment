import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class end2endtest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:/YOGI/Softwares/Testing/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// for every steps it will apply
		//WebDriverWait w = new WebDriverWait(driver,5);
		int j = 0;
		String[] veglist = { "Brocolli", "Cucumber", "Beans" };

		List<WebElement> alllist = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < alllist.size(); i++) {
			String[] names = alllist.get(i).getText().split("-");
			String formatted = names[0].trim();
			List needlist = Arrays.asList(veglist);
			if (needlist.contains(formatted)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == veglist.length) {
					break;
				}
			}
		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode"))); // for specific locator
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));  // for specific locator
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		driver.close();
		
		
		
	}

}
