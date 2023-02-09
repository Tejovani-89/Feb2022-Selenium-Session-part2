package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownOptions {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.id("Form_getForm_Country");
		//printSelectDropDownValue(country);
		//selectValueFromDropDownList(country , "India");
		List<String> CountryList = getSelectDropDownValuesList(country);
			if(CountryList.contains("Central African Republic")) System.out.println("PASS");
			if(CountryList.contains("Lesotho")) System.out.println("PASS");
			if(CountryList.contains("Panama")) System.out.println("PASS");
			
		
		//WebElement countylist = driver.findElement(country);
		
//		Select select = new Select(countylist);
//		
//		List<WebElement> countryoptions = select.getOptions();
//		System.out.println(countryoptions.size());
//		
//		for(WebElement e : countryoptions) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("india")) {
//				e.click();
//				break;
//			}
//		}
		


	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public  static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getSelectDropDownValueList(By locator) {
		return driver.findElements(locator).size();
	}
	
	public static List<String> getSelectDropDownValuesList(By locator) {
		List<String> valuesList = new ArrayList<String>(); 
		
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for(WebElement e : optionsList) {
			String text = e.getText();
			valuesList.add(text);
		}
		return valuesList;
	}
	
	
	public static void selectValueFromDropDownList(By locator ,  String value) {
		Select select = new Select (getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
			}
	}
	
	public static void printSelectDropDownValue(By locator) {
		
         Select select = new Select(getElement(locator));
		
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			
		}
	
}
}