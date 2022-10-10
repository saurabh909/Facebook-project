package temptestpack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import facebookpages.Developerspage;
import facebookpages.LoginOrSignUpPage;
import facebookpages.Privacyandpolicy;
import facebookpages.SearchboxonDeveloperpage;
import setup.Base;
import utils.Utility1;

public class VerifysearchButtonOnDeveloperspage extends Base {
	 private WebDriver driver;
	 private LoginOrSignUpPage  loginOrSignUpPage;
	 private SearchboxonDeveloperpage searchboxpage;
	 private Developerspage developerspage; 
	 private Privacyandpolicy privacyandpolicy;
	 private SoftAssert soft;
	 int testid;
	 static ExtentTest test;
	 static ExtentHtmlReporter reporter;
	 
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browserName) {
		
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		 if(browserName.equals("Chrome"))
    	 {
			 driver = openChromeBrowser();
    		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh Zend\\Desktop\\selinum\\chromedriver1.exe"); 
    		 //driver = new ChromeDriver();
    	 }
    	 if(browserName.equals("FireFox"))
    	 {
    		 driver = openFireFoxBrowser();
    		 //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saurabh Zend\\Desktop\\selinum\\geckodriver.exe"); 
    		 //driver = new FirefoxDriver();
    	 }
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     }
	
	@BeforeClass // make objects of POMclass
	 public void createPOMObjects() {
		loginOrSignUpPage  =  new LoginOrSignUpPage(driver);
		 searchboxpage     =  new SearchboxonDeveloperpage(driver);
		  privacyandpolicy =  new  Privacyandpolicy(driver);
		  developerspage   =  new Developerspage(driver);
		  System.out.println("Before class");
		
	}
	
	 @BeforeMethod  
		public void OpenDeveloprspage() 
			{
			 System.out.println("Before Method");
			 driver.get("https://www.facebook.com/");
     		 loginOrSignUpPage.ClickonDevelopers();
     		 developerspage.ClickOnDeveloperProduct();
     		 soft = new SoftAssert();  //make object of soft assert 
					
	//				String DeveloperURL = driver.getCurrentUrl();
//					if(DeveloperURL.equals("https://developers.facebook.com/?ref=pf")) {                           // single check point {url change verify the url}
//						System.out.println("Developer url is Verifired");
//					}
//					else{
//						System.out.println("developer url is Wrong");
//					}
					
							
					
//							String developersproductUrl = driver.getCurrentUrl();
//							if(developersproductUrl.equals("https://developers.facebook.com/products/")) {     // next check point
//								System.out.println("Developerproducts page url is Verified");
//							}
//							else {
//								System.out.println("Developerproducts url is Wrong");
//							}
										}
					
				
		 @Test //(priority = 2)
			public void verifySearchButtonFunction() throws IOException {
			 
			 testid = 3001;
			 
				System.out.println("TEST 1");
				
				searchboxpage.ClickonSearchbox();
				searchboxpage.ClickOnOverView();
				
				String url = driver.getCurrentUrl();
				String title = driver.getTitle();
				
				
				// hard assert
				//Assert.assertEquals(url,"https://developers.facebook.com/products/app-ads/" );
				//Assert.assertEquals(title, "Facebook App Ads | Facebook for Developers");
				
				//Soft assert  // make object of assert method global and call any test case
				soft.assertEquals(url, "https://developers.facebook.com/products/app-ads/" );
				soft.assertEquals(title, "Facebook App Ads | Facebook for Developers");
				
				soft.assertAll(); // necessary to call 
				
				Utility1.capture(driver, testid);
				
//				if(url.equals("https://developers.facebook.com/products/app-ads/") && title.equals("Facebook App Ads | Facebook for Developers")) {    // final verification point
//					System.out.println("Test Case is PASS");
//				}
//				else {
//					System.out.println("Test Case is Fail");
//				}
		 }
		 
		 @Test //(priority = 2)
			public void verifyprivacyandpolicy() throws IOException {
			 
			 testid = 4001;
				System.out.println("TEST 2");
				
				searchboxpage.ClickonPrivacyandPolicy();
				privacyandpolicy.ClickonPrintableversion();
				
				String url = driver.getCurrentUrl();
				String title = driver.getTitle();
				
				
				// hard assert
				//Assert.assertEquals(url,"https://developers.facebook.com/products/app-ads/" );
				//Assert.assertEquals(title, "Facebook App Ads | Facebook for Developers");
				
				//Soft assert  // make object of assert method global and call any test case
				soft.assertEquals(url, "https://mbasic.facebook.com/privacy/policy/printable/" );
				soft.assertEquals(title, "Meta Privacy Policy – How Meta collects and uses user data");
				
				soft.assertAll(); // necessary to call 
				
				Utility1.capture(driver, testid);
//				if(url.equals("https://mbasic.facebook.com/privacy/policy/printable/") && title.equals("Meta Privacy Policy – How Meta collects and uses user data")) {    // final verification point
//					System.out.println("Test Case is PASS");
//				}
//				else {
//					System.out.println("Test Case is Fail");
//				}
		 }
	       @AfterMethod
		     public void logoutFromApplication() {
			 System.out.println("after method");
			 System.out.println("Logout");
					
				}
	       
	       @AfterClass
			public void cleanPOMObjects() {
	    	   loginOrSignUpPage = null ;
	    	   searchboxpage     = null ;
	    	   developerspage    = null ;
	    	   privacyandpolicy  = null ;
				System.out.println("after class");	
			}
	       
	       @AfterTest
	       public void closedBrowser() {
	    	   System.out.println("After class");
	    	   driver.close();
	    	   driver = null ;
	    	   System.gc();  // garbage collector - delete unused objects 
	       }
		}
			
	


