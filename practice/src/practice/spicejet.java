package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejet {

	public static void main1(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//**********static dropDown
//		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select drop = new Select(dropdown);
//		drop.selectByIndex(3);
//		System.out.println(drop.getFirstSelectedOption().getText());
//		drop.selectByValue("AED"); //html value
//		System.out.println(drop.getFirstSelectedOption().getText());
//		drop.selectByVisibleText("INR");
//		System.out.println(drop.getFirstSelectedOption().getText());
		
		
		//**********Dynamic dropDown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
//		int i=1;
//		while(i<5)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//
//		}
		// we can use while or for loop to increase adults
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(1000);
		driver.close();
		
	}

	
}
