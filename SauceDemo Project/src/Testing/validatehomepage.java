package Testing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObjectRepository.*;
import Resource.base;

public class validatehomepage extends base {

	public WebDriver driver;
	
	@Test(priority = 1)
	public void addtocart() throws IOException, InterruptedException 
	{
		
		validateLoginPage vlp = new validateLoginPage();
		vlp.loginpage();
		this.driver=vlp.driver;
		homepage prodlist = new  homepage(driver);
		String[] product = {"Sauce Labs Bolt T-Shirt","Sauce Labs Bike Light","Sauce Labs Onesie","Sauce Labs Fleece Jacket"};
		List<WebElement> list = prodlist.prodlist1();
		List<WebElement> cart = prodlist.addtocart();
	for(int i=0;i<list.size();i++)
		{
			String names = list.get(i).getText();
			List<String> needlist = Arrays.asList(product);
			if(needlist.contains(names))
			{
				//to open product 
				//list.get(i).click();
				//to add cart
				cart.get(i).click();
			}
		}
	}
	@Test(dependsOnMethods = {"addtocart"},enabled=true)
	public void validatetabtitle() 
	{
		String actualtabtitle = driver.getTitle();
		String expectedtitle = "Swag Labs";
		Assert.assertEquals(actualtabtitle, expectedtitle);
		if(actualtabtitle.contentEquals(expectedtitle))
			System.out.println("tab title verified");
		
	}
	@Test(dependsOnMethods = {"addtocart"},enabled=true)
	public void  validatefilter() throws IOException
	{
		homepage hmpage = new  homepage(driver);
		System.out.println("size of list before  filter: "+hmpage.prodlist1().size());
		ArrayList<String> beforpdlist = new ArrayList<String>();
		for(WebElement list: hmpage.prodlist1())
		{
			String text = list.getText();
			beforpdlist.add(text);
			//System.out.println("before filter list : "+text);
			
		}
		hmpage.getfilter();
		ArrayList<String> afterpdlist = new ArrayList<String>();
		
		for(WebElement list: hmpage.prodlist1())
		{
			String text = list.getText();
			afterpdlist.add(text);
			//System.out.println("after filter list : "+text);
			
		}
//		JavaScriptUtils js = new JavaScriptUtils();
//		js.scrolling(800, driver);
		Collections.sort(afterpdlist);  
		Assert.assertEquals(beforpdlist, afterpdlist);
		hmpage.getagainfilter();
		//getscreenshot(driver,"screenshot");
	}
	
	@Test(dependsOnMethods = {"validatefilter"},enabled=true)
	public void validatecart()
	{
		homepage hmpage = new  homepage(driver);
		hmpage.getcart().click();
		
	}
	@AfterTest(enabled=true)
	public void closetab()
	{
		driver.close();
	}
}
