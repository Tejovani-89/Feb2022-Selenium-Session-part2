package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoWbTable {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/afghanistan-in-sri-lanka-2022-23-1340530/sri-lanka-vs-afghanistan-3rd-odi-1340534/full-scorecard");
		

	
		
		//System.out.println(selectBatsName("Najibullah Zadran"));
		System.out.println(selectWktName("Ibrahim Zadran"));
	
	}


	public static List<WebElement> getElement(By locator) {
		 return driver.findElements(locator);
	}
	
	
	public static String selectBatsName(String name) {
		String Xpath ="//td//span[text()='"+name+"']/ancestor::td/following-sibling::td";
		return driver.findElement(By.xpath(Xpath)).getText();
		
	}
	
	public static List<String> selectWktName(String plyrname) {
		String XpathWkt = "//table[contains(@class,'ci-scorecard-table')]//td//span[text()='"+plyrname+"']/ancestor::td/following-sibling::td";
		 List<WebElement> scoreList = driver.findElements(By.xpath(XpathWkt));
		 List<String> scoreValList = new ArrayList<String>();
		 for(WebElement e : scoreList) {
			String text =  e.getText();
			scoreValList.add(text);
		 }
		 return scoreValList;
	}
	
}
