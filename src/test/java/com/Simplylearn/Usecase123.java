package com.Simplylearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usecase123 {
	
	WebDriver driver;
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public void login() {
		driver.findElement(By.linkText("Sign in")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementByID('email').value ='gjhgj@gmail.com'");
	}
	
	public void search() {
		driver.findElement(By.id("gh-ac")).sendKeys("JBL Speakers");
		driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.xpath("//a[text()=' Daily Deals']")).click();
	}
   public void navigate() {
	   driver.navigate().to("https://www.simplilearn.com/");
	   driver.navigate().back();
   }
   
   public void close() {
	String text =  driver.getTitle();
	   System.out.println("Page title" + text);
	   System.out.println(driver.findElement(By.id("gh-ac")).getCssValue("line-height"));
	   driver.close();
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Usecase123 obj = new Usecase123();
   obj.launchbrowser();
   obj.search();
   obj.navigate();
   obj.login();
   obj.close();
	}

}
