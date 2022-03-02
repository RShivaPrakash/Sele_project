package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(2000);
		
		WebElement From = driver.findElement(By.xpath("//input[@type = 'text'][1]"));
		From.sendKeys("Vellore");
		
		WebElement Home1 = driver.findElement(By.xpath("//li [@class ='selected']"));
		Home1.click();
		
		Thread.sleep(2000);
		
		WebElement To = driver.findElement(By.xpath("//input[@type = 'text'][2]"));
		To.sendKeys("Chennai");
		
		WebElement Search = driver.findElement(By.xpath("//button [@class ='fl button']"));
		Search.click();
	
	}
	

}
