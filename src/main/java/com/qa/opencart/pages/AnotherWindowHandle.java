package com.qa.opencart.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnotherWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.findElement(By.xpath("//ul/li/a//img[@src='/_resources/themes/orangehrm/dist/images/social-icon/facebook.png']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		String ParentWindow = it.next();
		System.out.println(ParentWindow);
		
		String childWindow = it.next();
		System.out.println(childWindow);
	}

}
