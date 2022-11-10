package PageObjectRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class JavaScriptUtils {
	
	public static void flash(WebElement element,WebDriver driver)
	{
		String bgcolor  = element.getCssValue("backgroundColor");
		
		for(int i=0;i<250;i++)
		{
			changecolr(element, driver, "#000000");
			changecolr(element, driver, bgcolor);
		}
		
	}
	
	public static void changecolr(WebElement element,WebDriver driver,String color)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver); 
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
		
	}
	
	public static void bordercolor(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px dotted yellow'", element);

	}
	
	public static void scrolling(int n,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+n+")", "");
	}
	
	
}
