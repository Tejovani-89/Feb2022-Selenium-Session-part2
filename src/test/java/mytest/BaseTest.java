package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	
	@BeforeTest
	
	@org.testng.annotations.Parameters({"browser" , "url" , "headless"})
	
	public void setUpTest(String browserName , String appURL , String headless) {
		System.out.println("Browser name is : " +  browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions co = new ChromeOptions();
			if(Boolean.parseBoolean(headless)) {
				co.setHeadless(true);
			}
			
			driver = new ChromeDriver(co);
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			
		}
		else
		{
			System.out.println("Please provide the right browser :" +browserName);
		}
		driver.get(appURL);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

	}
	
	@AfterTest

	public void tearDown() {
		driver.close();
	}

	

}
