package mytest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class antropyOpenCartNegTest extends BaseTest{
	
	@DataProvider
	public Object[][] getNegetiveData(){
		return new Object[][] {
			
			{"test1212@gmail.com" , "test1212123"},
			{"vani@gmail.com" , "teja45632"},
			{"teju06@gmail.com" , "test@1234"},
			{"@*#%$^&" , "*%^&*"},
			{"    " , "    "}
			
		};
		
	}
	
	
	@Test
	public void getNegetiveDataTest(String name , String pswd) {
		driver.get("https://www.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys(name);
		driver.findElement(By.id("input-password")).sendKeys(pswd);
		driver.findElement(By.xpath("(//div[@class='col-sm-6']/button)[1]")).click();
		
		String errMg = driver.findElement(By.cssSelector("div.alert.alert-danger")).getText();
	System.out.println(errMg);
	Assert.assertTrue(errMg.contains("No match for E-Mail and/or Password."));
	
	
	}
}
