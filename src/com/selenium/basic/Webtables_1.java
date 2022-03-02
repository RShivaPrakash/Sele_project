package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com ");
		
		WebElement Text = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		
		System.out.println(Text.getText());	
	
		Thread.sleep(2000);
		String attribute = Text.getAttribute("u");
		System.out.println(attribute);
		
		driver.get("https://www.facebook.com/");
		
		WebElement Password = driver.findElement(By.id("pass"));
		
		Thread.sleep(2000);
		String attribute2 = Password.getAttribute("type");
		System.out.println(attribute2);
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		
	}	
}
