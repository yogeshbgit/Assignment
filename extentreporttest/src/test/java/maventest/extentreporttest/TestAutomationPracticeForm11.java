package maventest.extentreporttest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAutomationPracticeForm11 {
	static ExtentReports extent;
	@BeforeTest
	
	public static void gereportObject()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Result11");
		reporter.config().setDocumentTitle("test Results11");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);  
		extent.setSystemInfo("tester","Yogesh11");
		
	}
	
	@Test
	public void extentreporttest() throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chromedriver.exe");
		extent.createTest("test123");
			WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.findElement(By.id("name")).sendKeys("yogesh bingi");
		driver.findElement(By.id("phone")).sendKeys("9373039372");
		driver.findElement(By.id("email")).sendKeys("yogeshbingi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password2022");
		driver.findElement(By.id("address")).sendKeys("271,chakote nagar vidi gharkul solapur - 413005");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.cssSelector("#male")).click();
		List<WebElement> checkbox = driver.findElements(By.cssSelector("div[class='form-check'] input[type='checkbox']"));
		List<WebElement> days=driver.findElements(By.cssSelector("div[class='form-check']"));
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,500)", "");
		for(int i=0;i<=checkbox.size()-1;i++)
		{
			Thread.sleep(1000);
			//checkbox.get(i).click();
			String text = days.get(i).getText();
			if(text.equalsIgnoreCase("Monday")||text.equalsIgnoreCase("Wednesday"))
			{
				System.out.println("days : "+text);
				checkbox.get(i).click();
			}
		}
		
		WebElement dropdown = driver.findElement(By.cssSelector(".custom-select"));
		Select drop = new Select (dropdown);
		drop.selectByVisibleText("Italy");
		Assert.assertEquals("Italy", drop.getFirstSelectedOption().getText());
		System.out.println("Country : "+drop.getFirstSelectedOption().getText());
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[id='3years']"))).click();
		//driver.findElement(By.cssSelector("input[id='3years']")).click();
//		List<WebElement> frameworks =driver.findElements(By.cssSelector("div[class='form-group'] input[type='checkbox']"));
//		for(int i=0;i<=frameworks.size();i++)
//		{
//			System.out.println(frameworks.get(i).getText());
//			frameworks.get(i).click();
//			
//		}
		driver.findElement(By.id("inputGroupFile02")).sendKeys("C:\\Users\\Lenovo\\Downloads\\01.png");
		driver.findElement(By.className("input-group-text")).click();
		Thread.sleep(2000);
		//driver.close();
		extent.flush();
		
	}

}
