package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Implicit_wait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement Email = driver.findElement(By.xpath("//input[ @id = 'email']"));
		Email.sendKeys("shivaprakashdon@gmail.com");
		
		
		WebElement Password = driver.findElement(By.xpath("//input[ @id = 'pass']"));
		Password.sendKeys("shivaprakash");	
		
	}
	
	
}
