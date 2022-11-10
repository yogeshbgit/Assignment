package frametest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import Resource.base;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException
	{
//		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		base bs = new base();
		WebDriver driver= bs.initilazier();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int rescode = conn.getResponseCode();
			System.out.println(rescode);
			
			if(rescode>=400)
			{
				System.out.println("broken link name: "+link.getText());
			}
			a.assertTrue(rescode<400,"This is broken link : "+link.getText()+" with code "+rescode);
		}
		a.assertAll();
	}
	

}
