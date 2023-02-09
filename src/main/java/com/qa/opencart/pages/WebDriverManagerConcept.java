package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equalsIgnoreCase("google")) {
			System.out.println("Browser name is correct");
		}
		
		else {
			System.out.println("Browser name is incorrect");
		}
		
		
		driver.quit();
		
		//driver.close();
		
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		
		

	}

}
