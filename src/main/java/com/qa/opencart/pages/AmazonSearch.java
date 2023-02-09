package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("camera");
		Thread.sleep(3000);
		
		List<WebElement> cameraList = driver.findElements(By.xpath("//div[@class='s-suggestion-container']//span"));
		System.out.println(cameraList.size());
		
		
		for(WebElement e : cameraList) {
			String Text = e.getText();
			System.out.println(Text);
			if(Text.contains("stand")) {
				e.click();
			}
		}
	}

}
