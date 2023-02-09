package com.qa.opencart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectorConcept {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("http://classic.crmpro.com/");
		
		
		
// ID - #Form_getForm_Name
// Class - .text
//if class and id are not available go with other attributes like input[tabindex='3'][name='Email']
// if Class has selectors-input   jsSelector (i.e 2 class names) use   input.selectors-input.jsSelector
//Direct child use >(anchor)  eg: div.middleColumn>input#Form_getForm_Name
		
		//div.input-group input --- direct and indirect child elements
		
		
		
		
	}

}
