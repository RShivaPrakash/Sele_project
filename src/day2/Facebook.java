package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement Email = driver.findElement(By.xpath("//input [@name ='email']"));
			Email.sendKeys("shivaprakashdon@gmail.com");
			
			WebElement Password = driver.findElement(By.xpath("//input[@name = 'pass']"));
			Password.sendKeys("shivaprakash");
			
			WebElement Login = driver.findElement(By.xpath("//button[@name = 'login']"));
			Login.click();
		}
}
