package Resource;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pageobject {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public Pageobject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By alllist = By.tagName("h4");
	By addcart = By.xpath("//div[@class='product-action']/button");
	By cart = By.cssSelector("img[alt='Cart']");
	By proceed = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By addedlist = By.xpath("//tbody/tr/td[2]/p");
	By increment = By.className("increment");
	By qty = By.cssSelector(".quantity");
	By sum= By.xpath("//tbody/tr/td[5]/p");
	By total = By.xpath("//b[text()='Total Amount     : ']/following-sibling::span[1]");
	By amount = By.xpath("//td[5]//p[@class='amount']");
	By title = By.cssSelector(".greenLogo");
	
	public  WebElement gettitle()
	{
		return driver.findElement(title);
	}
	
	public  List<WebElement> getallist() 
	{
		return driver.findElements(alllist);
	}
	
	public List<WebElement> getaddcart()
	{
		return driver.findElements(addcart);
	}
	
	public WebElement getcart()
	{
		return driver.findElement(cart);
	}
	public WebElement getproceed()
	{
		return driver.findElement(proceed);
	}
	
	public List<WebElement> getaddedlist()
	{
		return driver.findElements(addedlist);
	}
	public List<WebElement> getincr()
	{
		return driver.findElements(increment);
	}
	public List<WebElement> getqty()
	{
		return driver.findElements(qty);
	}
	public int getsum()
	{
		List<WebElement> s =  driver.findElements(sum);
		int ttsum=0;
		for(WebElement sm : s)
		{
			int su = Integer.parseInt(sm.getText());
			ttsum = su+ ttsum;
		}
		return ttsum;
	}
	
	public int gettotal()
	{
		String t = driver.findElement(total).getText();
		int total= Integer.parseInt(t);
		return total;
	}
	public  List<WebElement> getamount()
	{
		return driver.findElements(amount);
	}
}
