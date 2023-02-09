package com.qa.opencart.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleTogetherFormSite {
static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
	String PWID = driver.getWindowHandle();
	
	
	driver.findElement(By.xpath("//div[@class='footer__social-networks']/a[@class='twitter']")).click();
	driver.findElement(By.xpath("//div[@class='footer__social-networks']/a[@class='facebook']")).click();
	driver.findElement(By.xpath("//div[@class='footer__social-networks']/a[@class='linkedin']")).click();
	driver.findElement(By.xpath("//div[@class='footer__social-networks']/a[@class='youtube']")).click();
	
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	
	while(it.hasNext()){
		String WindowID = it.next();
		driver.switchTo().window(WindowID);
		System.out.println("WindowID :" + driver.getTitle());
		if(!WindowID.equals(PWID)) {
			driver.close();
		}
		
	}
	driver.switchTo().window(PWID);
	System.out.println(driver.getTitle());

	}

}
