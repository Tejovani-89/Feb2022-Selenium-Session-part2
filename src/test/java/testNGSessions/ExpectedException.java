package testNGSessions;

import org.testng.annotations.Test;

public class ExpectedException {
String name = "Teju";

	@Test(priority=1 , expectedExceptions = NullPointerException.class)
 	public void searchTest() {
		System.out.println("Samsung");
		
		ExpectedException obj = new ExpectedException();
		obj=null;
		System.out.println(obj.name);
		
	}
	
	
	
}
