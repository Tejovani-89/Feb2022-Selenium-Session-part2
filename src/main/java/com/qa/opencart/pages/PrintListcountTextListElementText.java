package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintListcountTextListElementText {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		
		By RightPannelLinks = By.xpath("//aside[@id ='column-right']//a");
		List<String> ActTextList = getElementsTextList(RightPannelLinks);
		System.out.println(ActTextList);
		System.out.println(getElementsListCount(RightPannelLinks));
		printAllElementText(RightPannelLinks);
		
//		ElementUtils eleutls = new ElementUtils(driver);
//		eleutls.clickOnElementFromSection(RightPannelLinks, "My Account");
		
		
	}
	
public static int getElementsListCount(By locator) {
	return driver.findElements(locator).size();
}

// Text will be displayed horizontally (-------)

public static List<String> getElementsTextList(By locator) {
	List<String> eleTextList = new ArrayList<String>();
	List<WebElement> elelist = driver.findElements(locator);
	for(WebElement e :elelist) {
		String text = e.getText();
		eleTextList.add(text);
		}
	return eleTextList;
	
}


/*
 *  text will be displayed vertically(-)
 *                                    -
                                      -
 */
                                          
	public static void printAllElementText(By locator) {
		List<WebElement> elelist = driver.findElements(locator);
		for(WebElement e :elelist) {
			String text = e.getText();
			System.out.println(text);
		}
	}
	
	
}
