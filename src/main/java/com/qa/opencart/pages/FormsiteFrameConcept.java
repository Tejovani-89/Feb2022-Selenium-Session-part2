package com.qa.opencart.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormsiteFrameConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
	driver.findElement(By.xpath("//div[@id='imageTemplateContainer']/img")).click();
	Thread.sleep(3000);
	driver.switchTo().frame(driver.findElement(By.id("frame-one748593425")));
	
	
	
	
	By vehicleyr = By.id("RESULT_TextField-2");
	By vehiclemark = By.id("RESULT_TextField-3");
	By vehiclemodel = By.id("RESULT_TextField-4");
	By vehiclecolor = By.id("RESULT_TextField-5");
	By vehiclemilg = By.id("RESULT_TextField-6");
	By vehicleidentificationno = By.id("RESULT_TextField-7");
	By vehiclename = By.id("RESULT_TextField-8");
	By vehicleAdres = By.id("RESULT_TextField-9");
	By vehicleAdres1 = By.id("RESULT_TextField-10");
	By vehiclecity= By.id("RESULT_TextField-11");
	By vehiclestate = By.id("RESULT_RadioButton-12");
	By vehiclezip = By.id("RESULT_TextField-13");
	By vehiclephn = By.id("RESULT_TextField-14");
	By vehicleemail = By.id("RESULT_TextField-15");
	By vehiclesubmit = By.id("FSsubmit");
	
	
	
	
	ElementUtils eleutil = new ElementUtils(driver);
	eleutil.dosendKeys(vehicleyr, "2015");
	eleutil.dosendKeys(vehiclemark, "123");
	eleutil.dosendKeys(vehiclemodel, "2022");
	eleutil.dosendKeys(vehiclecolor, "White");
	eleutil.dosendKeys(vehiclemilg, "200");
	eleutil.dosendKeys(vehicleidentificationno, "8965547");
	eleutil.dosendKeys(vehiclename, "BMW");
	eleutil.dosendKeys(vehicleAdres, "MGRNagar");
	eleutil.dosendKeys(vehicleAdres1, "Velachery");
	eleutil.dosendKeys(vehiclecity, "Chennai");
	eleutil.doSelectDropDownByVisibleText(vehiclestate, "Indiana");
	eleutil.dosendKeys(vehiclezip, "600801");
	eleutil.dosendKeys(vehiclephn, "9865327412");
	eleutil.dosendKeys(vehicleemail, "test@123.gmail.com");
	eleutil.doClick(vehiclesubmit);

	
		
	}
	

}
