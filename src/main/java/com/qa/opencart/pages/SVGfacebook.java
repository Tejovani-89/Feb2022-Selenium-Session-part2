package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGfacebook {

	public static void main(String[] args) throws InterruptedException {
	
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("tejovani_n@yahoo.co.in");
			driver.findElement(By.id("pass")).sendKeys("praveenm");
			driver.findElement(By.name("login")).click();
			
			Thread.sleep(10);
			driver.findElement(By.xpath("//*[local-name()='svg' ]//*[name()='g' and @mask='url(#jsc_c_2d)']//*[name()='image']")).click();
			
			

	}

}
