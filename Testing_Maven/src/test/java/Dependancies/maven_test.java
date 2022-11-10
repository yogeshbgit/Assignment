package Dependancies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_test {


@Test
public void testng()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://testng.org/doc/maven.html");
}

@Test
public  void webdrivermanager()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager");
}

@Test
public void seleniumJava()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java");
}

}
