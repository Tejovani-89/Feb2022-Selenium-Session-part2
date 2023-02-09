package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMAppTest extends BaseTest {

	@Test
	public void orngHrmTitleTest() 
	{
		
		
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
	}

	@Test
	public void orngHrmUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("orangehrm-30-day-trial"));
	}

}
