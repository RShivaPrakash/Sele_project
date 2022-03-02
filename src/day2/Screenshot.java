package day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			TakesScreenshot ts = (TakesScreenshot) driver;// Narrowing typecasting;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("F:\\Selenium\\ScreenShot\\Pic1.png"); // File name needed
			
			FileUtils.copyFile(source, dest);// INPUT Output Exception;
			
		
		}
		
		
}
