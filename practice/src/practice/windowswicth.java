package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowswicth {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://rahulshettyacademy.com/loginpagePractise/#");
//	driver.findElement(By.className("blinkingText")).click();
//	Set<String> window = driver.getWindowHandles();
//	Iterator<String> it = window.iterator();
//	String parentid = it.next();
//	String childid = it.next();
//	driver.switchTo().window(childid);
	//System.out.println(driver.findElement(By.cssSelector("h3 span")).getText());
	//driver.findElement(By.cssSelector("h3 span")).getText();
	driver.findElement(By.id("signInBtn")).click();
	//String id = driver.findElement(By.cssSelector("h3 span")).getText().split("Assured,")[1].trim().split(", ")[0];
	//String pass = driver.findElement(By.cssSelector("h3 span")).getText().split("Jmeter,")[1].trim().split(", ")[0];
	String id= driver.findElement(By.xpath("//i[contains(text(),'rahulshettyacademy')]")).getText();
	String pass = driver.findElement(By.xpath("//i[contains(text(),'learning')]")).getText();
	//driver.switchTo().window(parentid);
	driver.findElement(By.id("username")).sendKeys(id); 
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.xpath("//span[normalize-space()='User']")).click();
	driver.findElement(By.cssSelector("select option[value='stud']")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("cancelBtn")).click();
	//driver.findElement(By.id("terms")).click();
	driver.close();
	//driver.findElement(By.id("signInBtn")).click();
	//Thread.sleep(1000);
	//driver.close();
	}

}
