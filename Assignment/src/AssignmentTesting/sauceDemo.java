package AssignmentTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class sauceDemo {

	
	public static void main(String[] args) throws InterruptedException {
		
		
	}
	@Test
	public static void saucedemo() {
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String username = "standard_user";
		String password = "secret_sauce";
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		List<WebElement> productnames = driver.findElements(By.cssSelector("div[class='inventory_item'] div[class='inventory_item_name']"));
		List<WebElement> addcart= driver.findElements(By.cssSelector("div[class='inventory_item'] button[class*='btn']"));
		for(int i=0;i<productnames.size();i++)
		{
			String text = productnames.get(i).getText();
			//System.out.println(productnames.get(i).getText());
			if(text.equalsIgnoreCase("Test.allTheThings() T-Shirt (Red)"))
			{
				System.out.println("product name : "+text);
				addcart.get(i).click();
			} 
		}
		
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.name("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("yogesh");
		driver.findElement(By.id("last-name")).sendKeys("bingi");
		driver.findElement(By.id("postal-code")).sendKeys("413005");
		driver.findElement(By.cssSelector("#continue")).click();
		driver.findElement(By.id("finish")).click();
		String thankyoutext = driver.findElement(By.className("complete-header")).getText();
		String ExpectedTitle = "THANK YOU FOR YOUR ORDER";
		if(thankyoutext.equalsIgnoreCase(ExpectedTitle))
		{
			System.out.println("True*****");
		}
	
		System.out.println(driver.findElement(By.className("complete-header")).isDisplayed());
		
		driver.close();
	}

	
		
	
}
