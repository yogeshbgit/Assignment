package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base 
{
	public WebDriver driver;
	public Properties pro ;
	public WebDriver initializeDriver() throws IOException 
	{
		pro = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\End2EndProject\\src\\main\\java\\resources\\data.properties");
		pro.load(file);
		String browsername = pro.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
			driver = new ChromeDriver();
 
		}
		if(browsername.equals("firefox"))
		{
			
		}
		if(browsername.equals("IE"))
		{
			
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	
	}
	
	public String getScreenshotPath(String methodname,WebDriver driver) throws IOException
	{
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     String  destinationfile = System.getProperty("user.dir")+"\\reports\\"+methodname+".png";
		 FileUtils.copyFile(scrFile, new File(destinationfile));
		 return destinationfile;
	}
}
