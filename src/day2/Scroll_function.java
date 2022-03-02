package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Scroll_function {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement backtotop = driver.findElement(By.className("navFooterBackToTopText"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // narrowing interface
		
		js.executeScript("arguments[0].scrollIntoView();",backtotop);
		
		js.executeScript("window.scrollBy(0,-3000);");
		
		js.executeScript("window.scrollBy(0,1000);");
	}

}
