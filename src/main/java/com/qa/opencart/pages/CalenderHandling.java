package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

 driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		Thread.sleep(5);
		selectFutureDate("June 2023", "32");
		
	}
	
	public static void selectFutureDate(String ExpMonthyear , String dateNum) {
		if(ExpMonthyear.contains("February")&& Integer.parseInt(dateNum)>29) {
			System.out.println("Wrong data passed.....Please pass the right day...." +dateNum);
			return;
		}
		
		if(Integer.parseInt(dateNum)>31) {
			System.out.println("Wrong data passed.....Please pass the right day...." +dateNum);
			return;
		}
		
		String actMonthyear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthyear);
		
		while(!actMonthyear.equals(ExpMonthyear)) {
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonthyear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actMonthyear);		
		}
		
		selectDate(dateNum);
		
		
	}

	public static void selectDate(String dateNum) {
		driver.findElement(By.xpath("//a[text()='"+dateNum+"']")).click();
		
	}
	
	
	//same logic can be applied for prev date
	
public static void selectPrevDate(String ExpMonthyear , String dateNum) {
		
	if(ExpMonthyear.contains("February")&& Integer.parseInt(dateNum)>29) {
		System.out.println("Wrong data passed.....Please pass the right day...." +dateNum);
		return;
	}
	
	if(Integer.parseInt(dateNum)>31) {
		System.out.println("Wrong data passed.....Please pass the right day...." +dateNum);
		return;
	}
	
		String actMonthyear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonthyear);
		
		while(!actMonthyear.equals(ExpMonthyear)) {
			
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			actMonthyear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actMonthyear);
			
			
		}
		selectPrevDate(dateNum);
		
	}
	
public static void selectPrevDate(String dateNum) {
	driver.findElement(By.xpath("//a[text()='"+dateNum+"']")).click();
	
}
	
	
}
