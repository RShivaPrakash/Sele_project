package com.test.papers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChormeBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Selenium\\\\driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement login = driver.findElement(By.id("email"));
		
		login.sendKeys("shivadsdvdfvdfvdfvdfv");
		
		login.clear();
		
	}

}
