package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementEenadu {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		
		WebElement contentmenu = driver.findElement(By.className("menulink"));
		
		Actions act = new Actions(driver);
		act.moveToElement(contentmenu).build().perform();
		
		driver.findElement(By.linkText("COURSES")).click();

	}

}
