package day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

public class ScreenshotFacebook {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement Email = driver.findElement(By.xpath("//input [@name ='email']"));
		Email.sendKeys("shivaprakashdon@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name = 'pass']"));
		Password.sendKeys("shivaprakas");
		
		WebElement Login = driver.findElement(By.xpath("//button[@name = 'login']"));
		Login.click();
		
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File Source = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("F:\\Selenium\\ScreenShot\\Pic3.png");
		
		FileUtils.copyFile(Source, dest);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}
