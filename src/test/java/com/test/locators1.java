package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {
	
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("https://www.wellsfargo.com/");
			Thread.sleep(4000);
			driver.findElement(By.linkText("About Wells Fargo")).click();
			driver.findElement(By.id("tabNavSmallBusiness")).click();
			driver.findElement(By.xpath("//*[@id=\"loansTab\"]/a")).click();
//			driver.findElement(By.cssSelector(".navLevel1")).click();
			driver.findElement(By.linkText("Let Us Contact You")).click();
			driver.findElement(By.cssSelector(".navLevel1 selected")).click();
//					partialLinkText("/kitchen")).click();
//			xpath("//*[@id=\"applet_p_50000352\"]/div/div/ul/li/ul/li[1]/a/span[2]")).click();
//			driver.findElement(By.cssSelector("#my-adsMAST-iframe")).click();
			Thread.sleep(4000);
			
//			driver.findElement(By.xpath("//a[@href='https://mail.yahoo.com/?.src=fp']")).click();
//			driver.findElement(By.linkText("Forgot")).click();
//			driver.findElement(By.linkText("Forgot account?")).click();
			
			driver.quit();

}}
