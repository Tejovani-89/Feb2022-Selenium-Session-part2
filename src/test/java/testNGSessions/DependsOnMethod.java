package testNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void homePageTest() {
		System.out.println("HP test");
		//int i = 9/0;
	}
	
	@Test(dependsOnMethods = "homePageTest")
	public void searchTest() {
		System.out.println("Search test");
	}
	
	@Test(dependsOnMethods = "homePageTest")
	public void addToCartTest() {
		System.out.println("HP test");
	}

}
