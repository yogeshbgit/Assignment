package AssignmentTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:/YOGI/Softwares/Testing/Firefox Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		String  email="yogeshbingi0@gmail.com";
		String password = "prabhayash16";
//		driver.findElement(By.id("identifierId")).sendKeys(email);
//		driver.findElement(By.cssSelector(".VfPpkd-vQzf8d")).click();
		driver.close();
	}

}
