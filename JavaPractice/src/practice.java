import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
			
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+ "\t");
			}
			System.out.println();
		}*/
		
		System.setProperty("webdriver.chrome.driver", "E:/YOGI/Softwares/Testing/chrome Driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yogesh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bingi");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("yogeshbingi@gmai.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("yogeshbingi2022");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
/*WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
Actions actions = new Actions(driver);
actions.moveToElement(element).click().build().perform();*/
		Thread.sleep(2000);
		driver.close();
	}

}
