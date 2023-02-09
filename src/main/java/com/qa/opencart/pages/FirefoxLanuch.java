package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxLanuch {

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\DELL\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);

	}

}
