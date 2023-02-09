package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriversessionId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();

		driver.get("https://google.com");
		driver1.get("https://www.amazon.in/");
		driver2.get("https://www.flipkart.com/");

	}

}
