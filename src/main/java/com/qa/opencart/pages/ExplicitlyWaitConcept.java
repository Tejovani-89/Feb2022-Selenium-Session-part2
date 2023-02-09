package com.qa.opencart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

		By name = By.id("Form_getForm_FullName");
		By email = By.id("Form_getForm_Email");
		By phoneNum = By.id("Form_getForm_Contact");
		
		waitForElementPresence(name, 10).sendKeys("Tejovani");
		waitForElementPresence(email, 5).sendKeys("teju@gmail.com");
		getElement(phoneNum).sendKeys("9325874632");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement name_ele = wait.until(ExpectedConditions.presenceOfElementLocated(name));
//		name_ele.sendKeys("Tejovani");
//		
//		driver.findElement(email).sendKeys("teju@gmail.com");
//		driver.findElement(phoneNum).sendKeys("9025648723");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static WebElement waitForElementPresence(By locator , int timeOut ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForElementVisible(By locator , int timeOut ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
}
