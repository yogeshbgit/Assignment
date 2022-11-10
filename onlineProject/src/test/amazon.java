package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/Chrome/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver =new  ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String searchproduct = "Headphones";
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchproduct);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.cssSelector("li[id=\"n/14146391031\"] span a")).click();
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-3']")).click();
		driver.findElement(By.id("low-price")).sendKeys("1500");
		driver.findElement(By.id("high-price")).sendKeys("3000");
		driver.findElement(By.className("a-button-input")).click();
		driver.close();
		
	}

}
