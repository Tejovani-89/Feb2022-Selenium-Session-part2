package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Meeshofooterlinks {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		
//By footerlinks = By.xpath("//div[@class='links-container']//span/a");
	
		
	 
	//By imgLink = By.xpath("//div[@class='NewProductCardstyled__ProductImage-sc-6y2tys-18 kiiIIO']");

	
	
//List<WebElement> optionlinks = driver.findElements(footerlinks);
//
//System.out.println(optionlinks.size());
//for(WebElement e : optionlinks) {
//	String text = e.getText();
//	if(!text.isEmpty()) {
//		System.out.println(text);
//	}
//	if(text.contains("Eye Lenses")) {
//		e.click();
//		break;
//	}
//}

//ElementUtils eleutil = new ElementUtils(driver);

//eleutil.clickOnElementFromSection(footerlinks, "Umbrellas");

//i am getting only count 
//eleutil.clickOnElementFromSection(imgLink, "Feminine Fancy Jewellery Sets");

	}

}
