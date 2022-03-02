package com.allconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_elements {

	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver	driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("shivaprakashdon@gmail.com");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("shivaprakash");
		
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		
		// isDisplayed();
		
		boolean Check = Login.isDisplayed();
		
		System.out.println(Check);
		
		driver.get("https://www.seleniumeasy.com/");
		
		WebElement Selenium_dropdown = driver.findElement(By.xpath("//a[@class ='dropdown-toggle active'][1]"));
		
		Selenium_dropdown.click();
		
		WebElement Seleniumjava = driver.findElement(By.xpath("//a[text() = 'Selenium with Java']"));
		
		
		WebElement Month = driver.findElement(By.id("month"));
		Select S = new Select(Month);
		S.selectByIndex(5);
		Seleniumjava.click();
		
		

}

}
