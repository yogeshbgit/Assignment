package AssignmentTesting;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//		List<WebElement> links = driver.findElements(By.xpath("(//table/tbody/tr/td/ul)[1]/li/a"));
//		int sizeoflink = links.size();
//		System.out.println("size : "+sizeoflink);
//		for(int i=0;i<sizeoflink;i++)
//		{
//			System.out.println("link name : "+links.get(i).getText());
//			String linktonewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
//			links.get(i).sendKeys(linktonewtab);
//			
//		}
//		Set<String> win = driver.getWindowHandles();
//		Iterator<String> eachwin = win.iterator();
//		while(eachwin.hasNext())
//		{
//			driver.switchTo().window(eachwin.next());
//			System.out.println("titile of the link page : "+driver.getTitle());
//		}
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		int sizeoflink = links.size();
		System.out.println("size of link : "+sizeoflink);
		int  i = 1;
		//SoftAssert a = new SoftAssert();
		for(WebElement link : links)
		{
//			System.out.println(i+". links names : "+link.getText());
//			i++;
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int rescode = conn.getResponseCode();
			System.out.println(i+"."+link.getText()+" - with Response Code :  "+rescode);
			i++;
			if(rescode>=400)
			{
				System.out.println("Broken link : "+link.getText());
			}
			//a.assertTrue(rescode<400,"This is broken link : "+link.getText()+" with code "+rescode);
			
		}
		//a.assertAll();
		driver.close();
	}

}
