package frametest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Resource.base;


public class Calender extends base {

	public static void main(String[] args) throws IOException 
	{
//		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		base bs = new base();
		WebDriver driver = bs.initilazier();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		driver.findElements(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("October"))
		{
			driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='next']")).click();
		}
		List<WebElement> dates = driver.findElements(By.className("day"));
		int count = dates.size();
		for(int i=0;i<count;i++)
		{
			String text = dates.get(i).getText();
			if(text.equalsIgnoreCase("16"))
			{
				dates.get(i).click();
				break;
			}
		}
		driver.close();
	}

}
