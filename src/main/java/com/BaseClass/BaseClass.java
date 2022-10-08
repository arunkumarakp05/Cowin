package com.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	
	public static void userInput(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void close() {
		driver.close();

	}
	public static void quit() {
		driver.quit();
	}
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}
	public static void fullScreen() {
		driver.manage().window().fullscreen();
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void selectDropDown(WebElement element,String suggestion,String value) {
		Select s = new Select(element);
		if(suggestion.equalsIgnoreCase("value")){
			s.selectByValue(value);
			
		}else if(suggestion.equalsIgnoreCase("index")){
			int n = Integer.parseInt(value);
			s.selectByIndex(n);
			
		}else if(suggestion.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
			
		}else {
			System.out.println("Invalid Select Options");
		}	
	}
	public static void moveToElement(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	public static void actClick(WebElement element) {
		Actions act = new Actions(driver);
		act.click(element).perform();
		}
	public static void jsclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		
	}
	public static String text (WebElement element) {
		return element.getText();
	
	}
	public static void printText(String value) {
		System.out.println(value);
		
	}
	public static WebDriver browserLaunch(String value){
		if(value.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		driver = new ChromeDriver();
		}else if (value.equalsIgnoreCase("edge")){
			
		}else if (value.equalsIgnoreCase("Firefox")) {
			
		}else {
			System.out.println("Invalid Browser");
		}
	
		driver.manage().window().maximize();
		return driver;
	}
	public static void waitTillVisibility(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
      
	}
	
	
	
	
	
	

}
