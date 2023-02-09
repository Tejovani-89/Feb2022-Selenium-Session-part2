package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAmazonHelp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		String helptext = driver
//				.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility']/ul)[last()]/li)[last()]/a"))
//				.getText();
//		System.out.println(helptext);
		
		String Amzninstgrm = driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility']/ul)[position()=2]/li)[last()]")).getText();
		System.out.println(Amzninstgrm);
	}

}
