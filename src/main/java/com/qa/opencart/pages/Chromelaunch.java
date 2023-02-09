package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromelaunch {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		if(title.equalsIgnoreCase("Firefox")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
		
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		
		
	}
	

}
