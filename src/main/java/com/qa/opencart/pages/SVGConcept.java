package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		List<WebElement> statesList = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']"));
		System.out.println(statesList.size());
		Actions act = new Actions(driver);
		for(WebElement e : statesList) {
			
			act.moveToElement(e).perform();
			String name = e.getAttribute("name");
			System.out.println(name);
				if(name.equals("Maryland")) {
					act.click(e).perform();
					break;
				}

	}
	}
}
