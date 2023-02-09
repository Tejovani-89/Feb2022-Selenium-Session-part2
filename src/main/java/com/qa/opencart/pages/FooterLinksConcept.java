package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinksConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/crm/marketing/?gspk=c29udWt1bWFyb2l6dWMyOTkx&utm_campaign=Growsumo&utm_medium=sonukumaroizuc2991-Growsumo&utm_source=Growsumo&utm_tactic_id=3667549");
		By footerList = By.xpath("//footer//ul[@class = 'footer-nav']//a");
		
		clickOnElementFromSection(footerList , "Freshdesk" );
	
	
	}
	
	public static void clickOnElementFromSection(By locator , String value) {
		
		List<WebElement> footerlist = driver.findElements(locator);
		System.out.println(footerlist.size());
		
		for(WebElement e : footerlist) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
	}

}
