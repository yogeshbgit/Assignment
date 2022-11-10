package AssignmentTesting;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AllTypeElementPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement>radiolist=driver.findElements(By.xpath("(//fieldset)[1]/label"));
		List<WebElement>radiobutton = driver.findElements(By.cssSelector("input[name='radioButton']"));
		for(int i=0;i<radiolist.size();i++)
		{
			if(radiolist.get(i).getText().equalsIgnoreCase("Radio2"))
			{
				radiobutton.get(i).click();
				
			}
		}
		//#autocomplete
		//.ui-menu-item-wrapper
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		List<WebElement> countrylist = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
		for(WebElement list : countrylist)
		{
			if(list.getText().equalsIgnoreCase("India"))
			{	
				System.out.println("selected country : "+list.getText());
				list.click();
			}
		}
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dp = new Select(dropdown);
		dp.selectByIndex(2);
		List<WebElement>chkboxlist = driver.findElements(By.xpath("(//fieldset)[4]/label"));
		List<WebElement> checkbox = driver.findElements(By.cssSelector("input[type='checkbox']"));
		for(int i=0;i<chkboxlist.size();i++)
		{
			if(chkboxlist.get(i).getText().equalsIgnoreCase("Option3"))
				checkbox.get(i).click();
		}
		driver.findElement(By.id("opentab")).click();
		Set<String> windowshandle= driver.getWindowHandles();
		Iterator<String> it = windowshandle.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(parent);
		String expected = "Practice Page";
		String actual=driver.getTitle();
		System.out.println("tab title : "+actual);
		Assert.assertEquals(expected, actual);
//		driver.findElement(By.id("openwindow")).click();
//		Thread.sleep(2000);
//		driver.switchTo().window(parent);
		driver.findElement(By.id("name")).sendKeys("yogesh");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		System.out.println("show : "+driver.findElement(By.id("displayed-text")).isDisplayed());
		driver.findElement(By.id("show-textbox")).click();
		System.out.println("show : "+driver.findElement(By.id("displayed-text")).isDisplayed());
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)", "");
		driver.findElement(By.id("hide-textbox")).click();
		//scroll inside frame
		js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,500)");
		System.out.println("show : "+driver.findElement(By.id("displayed-text")).isDisplayed());
		
		List<WebElement> amountlist=driver.findElements(By.xpath("(//table[@id='product']/tbody)[2]/tr/td[4]"));
		int listsize = amountlist.size();
		int totalamount=0;
		for(WebElement am : amountlist)
		{
			String amount = am.getText();
			totalamount = totalamount + Integer.parseInt(amount);
		}
				System.out.println("total amount : "+totalamount);
		String[] actualamount = driver.findElement(By.className("totalAmount")).getText().trim().split(": ");
		//Total Amount Collected: 296
		int amnt=Integer.parseInt(actualamount[1]);
		System.out.println("actualamount : "+amnt);
		Assert.assertEquals(amnt, totalamount);
		js.executeScript("window.scrollBy(0,1000)", "");
		Actions ac = new Actions(driver);
		// for mouse hover action 
		ac.moveToElement(driver.findElement(By.id("mousehover"))).perform();
		//driver.findElement(By.cssSelector("div[class='mouse-hover-content'] a:nth-child(1)")).click();
		//driver.findElement(By.cssSelector("div[class='mouse-hover-content'] a:nth-child(2)")).click();
		//scrolling to target element to view
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("courses-iframe")));
		//enter into iframe 
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		//scrolling iframe
		js.executeScript("window.scrollBy(0,1000)", "");
		//exit from ifrmae
		driver.switchTo().defaultContent();
		//driver.quit();		
		
		
	}

}
