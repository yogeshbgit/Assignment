package frametest;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;


public class scrollbarAndstringToIntegerconvert {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException
	
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)","");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());// convert string to integer
		}
		System.out.println(sum);
		int total = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());// convert string to integer
		if(sum==total)
		{
			System.out.println("both matched : "+sum+ " & " +total );
		}
		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src,new File("C:\\User\\screensohot.png"));
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       //Move image file to new destination
        File DestFile=new File("C:\\User\\screensohot.png");
        //Copy file at destination
        FileUtils.copyFile(src, DestFile);
	}

}
