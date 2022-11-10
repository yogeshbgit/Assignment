package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver  =  new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		//Thread.sleep(4000);
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop table");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ap_email")).sendKeys("9373039372");
		driver.findElement(By.id("continue")).click();
		//Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("prabhayash");
		driver.findElement(By.id("signInSubmit")).click();
		
		/*int no = 5 ;
		//System.out.println(no + " this is  no testing ");
		String name = "yogesh";
		//System.out.println(name+" this is my name");
		int[] nos = {1,3,4,5,6,7,8,10};
		for(int n : nos)
		{
			if(n %2 == 0)
			{
				//System.out.println(n);
			}
			
		}
		String[] name1 = {"Yogesh","Bingi","Rajesh"};
		for(String nm : name1)
		{
			System.out.println(nm);
		}*/
		
	}

}
