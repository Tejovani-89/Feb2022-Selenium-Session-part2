package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketmouseOver {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		doProductMouseOverCategory("Baby Care", "Baby Food & Formula", "Organic Baby Food", "Similac Total Comfort");
		

//		WebElement shopname = driver.findElement(By.linkText("SHOP BY CATEGORY"));
//		Actions act = new Actions(driver);
//		act.moveToElement(shopname).build().perform();
//		Thread.sleep(3000);
//		
//		WebElement Bev = driver.findElement(By.linkText("Beverages"));
//		act.moveToElement(Bev).perform();
//		act.moveToElement(driver.findElement(By.linkText("Health Drink, Supplement"))).perform();
//		act.moveToElement(driver.findElement(By.linkText("Men & Women"))).perform();
//		act.moveToElement(driver.findElement(By.linkText("Sprite"))).click().build().perform();
		

	}
	
	public static WebElement getElement1(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doProductMouseOverCategory(String l1, String l2, String l3, String l4) throws InterruptedException {
		WebElement shopname = getElement1(By.linkText("SHOP BY CATEGORY"));
	Actions act = new Actions(driver);
	act.moveToElement(shopname).build().perform();
	Thread.sleep(3000);
	act.moveToElement(getElement1(By.linkText(l1))).perform();
	act.moveToElement(getElement1(By.linkText(l2))).perform();
	act.moveToElement(getElement1(By.linkText(l3))).perform();
	act.moveToElement(getElement1(By.linkText(l4))).click().build().perform();
	
	}


}
