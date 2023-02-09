package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropConceptJquery {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Actions act = new Actions(driver);
		WebElement sourceElem = driver.findElement(By.id("draggable"));
		WebElement targetelm = driver.findElement(By.id("droppable"));
		
		//act.clickAndHold(sourceElem).moveToElement(targetelm).release().build().perform();
		                       //   OR     //
		act.dragAndDrop(sourceElem, targetelm).perform();
		
	}

}
