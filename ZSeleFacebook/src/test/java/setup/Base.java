package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {

	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh Zend\\Desktop\\selinum\\chromedriver1.exe"); 
		 WebDriver driver = new ChromeDriver();
		 return driver;
	}
	
	public static WebDriver openFireFoxBrowser() {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saurabh Zend\\Desktop\\selinum\\geckodriver.exe"); 
		 WebDriver driver = new FirefoxDriver();
		 return driver;
		
	}
	public static WebDriver openOperaBrowser() {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saurabh Zend\\Desktop\\selinum\\geckodriver.exe"); 
		 WebDriver driver = new OperaDriver();
		 return driver;
	
		
	//public static WebDriver openFireFoxBrowser() {
		 //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saurabh Zend\\Desktop\\selinum\\geckodriver.exe"); 
		// WebDriver driver = new FirefoxDriver();
		// return driver;
	

}
