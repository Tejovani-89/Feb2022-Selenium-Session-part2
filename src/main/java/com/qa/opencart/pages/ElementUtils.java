package com.qa.opencart.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {

	private WebDriver driver;

	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}

	public By getBy(String locatorType, String locatorValue) {

		By locator = null;

		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "classname":
			locator = By.className(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "cssselector":
			locator = By.cssSelector(locatorValue);
			break;
		case "linktext":
			locator = By.linkText(locatorValue);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(locatorValue);
			break;
		case "tagname":
			locator = By.tagName(locatorValue);
			break;

		default:
			System.out.println("please pass the right locator....");
			break;
		}

		return locator;
	}
	
	
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	public String doGetElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public  void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public void dosendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public  void doActionSendKeys(By locator , String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
		
	}
	
	//WebTableHandling for checkbox
	public  void selectName(String name) {
		String  Xpath ="//a[text()='"+name+"']/parent::td/preceding-sibling::td/input";
		driver.findElement(By.xpath(Xpath)).click();
	}
	
	public  boolean isDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public  int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	public  int getElementsListCount(By locator) {
		return driver.findElements(locator).size();
	}
	
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	public  String getAttributeValue(By locator , String AttributeValue) {
		return getElement(locator).getAttribute(AttributeValue);
	}
	
	//WebTableHandle to get following data
	public  List<String> getUserData(String name){
		List<WebElement> colElm = driver.findElements(By.xpath("//td/a[text()='"+name+"']/parent::td/following-sibling::td"));
		List<String> colList = new ArrayList<String>(); 
		for(WebElement e : colElm) {
			String text = e.getText();
			colList.add(text);
		}
		return colList;
	}
	
	
	
	public  void getWindowHandles(By locator) {
		
		Set<String> handle1 = driver.getWindowHandles();
		Iterator<String> it1 =handle1.iterator();
		String PWID1 = it1.next();
		//System.out.println(PWID1);
		String CWID1 = it1.next();
		//System.out.println(CWID1);
		driver.switchTo().window(CWID1);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(PWID1);
		
	}
	
public  void clickOnElementFromSection(By locator , String value) {
		
		List<WebElement> footerlist = getElements(locator);
		System.out.println(footerlist.size());
		
		for(WebElement e : footerlist) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
	}



// Text will be displayed horizontally (-------)

public  List<String> getElementsTextList(By locator) {
	List<String> eleTextList = new ArrayList<String>();
	List<WebElement> elelist = getElements(locator);
	for(WebElement e :elelist) {
		String text = e.getText();
		eleTextList.add(text);
		}
	return eleTextList;
	
}


/*
 *  text will be displayed vertically(-)
 *                                    -
                                      -
 */
                                          
	public  void printAllElementText(By locator) {
		List<WebElement> elelist = getElements(locator);
		for(WebElement e :elelist) {
			String text = e.getText();
			System.out.println(text);
		}
	}
	
//*******************DropDownUtils*********************
	
	
	public  void doSelectDropDownByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	
	}
	
	public  void doSelectDropDownByVisibleText(By locator, String VisibleText) {
		
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(VisibleText);
	}
	
	public  void doSelectDropDownByvalu(By locator , String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public  int getSelectDropDownValueList(By locator) {
		return driver.findElements(locator).size();
	}
	
	public  List<String> getSelectDropDownValuesList(By locator) {
		List<String> valuesList = new ArrayList<String>(); 
		
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for(WebElement e : optionsList) {
			String text = e.getText();
			valuesList.add(text);
		}
		return valuesList;
	}
	
	
	public  void selectValueFromDropDownList(By locator ,  String value) {
		Select select = new Select (getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
			}
	}
	
	public  void printSelectDropDownValue(By locator) {
		
         Select select = new Select(getElement(locator));
		
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			
		}
	
}

	//Select a value from dropdownlist 
	//without using Select concept and forloop with "e"
	
	public  void selectValueFromDropDown(By locator ,String value) {
		List<WebElement> countryoptions = getElements(locator);
		System.out.println(countryoptions.size());
		
		for(int i=0 ; i<=countryoptions.size() ; i++) {
			String text = countryoptions.get(i).getText();
		System.out.println(text);
		if(text.contains(value)) {
			countryoptions.get(i).click();
			break;
			
		}
		}		
	}
	
	
	
	//**********Wait utils*********
	
	public  WebElement waitForElementPresence(By locator , int timeOut ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public  WebElement waitForElementVisible(By locator , int timeOut ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public  String waitForTitleContains(String titleContains , int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleContains(titleContains))) {
			return driver.getTitle();
		}
		return null;
	}
	

	public  String waitForTitleIs(String Title , int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.titleIs(Title))) {
			return driver.getTitle();
		}
		
		return null;
	}

}
