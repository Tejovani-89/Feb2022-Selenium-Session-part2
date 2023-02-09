package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketCaptureText {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		WebElement categoryName = driver.findElement(By.linkText("SHOP BY CATEGORY"));
		Actions act = new Actions(driver);
		act.moveToElement(categoryName).perform();
		
		List<WebElement> level1List = driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
		for (WebElement e1 : level1List) {
			act.moveToElement(e1).perform();
			System.out.println(e1.getText());
			
			List<WebElement> level2List = driver.findElements(By.xpath("(//ul[contains(@class,'nav-stacked')])[last()]/li"));
			
			for(WebElement e2 : level2List) {
				act.moveToElement(e2).perform();
				System.out.println(e2.getText());
				
				
				List<WebElement> level3List = driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[last()-1]//a"));
				for(WebElement e3 : level3List) {
					act.moveToElement(e3).perform();
					System.out.println(e3.getText());
				}
			}
			
			
			
		}
		
	}

}
