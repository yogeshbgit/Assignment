package PageObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class homepage 
{
	public WebDriver  driver;
	public homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By prodlist  = By.cssSelector(".inventory_item_name");
	By addcart = By.cssSelector("button[id*='add-to-cart']");
	By  filter= By.className("product_sort_container");
	By  cart = By.id("shopping_cart_container");
	
	
	public List<WebElement> prodlist1()
	{
		return driver.findElements(prodlist);
	}
	public List<WebElement> addtocart()
	{
		return driver.findElements(addcart);
	}
	
	public Select getfilter()
	{
		WebElement filt= driver.findElement(filter);
		Select dropdown = new Select(filt);
		dropdown.selectByVisibleText("Name (Z to A)");
		
		return dropdown;
	}
	
	public Select getagainfilter()
	{
		WebElement filt= driver.findElement(filter);
		Select dropdown = new Select(filt);
		dropdown.selectByVisibleText("Name (A to Z)");
		
		return dropdown;
	}
	
	public WebElement getcart()
	{
		return driver.findElement(cart);
	}
}
