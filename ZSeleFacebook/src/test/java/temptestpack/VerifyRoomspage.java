package temptestpack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.classfile.Utility;
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



import facebookpages.LoginOrSignUpPage;
import facebookpages.Massanger;
import facebookpages.Roomspage;
import setup.Base;
import utils.Utility1;


public class VerifyRoomspage extends Base { //inherit  base c
	 private WebDriver driver;
	 private Roomspage roomspage;
	 private Massanger massanger;
	 private LoginOrSignUpPage  loginOrSignUpPage;
	 private SoftAssert soft;
	 int testid;
	  
	  
     @Parameters ("browser")
     @BeforeTest
     public void launchBrowser(String browserName) {
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
	 
	 
      @BeforeClass // make objects of all pom classes
	      public void createPOMObjects() {
			loginOrSignUpPage = new LoginOrSignUpPage(driver);
		    massanger = new Massanger(driver);
			roomspage = new Roomspage(driver);		
			 System.out.println("Before class");
              }
	    
      
	@BeforeMethod
		public void openRoomspage() // all object refrences and assert object created
		{
			 System.out.println("Before Method");
			 driver.get("https://www.facebook.com/");
			 loginOrSignUpPage.ClickonMAssanger();
			 massanger.ClickRooms();
			 soft = new SoftAssert();  //make object of soft assert 
			 
			 
//			String MassangerURL = driver.getCurrentUrl();
//				if(MassangerURL.equals("https://www.messenger.com/")) {        // single check point {url change verify the url}
//					System.out.println("massanger url is Verifired");
//				}
//				else{
//					System.out.println("massanger url is Wrong");
//				}
//				
//				String massangerRoomsUrl = driver.getCurrentUrl();
//				if(massangerRoomsUrl.equals("https://www.messenger.com/rooms")) {     // next check point
//					System.out.println("Massanger room page url is Verified");
//				}
//				else {
//					System.out.println("Massanger room page url is Wrong");
//				}
//				
				
		}
	     
		@Test //(priority = 2)
		public void verifyGoBackToMessangerButton() throws IOException {
			testid = 1001;
			System.out.println("TEST 1");
			roomspage.GoBacktomassanger();
			String url = driver.getCurrentUrl();
			String title = driver.getTitle();
			
			// hard assert
			//Assert.assertEquals(url,"https://www.messenger.com/" );
			//Assert.assertEquals(title, "Messenger");
			
			//Soft assert  // make object of assert method global and call any test case
			soft.assertEquals(url, "https://www.messenger.com/" );
			soft.assertEquals(title, "Messenger");
			soft.assertAll(); // necessary to call 
			Utility1.capture(driver, testid);
			
			
			
//			if(url.equals("https://www.messenger.com/") && title.equals("Messenger")) {    // final verification point
//				System.out.println("Test Case is PASS");
//			}
//			else {
//				System.out.println("Test Case is Fail");
//			}
		}
		
		@Test //(priority = 1)
		public void verifyContactToHelpCenterButton() throws IOException {
			testid = 2001;
			System.out.println("TEST 2");
			roomspage.Contacthelpcenter();
			String url1 = driver.getCurrentUrl();
			String title = driver.getTitle();
			
			//hard assert
			//Assert.assertEquals(url1, "https://www.messenger.com/help");
			//Assert.assertEquals(title, "Messenger Help Centre");
			
			// soft assert
			soft.assertEquals(url1, "https://www.messenger.com/help");
			soft.assertEquals(title, "Messenger Help Centre");
			
			soft.assertAll();  // necessary to call
			Utility1.capture(driver, testid);
			
			
//			if(url1.equals("https://www.messenger.com/help") && title.equals("Messenger Help Centre")) {    // final verification point
//				System.out.println("Test Case is PASS");
//			}
//			else {
//				System.out.println("Test Case is Fail");
//			}
		}
			       
		@AfterMethod
		public void logoutFromApplication() {
			System.out.println("after method");
			System.out.println("Logout");
			
		}
		
		@AfterClass  // make all object refrences null
		public void CleanPOMObjects() {
			loginOrSignUpPage = null;
			massanger = null;
			roomspage = null;
			//System.out.println("after class");	
		}
		
		@AfterTest
		public void closeBrowser() {
			System.out.println("AfterClass");
			driver.close();
			driver = null;  
			System.gc();  // garbage collector - delete unused objects
		}
	   

}

