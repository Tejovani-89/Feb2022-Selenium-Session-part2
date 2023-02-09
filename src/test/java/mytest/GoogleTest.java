package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;
  
public class GoogleTest extends BaseTest {
	

	@Test(priority=1)
	
	public void googleTitleTest() {
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2)
	public void googleUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}
	
	
	

}
