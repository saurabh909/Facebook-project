package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Dashboard;
import pages.LogInPage;
import pages.Logout;
import pages.Pincode;

public class Zerodhatest {

	public static void main(String[] args) throws Exception {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh Zend\\Desktop\\selinum\\chromedriver1.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			driver.get("https://kite.zerodha.com/");
												
				// create object of login page   create object of respected page where we want to perform action on their web elements

			LogInPage loginpage = new LogInPage(driver);
			loginpage.SendUserName();
			loginpage.SendPassword();
			loginpage.ClickOnLoginButton();
			
			Pincode pincode = new Pincode(driver);
			pincode.SendPinno();
			pincode.ClickonLogin();
	
		  
			Logout logout = new Logout(driver);
			logout.ClickOnLogOut();
			
			
	}

}			
	


