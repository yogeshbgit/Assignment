import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.apache.xerces.impl.dv.dtd.NMTOKENDatatypeValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Resource.Pageobject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Veggy_Shoppy {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] veglist = {"Brocolli","Cucumber","Beetroot","Tomato","Brinjal","Beans"};
			int j=0;
			Pageobject pg  = new Pageobject(driver);
			System.out.println("Title : "+pg.gettitle().getText());
			List<WebElement> alllist =  pg.getallist();
			List<WebElement> incr = pg.getincr();
			for(int i=0;i<alllist.size();i++)
			{
			 //System.out.println(alllist.get(i).getText());
			 String[] names = alllist.get(i).getText().split("-"); 
			 String veg = names[0].trim();
			 List needlist = Arrays.asList(veglist);
			 if(needlist.contains(veg))
			 {
				 if(veg.contains("Cucumber")||veg.contains("Tomato"))
				 {
					 for(int k=0;k<=5;k++)
					 {
						 incr.get(i).click();
					 }
					
				 }
				 pg.getaddcart().get(i).click();
				 Thread.sleep(1500);
				 
			 }
			 if(j==veglist.length)
			 {
				 break;
			 }
			}
			Thread.sleep(2000);
			pg.getcart().click();
			pg.getproceed().click();
			Thread.sleep(2000);
			List<WebElement> addedlist = pg.getaddedlist();
			for(int i=0;i<addedlist.size();i++)
			{
				String nm = addedlist.get(i).getText().split("-")[0].trim();
				System.out.println("added list : "+nm);
				for(String s : veglist)
				{
					if(s.contains(nm))
					{
						System.out.println("both are matched");
					}
					
					
				}
			}
		for(int l=0;l<veglist.length;l++)
		{
		
			System.out.println("Veg : "+veglist[l]+"| Quantity : "+pg.getqty().get(l).getText()+"| Amount : "+pg.getamount().get(l).getText());
		}
		int ttsum= pg.getsum();
		int total = pg.gettotal();
		System.out.println("sum = "+ttsum);
		System.out.println("total = "+total);
		if(ttsum==total)
		{
			System.out.println("Both total amount matched");
		}
			driver.close();
		
	}

}
