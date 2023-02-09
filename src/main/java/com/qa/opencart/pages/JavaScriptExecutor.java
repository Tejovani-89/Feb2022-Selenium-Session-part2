package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("alert('Hello')");

	
	JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
	String title = jsUtil.getTitleByJS();
	System.out.println(title);
		
	// jsUtil.generateAlert("this is my js pop up");
	
//	String innertext = jsUtil.getPageInnerText();
//	System.out.println(innertext);
//	System.out.println(innertext.contains("Testimonials"));
//	if(innertext.contains("Shop by Category")) {
//		System.out.println("PASS");
//	}
	
	// jsUtil.refreshBrowserByJS();
	
	
//	WebElement submit = driver.findElement(By.id("Form_getForm_action_submitForm"));
//	jsUtil.drawBorder(submit);
	
	
//		WebElement FullName = driver.findElement(By.id("Form_getForm_FullName"));
//		WebElement Email = driver.findElement(By.id("Form_getForm_Email"));
//		
//		jsUtil.flash(Email);
//		Email.sendKeys("kushma.nuguri@gmail.com");
//		jsUtil.flash(FullName);
//		FullName.sendKeys("Tejovani");

	
//	jsUtil.scrollPageDown();
//	Thread.sleep(3000);
//	jsUtil.scrollPageUp();
//	Thread.sleep(3000);
//	jsUtil.scrollPageDown("500");
	
//	WebElement heading = driver.findElement(By.xpath("//span[text()=' Health & Personal care']"));
//	jsUtil.scrollIntoView(heading);
//	System.out.println(heading.getText());
	
	//jsUtil.sendKeysUsingWithId("Form_getForm_Email", "kushma.m@gmail.com");
	
	jsUtil.navigateToBackPage();
	
	
	
	}

}
