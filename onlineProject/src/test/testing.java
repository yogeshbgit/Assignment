 package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/Chrome/chromedriver.exe");
		WebDriver driver =new  ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("tab title : "+title);
		Assert.assertEquals(title,"Google");
		String currenturl =driver.getCurrentUrl();
		System.out.println("current url : "+currenturl);
		//Assert.assertEquals(currenturl,"google.co.in");
		SoftAssert sf = new SoftAssert();
		sf.assertEquals(currenturl, " google.com");
		//Assert.assertEquals(currenturl,"https://www.google.com/");
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("flipkart");
		List<WebElement>list = driver.findElements(By.cssSelector("ul[class='erkvQe'] div ul li"));
		for(WebElement option : list)
		{
			
			if(option.equals("flipkart"))
			{
				option.click();
			}
			break;
		}
		driver.close();
		
		
	

	}

}
