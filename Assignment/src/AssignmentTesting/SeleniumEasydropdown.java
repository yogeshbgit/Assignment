package AssignmentTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumEasydropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public static void dropdown()
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		WebElement dropdown = driver.findElement(By.name("example_length"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("25");
		System.out.println("selected option : "+dd.getFirstSelectedOption().getText());
		int actualcount = driver.findElements(By.xpath("//tbody//tr")).size();
		int expectedcount = 25;
		if(actualcount==expectedcount)
			System.out.println("initial no of rows are 25");
		else
			System.out.println("initial no of rows are not 25");
		driver.findElement(By.id("example_next")).click();
		int actualafternext= driver.findElements(By.xpath("//tbody//tr")).size();
		int expectafternext = 7;
		int totalrows = expectedcount+expectafternext;
		if(totalrows==32)
		{
			System.out.println("total no of rows are after next button 32");
		}
		else
		{
			System.out.println("total no of rows are not 32");
		}
		driver.close();
	}

}
