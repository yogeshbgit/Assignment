package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class DragnDroprepository {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		}
	
public DragnDroprepository(WebDriver driver)

{
	this.driver = driver;
}
By frameswitch = By.xpath("(//iframe[@class='demo-frame lazyloaded'])[1]");
By src = By.cssSelector("li[class*='ui-widget-content']");
By dest = By.id("trash");
By recycle = By.xpath("//a[text()='Recycle image']");
By zoom =By.xpath("//a[@title='View larger image']");

public WebElement getframe()
{
	return driver.findElement(frameswitch);
}
public List<WebElement> getsrc()
{
	return driver.findElements(src);
}
public WebElement getdest()
{
	return driver.findElement(dest);
}
public List<WebElement> getrecycle()
{
	return driver.findElements(recycle);
}
public List<WebElement> getzoom()
{
	return driver.findElements(zoom);
}

}