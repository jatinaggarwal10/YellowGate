package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignUp {
	
	public WebDriver driver;
	 public String baseUrl ="http://139.59.8.241:3005/";
	 
	@BeforeClass
	public void init() {
		
		//String fileLocation = System.getProperty("C:\\Users\\DOGETHER\\Desktop\\Website")+"\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", fileLocation);


		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DOGETHER\\Desktop\\Website\\chromedriver.exe");
		
		  driver =new ChromeDriver();
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=0)
	
	public void Airport() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div/div[2]/div/form/div[5]/div/div/button/span"));

		Actions actions = new Actions(driver);

		actions.moveToElement(element).click().perform();
		
		
		System.out.println("Hello");
		
		
	}

}
