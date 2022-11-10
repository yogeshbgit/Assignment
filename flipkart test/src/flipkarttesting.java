import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkarttesting {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		

		driver.get("https://www.saucedemo.com");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.cssSelector("#login-button")).click();

		WebElement lowtohigh=driver.findElement(By.className("product_sort_container"));

		Select s= new Select(lowtohigh);

		s.selectByVisibleText("Price (low to high)");

		driver.findElement(By.cssSelector("button[id*='add-to-cart']")).click();

		driver.findElement(By.cssSelector("button[id*='remove-sauce-labs-onesie']")).click();

		

		//click on second add to cart

		driver.findElement(By.xpath("(//button)[4]")).click();

		

		

		driver.findElement(By.id("shopping_cart_container")).click();

		driver.findElement(By.id("checkout")).click();

		driver.findElement(By.id("first-name")).sendKeys("Vikrant");

		driver.findElement(By.id("last-name")).sendKeys("Bingi");

		driver.findElement(By.id("postal-code")).sendKeys("413005");

		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("finish")).click();

		driver.findElement(By.id("back-to-products")).click();

		driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();

		driver.findElement(By.id("logout_sidebar_link")).click();

		

		

		driver.findElement(By.id("user-name")).sendKeys("locked_out_userr");

		

		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.cssSelector("#login-button")).click();

		String text=driver.findElement(By.cssSelector("h3")).getText();

		System.out.println(text);
	}

}
