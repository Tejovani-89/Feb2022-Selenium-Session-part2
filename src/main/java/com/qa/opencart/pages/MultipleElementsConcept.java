package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElementsConcept {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links :" +linkList.size());
		
//		for(int i=0 ; i<=linkList.size(); i++) {
//			String linktext = linkList.get(i).getText();
//			
//			if(!linktext.isEmpty()) {
//				System.out.println(linktext);
//			}
//			}
		
		for(WebElement e : linkList) {
			String text = e.getText();
			String href = e.getAttribute("href");
			if(!text.isEmpty()) {
			System.out.println(text +"  " + href );
			}
		}
		
		//Java Streams:
				//linksList.stream().forEach(ele -> System.out.println(ele.getText()));
//				linksList
//					.stream()
//						.filter(e -> !e.getText().isEmpty())
//							.forEach(e -> System.out.println(e.getText()));
				
				//
//				linksList
//					.parallelStream()
//						.filter(e -> !e.getText().isEmpty())
//							.forEach(e -> System.out.println(e.getText()));
		
	}

}
