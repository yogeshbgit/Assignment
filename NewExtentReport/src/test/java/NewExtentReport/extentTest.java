package NewExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class extentTest {
	static ExtentReports extent;
@BeforeTest
public void config()
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
public void demo()
{
	extent.createTest("ddemo");
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	System.out.println(driver.getTitle());
	extent.flush();
}
}
