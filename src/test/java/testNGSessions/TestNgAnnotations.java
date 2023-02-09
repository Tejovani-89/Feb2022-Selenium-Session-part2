package testNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	@BeforeSuite
	public void connectDB()
	{
		System.out.println("BS---connect with DB");
	}
	
	@BeforeTest
	public void createUser()
	{
		System.out.println("BT---create user");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BC---launch Browser");
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println("BM-----login to app");
	}
	
	@Test
	public void homePageTitleTest()
	{
		System.out.println("hp---titleTest");
	}
	
	@Test
	public void homePageUrlTest()
	{
		System.out.println("hp---urlTest");
	}
	
	@Test
	public void isUserLoggedInTest()
	{
		System.out.println("hp---userloggedin");
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("AF---logout");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("AC---close browser");
	}
	
	@AfterTest
	public void deleteUser()
	{
		System.out.println("AT---delete user");
	}
	
	@AfterSuite
	public void disconnectWithDB()
	{
		System.out.println("AS---- disconnectwithDB");
	}
}
