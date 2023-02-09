package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/#");

//		String  JhonChckbx ="//a[text()='John.Smith']/parent::td/preceding-sibling::td/input";
//	driver.findElement(By.xpath(JhonChckbx)).click();
		driver.findElement(By.xpath("//a[text()='John.Smith']/parent::td/preceding-sibling::td/input")).click();
		
		System.out.println(getUserData("John.Smith"));
		}
	
	
	
	
	public static List<String> getUserData(String name){
		List<WebElement> colElm = driver.findElements(By.xpath("//td/a[text()='John.Smith']/parent::td/following-sibling::td"));
		List<String> colList = new ArrayList<String>(); 
		for(WebElement e : colElm) {
			String text = e.getText();
			colList.add(text);
		}
		return colList;
	}
	
	
public static void selectName(String name) {
	String  Xpath ="//a[text()='"+name+"']/parent::td/preceding-sibling::td/input";
	driver.findElement(By.xpath(Xpath)).click();
}

}
