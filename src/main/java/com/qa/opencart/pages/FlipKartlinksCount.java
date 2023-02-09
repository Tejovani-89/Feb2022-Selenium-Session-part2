package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartlinksCount {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> linkListFK = driver.findElements(By.tagName("a"));
		System.out.println(linkListFK.size());
		
		for(int i=0 ; i<=linkListFK.size(); i++) {
			String FKlinktext = linkListFK.get(i).getText();
			if(!FKlinktext.isEmpty()) {
				System.out.println(FKlinktext);
			}
			
		}

	}

}
