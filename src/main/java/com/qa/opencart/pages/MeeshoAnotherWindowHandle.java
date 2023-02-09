package com.qa.opencart.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MeeshoAnotherWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");//parent window
		driver.findElement(By.xpath("//picture[@class='ImageView__StyledPicture-h22804-0 jYIgsy']//img[@alt='facebook']")).click(); //childwindow will open 

	Set<String> handles= driver.getWindowHandles();
	
	Iterator<String> it = handles.iterator();
	
	String ParentWindow = it.next();
	System.out.println(ParentWindow);
	
	String ChildWindow = it.next();
	System.out.println(ChildWindow);
	
	driver.switchTo().window(ChildWindow);
	System.out.println(driver.getCurrentUrl());
	driver.close();
	
	driver.switchTo().window(ParentWindow);
	System.out.println(driver.getTitle());
		
		
	}

}
