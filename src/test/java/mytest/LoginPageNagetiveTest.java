package mytest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNagetiveTest extends BaseTest {

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			
			{"test1212@gmail.com" , "test1212123"},
			{"vani@gmail.com" , "teja45632"},
			{"teju06@gmail.com" , "test@1234"},
			{"@*#%$^&" , "*%^&*"},
			{"    " , "    "}
			
			
		};
		
	}
	
	

	
	@Test(dataProvider = "getLoginData")
	public void wrongDataLoginTest(String username , String paswrd) {
		
		//working
		
		driver.get("https://www.webs.com/s/login/relogin");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(paswrd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String errMsg = driver.findElement(By.xpath("//div[@class='alert-subtitle']")).getText();
		System.out.println(errMsg);
		Assert.assertTrue(errMsg.contains("Incorrect email (or username) and password combination"));
		

		//Not working
		
//		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
//
//		driver.findElement(By.id("input-email")).sendKeys("teju@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String errMsg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
//		System.out.println(errMsg);
//		Assert.assertTrue(errMsg.contains("Warning: No match for E-Mail Address and/or Password."));

		
	
		
		
		
		
	}

}
