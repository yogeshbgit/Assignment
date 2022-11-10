package Resource;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Base {

	public WebDriver driver;
	public Properties pro;
	public WebDriver initilazier() throws IOException
	{
		pro = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\BaseRepository\\src\\Resource\\data.properties");
		pro.load(file);
		String browsername = pro.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:/YOGI/Softwares/Testing/Firefox Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public  File getscreenshot(WebDriver driver,String methodname) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"\\ScreenShots\\"+methodname+".png");
		FileUtils.copyFile(src, dest);
		return dest;
	}
	
	public File getscreenshotElement(WebDriver driver,String methodname,WebElement ele) throws IOException
	{

				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				BufferedImage  fullImg = ImageIO.read(src);

				Point point = ele.getLocation();

				int eleWidth = ele.getSize().getWidth();

				int eleHeight = ele.getSize().getHeight();

				BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),

				    eleWidth, eleHeight);

				ImageIO.write(eleScreenshot, "png", src);

				File dest = new File(System.getProperty("user.dir")+"\\ScreenShots\\"+methodname+".png");

				FileUtils.copyFile(src, dest);
				
				return dest;
	}
	
	public void flash(WebElement element,WebDriver driver)
	{
		String bgcolor  = element.getCssValue("backgroundColor");
		
		for(int i=0;i<150;i++)
		{
			changecolr(element, driver, "#000000");
			changecolr(element, driver, bgcolor);
		}
		
	}
	
	public void changecolr(WebElement element,WebDriver driver,String color)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver); 
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
		
	}
	
	public void bordercolor(WebElement element,WebDriver driver,String color)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px dotted "+color+"'", element);

	}
	
	public void scrolling(int n,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+n+")", "");
	}
	
	public void scrolltillelement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",element);
	}
	
	public void  scrolltillbottom(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("widnow.scrollTo(0,document.body.scrollHeight)");
	}
	
	public void refreshpage(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	
	public void generatealert(WebDriver driver,String messege)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+messege+"')");
	}
	
	public void implicitywait(WebDriver driver,int wait)
	{
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	}
	
	public void explicitywait(WebDriver driver,int wait,By locator)
	{
		WebDriverWait w = new WebDriverWait(driver, wait);
		w.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void dragndrop(WebDriver driver,WebElement src,WebElement dest)
	{
		Actions ac = new Actions(driver);
		ac.dragAndDrop(src, dest);
	}
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
}
