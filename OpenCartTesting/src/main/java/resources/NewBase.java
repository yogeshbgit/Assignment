package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewBase 
{
	public WebDriver driver;
	public Properties pro;
	public WebDriver initialization() throws IOException
	{
		
		pro = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\OpenCartTesting\\src\\main\\java\\resources\\newdata.properties");
		pro.load(file);
		String browsername = pro.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
			driver = new ChromeDriver();	
		}
		/*if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "");
			driver = new FirefoxDriver();	
		}*/
		return driver;
		
	}
}
