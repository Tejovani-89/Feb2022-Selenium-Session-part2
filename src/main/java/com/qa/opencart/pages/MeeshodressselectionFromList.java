package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MeeshodressselectionFromList {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.meesho.com/");
		
		driver.findElement(By.className("Text__StyledText-oo0kvp-0 dAZEcr TextSearch__Input-n7qqmw-4 bJlUTz search-input-elm TextSearch__Input-n7qqmw-4 bJlUTz search-input-elm"));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/p")).click();
	}

}
