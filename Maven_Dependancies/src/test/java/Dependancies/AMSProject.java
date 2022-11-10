package Dependancies;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resource.XLUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AMSProject {
	public WebDriver driver;
	@Test(dataProvider="getData")
	public void logintest(String username,String password,String resp) throws InterruptedException, MalformedURLException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			driver.get("https://ams-in.capita.co.in/Mypage/Home.aspx");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.name("loginfmt")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
			boolean error = driver.findElement(By.id("usernameError")).isDisplayed();
			String usererrormess = driver.findElement(By.id("usernameError")).getText();
			if(error)
			{
				System.out.println("error messege : "+usererrormess);
				Assert.assertTrue(false);
			}
			else {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='idBtn_Back']")).click();
			}
			

	}
	
	
	
	@DataProvider
	public String [][] getData() throws IOException
	{
		/*String loginData[][]= {
								{"admin@yourstore.com","admin","Valid"},
								{"admin@yourstore.com","adm","Invalid"},
								{"adm@yourstore.com","admin","Invalid"},
								{"adm@yourstore.com","adm","Invalid"}
							};*/
		
		//get the data from excel
		String path="C://User//datatestbook1.xlsx";
		XLUtility xlutil=new XLUtility(path);
		
		int totalrows=xlutil.getRowCount("LoginData");
		int totalcols=xlutil.getCellCount("LoginData",1);	
				
		String loginData[][]=new String[totalrows][totalcols];
			
		
		for(int i=1;i<=totalrows;i++) //1
		{
			for(int j=0;j<totalcols;j++) //0
			{
				loginData[i-1][j]=xlutil.getCellData("LoginData", i, j);
			}
				
		}
		
		return loginData;
	}
	
	@AfterTest
	void tearDown()
	{
		driver.close();
	}
	
}
