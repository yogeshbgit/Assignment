package frametest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragNdroptest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//option 1 but not that much recommended
		//System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		//driver.switchTo().frame(0);
		//option 2 ******** recommended
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));// to move into frame
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();//to come out of frame
	}

}
