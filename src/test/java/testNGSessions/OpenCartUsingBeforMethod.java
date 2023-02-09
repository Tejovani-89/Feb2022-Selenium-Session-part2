package testNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartUsingBeforMethod {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	}
	
	
		@Test
		public void titleTest() {
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Register Account");
		}
		
		@Test
		public void urlTest() {
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Assert.assertTrue(url.contains("register&language=en-gb"));
		}
		
		
		
		
		@Test
		public void cartButtnTest() {
			 Assert.assertTrue(driver.findElement(By.xpath("//button[contains(@class,'dropdown-toggle')]")).isDisplayed());
		
		
		}
		
	 	@AfterMethod
		
		public void tearDown() {
			driver.close();
		}
		
		
	
	

}
