package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownListWithoutSelect {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By Country = By.xpath("//select[@id='Form_getForm_Country']//option");
		selectValueFromDropDown(Country, "India");
		
		
		
//		for(WebElement e : countryoptions) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("India")) {
//				e.click();
//				break;
//			}
//		}
//		

	}

	
	public static void selectValueFromDropDown(By locator ,String value) {
		List<WebElement> countryoptions = driver.findElements(locator);
		System.out.println(countryoptions.size());
		
		for(int i=0 ; i<=countryoptions.size() ; i++) {
			String text = countryoptions.get(i).getText();
		System.out.println(text);
		if(text.contains(value)) {
			countryoptions.get(i).click();
			break;
			
		}
		}
	}
}
