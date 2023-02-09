package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openCartLogin {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		 driver.findElement(By.id("input-email")).sendKeys("kushma.nuguri@gmail.com");
		 driver.findElement(By.id("input-password")).sendKeys("test@123");
		  Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='form-login']//button[@class='btn btn-primary']")).click();
		//button[@type='submit']
		
		
	}

}
