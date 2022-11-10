package Resource;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewBase {
	public WebDriver driver;
	public String getScreenshotPath(String methodname,WebDriver driver) throws IOException
	{
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     String  destinationfile = System.getProperty("user.dir")+"\\NewExtentReports\\"+methodname+".png";
	     FileUtils.copyFile(scrFile, new File(destinationfile));
	     
		 return destinationfile;
	}
	public void bordercolor(WebElement element,WebDriver driver,String color)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px dotted "+color+"'", element);

	}
	

}
