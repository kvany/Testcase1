package com.Simplylearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usecase1 {
	
	WebDriver driver;
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.t-mobile.com/cell-phone-plans");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	public static void main(String[] args) {
		Usecase1 obj = new Usecase1();
		obj.launchbrowser();

	}

}
