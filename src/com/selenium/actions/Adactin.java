package com.selenium.actions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.id("username"));
		
		Username.sendKeys("Shivaprakash1");
		
		WebElement Password = driver.findElement(By.id("password"));
		
		Password.sendKeys("123456");
		
		WebElement Login = driver.findElement(By.id("login"));
		
		Login.click();
		
		WebElement Location = driver.findElement(By.name("location"));
		
		Select S = new Select(Location);
		
		S.selectByIndex(4);
		
		WebElement Hotels = driver.findElement(By.id("hotels"));
		
		Select S1 = new Select(Hotels);
		
		S1.selectByIndex(1);

		WebElement Room_type = driver.findElement(By.id("room_type"));
		
		Select S2 = new Select(Room_type);
		
		S2.selectByIndex(3);
		
		Thread.sleep(2000);
		
		WebElement No_of_rooms = driver.findElement(By.xpath("//select[@id = 'room_nos']"));
		
		Select S3 = new Select(No_of_rooms);
		
		S3.selectByIndex(1);
		
		Thread.sleep(2000);
		
		WebElement Check_in_date = driver.findElement(By.xpath("//input[@id = 'datepick_in']"));
		
		Check_in_date.sendKeys("10/02/2022");
		
		WebElement Check_out_date = driver.findElement(By.xpath("//input[@id = 'datepick_out']"));
		
		Check_out_date.sendKeys("11/02/2022");
		
		Thread.sleep(2000);
		
		WebElement AdultPerRooms = driver.findElement(By.id("adult_room"));
		
		Select S4 = new Select(AdultPerRooms);
		
		S4.selectByIndex(1);
		
		Thread.sleep(2000);
		
		WebElement ChildPerRooms = driver.findElement(By.id("child_room"));
		
		Select S5 = new Select(ChildPerRooms);
		
		S5.selectByIndex(3);
		
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.name("Submit"));
		
		search.click();
		
		Thread.sleep(2000);
		
		WebElement Radio_button = driver.findElement(By.xpath("//input[@type = 'radio']"));
		
		Radio_button.click();
		
		Thread.sleep(2000);
		
		WebElement Continue = driver.findElement(By.xpath("//input[@name ='continue']"));
		
		Continue.click();
		
		WebElement First_name = driver.findElement(By.xpath("//input[@name = 'first_name']"));
	
		First_name.sendKeys("Shiva");
		
		WebElement Last_name = driver.findElement(By.xpath("//input[@name = 'last_name']"));
		
		Last_name.sendKeys("Prakash");
		
		Thread.sleep(2000);
		
		WebElement Billing_address = driver.findElement(By.xpath("//textarea[@class = 'txtarea']"));
	
		Billing_address.sendKeys("third street second division, main road vadapalani chennai");
		
		WebElement CreditCard = driver.findElement(By.xpath("//input[@id = 'cc_num']"));
	
		CreditCard.sendKeys("4564568974564658");
		
		Thread.sleep(2000);
		
		WebElement CreditcardType = driver.findElement(By.xpath("//select[@id='cc_type']"));
	
		Select  S6 = new Select(CreditcardType);
		
		S6.selectByIndex(3);
		
		Thread.sleep(2000);
		
		WebElement Exp_month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		
		Select S7 = new Select(Exp_month);
		
		S7.selectByIndex(9);
		
		Thread.sleep(2000);
		
		WebElement Exp_year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		
		Select S8 = new Select(Exp_year);
		
		S8.selectByIndex(12);
		
		Thread.sleep(2000);
		
		WebElement CVV_number = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		
		CVV_number.sendKeys("6516");
	
		
		WebElement Book_now = driver.findElement(By.xpath("//input[@id='book_now']"));
		
		Book_now.click();
		
		Thread.sleep(5000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("F:\\Selenium\\ScreenShot\\Pic4.png");
		
		FileUtils.copyFile(source, dest);
	
 	
	
	}
	
}
