package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKey {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.xpath("//a [text() = 'COURSES']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(courses).build().perform();
		
		Thread.sleep(2000);
		
		WebElement Softwaretest = driver.findElement(By.xpath("//span[ text() = 'Software Testing Training']"));
		
		ac.moveToElement(Softwaretest).build().perform();
		
		Thread.sleep(2000);
		
		

	
	}
	
	
}
