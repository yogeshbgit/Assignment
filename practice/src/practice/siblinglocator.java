package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class siblinglocator {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//div/button[1]")).getText()); //parent to child
		System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).getText());//parent to child to sibling
		System.out.println(driver.findElement(By.xpath("//div/button[1]/parent::div")).getText()); // child to parent
		
	}

}
