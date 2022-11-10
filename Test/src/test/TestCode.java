package test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCode {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/register.php");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("inputFirstName")).sendKeys("Vikrant");
		driver.findElement(By.id("inputLastName")).sendKeys("Bingi");
		driver.findElement(By.id("inputEmail")).sendKeys("bingivs@gmail.com");
		WebDriverWait w = new WebDriverWait(driver, 3);
		driver.findElement(By.cssSelector(".selected-dial-code")).click();
	driver.findElement(By.xpath("//li/span[contains(text(),'+91')]")).click();
		driver.findElement(By.cssSelector("#inputPhone")).sendKeys("7709896958");

	driver.findElement(By.id("inputCompanyName")).sendKeys("AlgoFusion Technologies");
	driver.findElement(By.id("inputAddress1")).sendKeys("");
	driver.findElement(By.cssSelector("#inputAddress1")).sendKeys("4th cross road ");
	driver.findElement(By.cssSelector("#inputAddress2")).sendKeys("RPC layout");
	driver.findElement(By.xpath("//input[@id=\"inputCity\"]")).sendKeys("Banglore");
	driver.findElement(By.id("stateinput")).sendKeys("Karnataka");
	driver.findElement(By.xpath("//input[@name=\"postcode\"]")).sendKeys("560104");
	//driver.findElement(By.cssSelector("#inputCountry")).sendKeys("India");
	WebElement list = driver.findElement(By.id("inputCountry"));
	Select country = new Select(list);
	country.selectByVisibleText("India");
	driver.findElement(By.cssSelector("#customfield2")).sendKeys("7709896958");

	driver.findElement(By.xpath("//button[contains(text(),'Generate Password')]")).click();
//	Thread.sleep(3000);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#btnGeneratePasswordInsert"))).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bootstrap-switch-handle-on"))).click();
//	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".recaptcha-checkbox-border"))).click();
//	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value=\"Register\"]"))).click();
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//div[@id='#divDynamicRecaptcha1']"));
	ele.click();
	Thread.sleep(3000);
	driver.findElement(By.id("recaptcha-verify-button")).click();
	driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
	
	driver.close();
		
	
	
	}

}
