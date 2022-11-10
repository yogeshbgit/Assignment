package Testing;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import PageObject.SearchModel;
import org.testng.Assert;

public class ProductSearch 
{

	@SuppressWarnings("deprecation")
	@Test
	public  void productsearch() throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		SearchModel sm = new SearchModel(driver);
		//sm.search().sendKeys("banana");
		//sm.gosubmit().click();
		sm.allproductlist();
		int count = sm.allproductlist().size();
		for(int i=0;i<count;i++)
		{
			String veggietext = sm.allproductlist().get(i).getText();
			if(veggietext.equalsIgnoreCase("Cauliflower - 1 Kg") )
			{
				for(int j=0;j<9;j++)
				{
					sm.increment().get(i).click();
				}
				
				sm.addcart().get(i).click();
			}
			if(veggietext.equalsIgnoreCase("Tomato - 1 Kg"))
			{
				for(int j=0;j<3;j++)
				{
					sm.increment().get(i).click();
				}
				
				sm.addcart().get(i).click();
			}
			if(veggietext.equalsIgnoreCase("Beetroot - 1 Kg"))
			{
				for(int j=0;j<7;j++)
				{
					sm.increment().get(i).click();
				}
				
				sm.addcart().get(i).click();
			}
		}
		
	
		sm.listbag().click();
		 FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("C:\\User\\scnshot1.png"));
		sm.proceed().click();
		String promocode = "rahulshettyacademy";
		sm.promocode().sendKeys(promocode);
		sm.promoapply().click();
		String vegginame = null ;
		String veggiqty  = null;
		String amount  = null;
		String totalamt = null ;
		for(WebElement sp : sm.selectedlist() )
		{
			vegginame = sp.getText();
			System.out.print(vegginame+"\t");
			
		}
		
		System.out.println("");
		for(WebElement sp2 : sm.quantity() )
		{
			veggiqty = sp2.getText();
			System.out.print(veggiqty+"\t"+"\t"+"\t");
		}
		System.out.println("");
		for(WebElement sp1 : sm.amount())
		{
			amount = sp1.getText();
			System.out.print(amount+"\t"+"\t"+"\t");
		}
		System.out.println("");
		for(WebElement sp3 : sm.totalamount() )
		{
			totalamt=sp3.getText();
			System.out.print(totalamt+"\t"+"\t"+"\t");
		}
		System.out.println("");
		Thread.sleep(5000);
		System.out.println("totam amount after discount : "+sm.discountamount().getText());
		Thread.sleep(2000);
		 FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("C:\\User\\scnshot2.png"));
		sm.placeorder().click();
		WebElement selectoption = sm.country();
		Select dropdown = new Select(selectoption);
		dropdown.selectByVisibleText("India");
		sm.Agreecheckbox().click();
		sm.finalproceed().click();
		//Thread.sleep(2000);
//		TakesScreenshot scrShot =((TakesScreenshot)driver);
//		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//		File DestFile=new File("C:\\Users\\Lenovo\\eclipse-workspace\\TestNG practise(7.11.22)\\src\\Testing\\screenshot.png");
//        //Copy file at destination
//        FileUtils.copyFile(SrcFile, DestFile);
        //or 
        FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("C:\\User\\scnshot3.png"));
        driver.close();
       
     
	}
}
