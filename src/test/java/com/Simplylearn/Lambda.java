package com.Simplylearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lambda {

	public static void main(String[] args) {

			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();;
		  
		  //navigate to URL
		
		  driver.get("https://accounts.lambdatest.com/register");
		  WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/a/img"));
	boolean  present =	  logo.isDisplayed();
	 System.out.println(present);

	}

}
