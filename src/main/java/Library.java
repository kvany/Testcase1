import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {
	 protected WebDriver driver;
	 public static Properties prop;
	 public void launchApplication() throws IOException {
	  FileInputStream fileIS = new FileInputStream("C:\\Balu\\Simpleproject\\src\\test\\resources\\Configproperty\\config.properties");
	     prop = new Properties();
	     prop.load(fileIS); // loads config file from the folder
	     //logger.info("property file is loaded");
	     String browser = prop.getProperty("browser");
	     //to launch chrome brower
	  
	  try {
	   if(browser.equalsIgnoreCase("Firefox")) {
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\geckodriver.exe");
	    driver = new FirefoxDriver();
	   } else if (browser.equalsIgnoreCase("chrome")) {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\KRISHNA PC\\Desktop\\Testing\\downloads\\chromedriver.exe");
	     driver=new ChromeDriver();
	   }
	   
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	      driver.get(prop.getProperty("url"));
	   
	  } catch (WebDriverException e) {
	   System.out.println("browser could not be launched");
	  } 
	 }
	 public void quit() {
	  driver.close();
	 }
	 
		
	}


