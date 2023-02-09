package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitvsClose {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.quit();
		
		driver.close();
		
		
		 driver = new ChromeDriver();
		 driver.get("https://www.eenadu.net/");
	     System.out.println(driver.getTitle());
		 
		
		
		
	}

}
