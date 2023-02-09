package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		//co.setHeadless(true);
		//        or
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		
		
		
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.setHeadless(true);
//		WebDriver driver = new FirefoxDriver(fo);
		
		
		
//		WebDriverManager.edgedriver().setup();	
//		EdgeOptions eo = new EdgeOptions();
//		eo.setHeadless(true);
//		WebDriver driver = new EdgeDriver(eo);
//		
		
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
