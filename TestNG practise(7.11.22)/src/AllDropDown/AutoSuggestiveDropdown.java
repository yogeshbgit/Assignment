package AllDropDown;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestiveDropdown {

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
 
	}
	@Test
	public static void demo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		String searchcountry = "ind";
		driver.findElement(By.id("autosuggest")).sendKeys(searchcountry);
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));
		for(WebElement option:options)
		{
			String targetCountry = "India";
			if(option.getText().equalsIgnoreCase(targetCountry))
			{
				System.out.println("Selected Country : "+option.getText());
				option.click();
				break;
			}
		}
		driver.close();
	}

}
