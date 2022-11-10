package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchModel {

	
	WebDriver driver;
	public SearchModel(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By search = By.cssSelector("input[type='search']");
	By go = By.cssSelector("button[type='submit']");
	By productname= By.className("product-name");
	By allproductlist =By.cssSelector("div[class='product'] h4");
	By increment = By.className("increment");
	By  addcart = By.xpath("//button[normalize-space()='ADD TO CART']");
	By listbag = By.xpath("//img[@alt='Cart']");
	By proceed = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By selectedproductlist = By.cssSelector("tbody tr td:nth-child(2)");
	By quantity = By.cssSelector("tbody tr td:nth-child(3)");
	By amount = By.cssSelector("tbody tr td:nth-child(4)");
	By totalamount = By.cssSelector("tbody tr td:nth-child(5)");
	By discountamount = By.xpath("//div[@class='products']//span[@class='discountAmt']");
	By placeorder = By.xpath("//button[text()='Place Order']");
	By country = By.cssSelector("select");
	By checkbox = By.cssSelector("input[type='checkbox']");
	By finalproceed= By.xpath("//button[text()='Proceed']");
	By promocode = By.cssSelector(".promoCode");
	By promoapply = By.className("promoBtn");
	
	public WebElement search() {
		return driver.findElement(search);
	}
	
	public WebElement gosubmit()
	{
		return driver.findElement(go);
	}
	public List<WebElement> allproductlist()
	{
		return driver.findElements(allproductlist);
	} 
	public List<WebElement> increment()
	{
		return driver.findElements(increment);
	}
	public WebElement name()
	{
		return driver.findElement(productname);
	}
	public List<WebElement> addcart()
	{
		return driver.findElements(addcart);
	}
	public WebElement listbag()
	{
		return driver.findElement(listbag);
	}
	public WebElement proceed()
	{
		return driver.findElement(proceed);
	}
	public List<WebElement>  selectedlist()
	{
		return driver.findElements(selectedproductlist);
	}
	public List<WebElement> quantity()
	{
		return driver.findElements(quantity);
	}
	public List<WebElement> amount()
	{
		return driver.findElements(amount);
	}
	public List<WebElement> totalamount()
	{
		return driver.findElements(totalamount);
	}
	public WebElement discountamount()
	{
		return driver.findElement(discountamount);
	}
	public WebElement placeorder()
	{
		return driver.findElement(placeorder);
	}
	public WebElement country()
	{
		return driver.findElement(country);
	}
	public WebElement Agreecheckbox()
	{
		return driver.findElement(checkbox);
	}
	public WebElement finalproceed()
	{
		return driver.findElement(finalproceed);
	}
	public WebElement promocode()
	{
		return driver.findElement(promocode);
	}
	public WebElement promoapply()
	{
		return driver.findElement(promoapply);
	}
}
