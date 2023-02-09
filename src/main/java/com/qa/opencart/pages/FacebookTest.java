package com.qa.opencart.pages;

import java.net.MalformedURLException;
import java.net.URL;

public class FacebookTest {

	public static void main(String[] args) throws MalformedURLException {
		
		
		BrowserUtil brutil = new BrowserUtil();
		brutil.init_driver("chrome");
		
		brutil.navigateUrl(new URL ("https://www.facebook.com/"));
		
		//brutil.navigateUrl("https://www.facebook.com/");
		System.out.println(brutil.getPageSource().contains("requireLazy"));
		System.out.println(brutil.getPageUrl().contains("https://www.facebook.com/"));
		
		
		String title = brutil.getPageTitle();
		System.out.println("title is " +title);
		
		if(title.contains("Facebook")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		
		brutil.closeBrowser();

	}

}
