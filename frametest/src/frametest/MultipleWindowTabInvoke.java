package frametest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowTabInvoke {

	static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String parentwind= driver.getWindowHandle();
		List<WebElement> links = driver.findElements(By.xpath("(//table/tbody/tr/td/ul)[1]/li/a"));
		int sizeoflink = links.size();
		//System.out.println("size : "+sizeoflink);
		for(int i=0;i<sizeoflink;i++)
		{
			//System.out.println("link name : "+links.get(i).getText());
			String linktonewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			links.get(i).sendKeys(linktonewtab);
		}
		Set<String> windowhandles = driver.getWindowHandles();
		//First Method
		Iterator<String> it = windowhandles.iterator();
		/*String tab1 = it.next();
		String tab2 = it.next();
		String tab3 = it.next();
		String tab4 = it.next();
		String tab5 = it.next();
		String tabtitle=driver.switchTo().window(tab2).getTitle();
		System.out.println("tab title : "+tabtitle);*/
		
		
		//Second Method
		List<String> windowlist = new ArrayList<String>(windowhandles);
		if(switchtoreqwindow("Appium", windowlist))
		{
			System.out.println("final  title : "+driver.getTitle());
		}
		
		for(String w : windowlist)
		{
			if(!w.equals(parentwind))
			{
				driver.switchTo().window(w).close();
			}
		}
	
	}
	
	public static boolean switchtoreqwindow(String tabtitle, List<String>windowlist)
	{
		for(String window : windowlist)
		{
			String title = driver.switchTo().window(window).getTitle();
			if(title.contains(tabtitle))
			{
				System.out.println("landed on req page");
				return true;
			}
			
		}
		return false;
	}

}
