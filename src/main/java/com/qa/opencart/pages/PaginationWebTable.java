package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class PaginationWebTable {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		while(true) {
			
			if(driver.findElements(By.xpath("//td[text()='Hong Kong']")).size()>0)
			{
				clickCheckbox1("Hong Kong");
				break;
			}
			else {
				WebElement next = driver.findElement(By.id("tablepress-1_next"));
				if(next.getAttribute("class").contains("disabled"))
				{
				System.out.println("Pagination is over... city is not found");
				break;
				}
				next.click();
				Thread.sleep(1000);
			}
			
		}
		
		
	}

	public static void clickCheckbox(String cityName) {
		String xpath = "//td[text()='"+cityName+"']/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	}
	
	//With Relative locators
	public static void clickCheckbox1(String cityName) {
		WebElement ele = driver.findElement(By.xpath("//td[text()='"+cityName+"']"));
		driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(ele)).click();
	}

}
