package com.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllPaths {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement Mail = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
		Mail.sendKeys("Shiva@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
		Password.sendKeys("Shiva");
		
		WebElement CreatePage = driver.findElement(By.xpath("//a[text ()= 'Create a Page']"));	
		CreatePage.click();
		
		WebElement Create = driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]"));
		Create.click();
		
		Thread.sleep(2000);
		WebElement FACE = driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));
		
		System.out.println(FACE.getText());
	
	}
}
