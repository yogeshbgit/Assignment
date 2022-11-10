package TestPractise;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObjectRepository.HomePage;
import Resources.newbase;

public class HomePageTest extends newbase {
	WebDriver driver;
	ExtentReports extent;
	@BeforeTest
	public void  confiig()
	{
		String path = System.getProperty("user.dir")+"\\Reports11\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Result");
		reporter.config().setDocumentTitle("test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester","Yogesh");
	
		
	}
	@Test
	public void homepagetest() throws Exception
	{
		
		extent.createTest("initial demo");
		driver = initilazier();
		driver.get(pro.getProperty("url"));
		System.out.println(pro.getProperty("url"));
		getscreenshot(driver, "homepage");
		HomePage hp =new HomePage(driver);
		hp.getupload().sendKeys("C:\\Users\\Lenovo\\Desktop\\image.jpg");
		hp.getname().sendKeys("yogesh bingi");
//			bordercolor(hp.getname(), driver);
//			getscreenshotElement(driver, "nameinput", hp.getname());
		hp.getemail().sendKeys("yogesh@gmail.com");
		hp.getwebsite().sendKeys("yogesh.com");
		hp.getdropdown("3-5");
		hp.getcheckbox().click();
		hp.getradio().click();
		hp.getalertbutton().click();
		driver.switchTo().alert().accept();
			implicitywait(driver, 5);
		driver.switchTo().alert().accept();
		hp.getcommentarea().sendKeys("this is for testing purpose only");
		hp.getsubmit().click();
		extent.flush();
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		//driver.close();
	}
}
