package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opencartwithNameClassName {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//driver.get("https://www.freshworks.com/");
		
		
//		By email = By.name("email");
//		By password = By.name("password");
//		
//		ElementUtils eleutl = new ElementUtils(driver);
//		eleutl.dosendKeys(email, "tejovani_n@gmail.com");
//		eleutl.dosendKeys(password, "test2123");
//		
//		
//		driver.findElement(By.className("form-control")).sendKeys("tejovani_n@gmail.com");

		
		// ***** XPATH using directly copying ******
		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("tejovani_n@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
		
		
//		By emailid = By.xpath("//*[@id=\"input-email\"]");
//		By paswrd = By.xpath("//*[@id=\"input-password\"]");
//		By loginbtn = By.xpath("//*[@id=\"form-login\"]/button");
//		By alrtmsg = By.className("alert-danger");
//		
//		
//		doSendKeys(emailid, "tejovani_n@gmail.com");
//		doSendKeys(paswrd, "test@123");
//		doClick(loginbtn);
//		String actErrorMsg = doGetElementText(alrtmsg);
//		if(actErrorMsg.contains("Warning")) {
//			System.out.println("Correct msg");
//		}
//		else {
//			System.out.println("Incorrect Msg");
//		}
//		
		// **** CSS selector  ****
		
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("tejovani_n@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//		driver.findElement(By.cssSelector("#form-login > button")).click();
		
		//driver.findElement(By.linkText("Register")).click();
		
//		By RegisterLink = By.linkText("Register");
//		doClick(RegisterLink);
//		
		// partial link text
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		// Tag name
		
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
//		
		By Register = By.linkText("Register");
		doClick(Register);
		
		By firstname = By.id("input-firstname");
		doSendKeys(firstname, "Tejovani");
		By lastname = By.name("lastname");
		doSendKeys(lastname, "maisala");
		By emailid = By.xpath("//*[@id=\"input-email\"]");
		doSendKeys(emailid, "teju@yahoo.com");
		By passwrd = By.cssSelector("#input-password");
		doSendKeys(passwrd, "vani");
		
//		By ClickYes = By.xpath("//*[@id=\"form-register\"]/div/div/div/input");
//		doClick(ClickYes);
//		
		
		
	}
	
	
	public static String doGetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
