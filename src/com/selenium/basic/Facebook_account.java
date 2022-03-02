package com.selenium.basic;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_account {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement scrolldown = driver.findElement(By.xpath("//a [@title = 'Tamil']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		
		
		WebElement create = driver.findElement(By.xpath("//a [@rel = 'async']"));
		create.click();
	    
		Thread.sleep(2000);
		
	    WebElement first_name = driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
		first_name.sendKeys("Shiva");
	
		Thread.sleep(2000);
		
		WebElement last_name = driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
		last_name.sendKeys("Prakash");
		
		WebElement Address = driver.findElement(By.xpath("//input[@aria-label = 'Mobile number or email address']"));
		Address.sendKeys("salaishivaprakash@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement newpassword = driver.findElement(By.xpath("//input[@aria-label = 'New password']"));
		newpassword.sendKeys("Shiva");
		
		WebElement Gender = driver.findElement(By.xpath("//input[@value = '2']"));
		Gender.click();
		
		Thread.sleep(2000);
		
		WebElement Month = driver.findElement(By.id("month"));
		Select S = new Select(Month);
		S.selectByIndex(5);

		Thread.sleep(2000);
		
		WebElement Signup = driver.findElement(By.xpath("//button[contains(@name,'websubmit')]"));
		Signup.click();
		
		
		//TakesScreenshot ts = (TakesScreenshot) driver;
		
		/////F/ile source = ts.getScreenshotAs(OutputType.FILE);
		
		//File dest = new File(filename);
		
		//FileUtils.copyFile(source, dest);
	
	}
	
}
