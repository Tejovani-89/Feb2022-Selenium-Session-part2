package com.qa.opencart.pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationTo {

	public static void main(String[] args) {
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		//driver.navigate().to("http://www.amazon.in/");
		try {
			driver.navigate().to(new URL("https://www.facebook.com/"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		
		
	
	}

}
