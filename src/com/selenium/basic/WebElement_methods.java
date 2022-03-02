package com.selenium.basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.security.authentication.LoginAuthenticator;

public class WebElement_methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
			
		WebElement username = driver.findElement(By.name("username"));
		
		username.sendKeys("shivaprakashdon@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("shivaprakash");
		
		Thread.sleep(2000);
		
		
		String windowHandle = driver.getWindowHandle();	
		
		System.out.println(windowHandle);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		//login.click();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles);
	
		
	}

}
