package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchsuggetions {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("naveen automations");
		Thread.sleep(3000);
		
		List<WebElement>suggetionList = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span"));
		
		System.out.println(suggetionList.size());
		
		for(WebElement e : suggetionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("naveen automationlabs github")) {
				e.click();
			}
		}

	}

}
