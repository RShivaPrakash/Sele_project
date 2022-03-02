package com.selenium.basic;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\driver\\chromedriver.exe");

	   WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");

		driver.manage().window().maximize();
		   String currentUrl = driver.getCurrentUrl();
		   String title = driver.getTitle();
		   
		   String windowHandle = driver.getWindowHandle();
		   
		   System.out.println("URL: "+ currentUrl);
		   System.out.println("WindowHandle: "+ windowHandle);
		   System.out.println("pagetitle: "+ title);
	
	}
	
}
