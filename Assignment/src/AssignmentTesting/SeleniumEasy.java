package AssignmentTesting;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumEasy {

	public static void main(String[] args) throws WebDriverException, IOException {
		// TODO Auto-generated method stub

	}
	@Test(groups = "smoke")
	public static void seleniumeasy() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-search-filter-demo.html");
		driver.findElement(By.id("task-table-filter")).sendKeys("Emily John");
		/*List<WebElement> list = driver.findElements(By.xpath("(//tbody)[1]"));
		FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Lenovo\\eclipse-workspace\\Assignment\\src\\AssignmentTesting\\screenshot.png"));
		System.out.println(list.size());
		for(WebElement each : list)
		{
			
				System.out.println("table : "+each.getText());
				
			
		}
		driver.close();*/

		WebElement ele = driver.findElement(By.xpath("(//div[@class='row'])[3]"));

		// Get entire page screenshot

		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		BufferedImage  fullImg = ImageIO.read(screenshot);

		// Get the location of element on the page

		Point point = ele.getLocation();

		// Get width and height of the element

		int eleWidth = ele.getSize().getWidth();

		int eleHeight = ele.getSize().getHeight();

		// Crop the entire page screenshot to get only element screenshot

		BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),

		    eleWidth, eleHeight);

		ImageIO.write(eleScreenshot, "png", screenshot);

		// Copy the element screenshot to disk

			File screenshotLocation = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Assignment\\src\\Screenshots\\sc00.png");
		FileUtils.copyFile(screenshot, screenshotLocation);
		driver.close();
	}

}
