package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPractice 
{

	/*public static void main(String[] args) throws InterruptedException 
	{
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.tagName("p")).getText());
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		System.out.println("hello "+name+",");
		
	}*/
	
	public static void main(String[] args) throws InterruptedException
	{
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String password = getpass(driver);
		Thread.sleep(2000);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);
		driver.close();
		
	}
	
	public static String getpass(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String pass1 = driver.findElement(By.cssSelector("form p")).getText();
		String[] passarrey = pass1.split("'");
		String actualpass = passarrey[1].split("'")[0];
		return actualpass;
	}

}

