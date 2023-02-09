package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iteraUsingXpath {
    static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Tejovani");
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("3597622841");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("teju@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("teju123");
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("mgr nagar velachery chennai");
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button")).click();
		
		

	}

}
