package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithList {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.xpath("//div[@class='footer__social-networks']/a[@class='youtube']")).click();
		
		Set<String> handle = driver.getWindowHandles();
		
		List<String> windwList = new ArrayList<String>(handle);
		
		String PWID = windwList.get(0);
		String CWID = windwList.get(1);
		
		driver.switchTo().window(CWID);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(PWID);
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
