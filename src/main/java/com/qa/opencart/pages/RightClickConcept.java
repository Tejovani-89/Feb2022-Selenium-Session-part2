package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement RightClickMe = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act = new Actions(driver);
		act.contextClick(RightClickMe).perform();
		
		List<WebElement> RightClickList = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
		
		//System.out.println(RightClickList);
		for(WebElement e : RightClickList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Edit")) {
				e.click();
				break;
			}
			
		}
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
	}

}
