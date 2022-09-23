package amazontestpack;


import java.util.ArrayList;
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


import Amazon.Samsungm21;

import Amazon.Searchbox;
import Amazon.Visitesamsung;
import setup1.Baseamazon;

public class SecondVerifivationmobile extends Baseamazon {

	 private WebDriver driver;
	 private Searchbox searchbx;
	 private Samsungm21 samsungm21;
	 private Visitesamsung visitsamsung;
	 private SoftAssert soft;

	
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browserName) { 
		if(browserName.equals("Chrome")){
			
			driver = openChromeBrowser();
			 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh Zend\\Desktop\\selinum\\chromedriver1.exe");	
			 // driver = new ChromeDriver();
		}
		
		if(browserName.equals("FireFox")) {
			
			driver = openFireFoxBrowser();
			 //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Saurabh Zend\\Desktop\\selinum\\geckodriver.exe"); 
			 //driver = new FirefoxDriver();
			 
		}
		 driver.manage().window().maximize();	
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeClass
	public void CreratePOMObjects() {  // create all pom classes objects
		   searchbx = new  Searchbox(driver);
		   samsungm21 = new Samsungm21(driver);
           visitsamsung = new Visitesamsung(driver);       
		
	}
	
	@BeforeMethod
	public void beforemethodpages(){
		 driver.get("https://www.amazon.in/");
		 searchbx.searchbox();
		 searchbx.ClickonSearchbutton();
		 soft = new SoftAssert();
	}
		
	@Test
	public void VerifySamsungStoreFunctionality() {
		samsungm21.ClickonSamsungM21();
		ArrayList<String> listofAddr = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window( listofAddr.get(1) ); 
		 visitsamsung.VisitesamsungStore();
		 
		 String visitesamsungurl = driver.getCurrentUrl();
		 String title = driver.getTitle();
		 soft.assertEquals(visitesamsungurl, "https://www.amazon.in/stores/SamsungBrandStore/page/7613B800-61FF-4320-8DEF-4A3711D5E41C?ref_=ast_bln");
		 soft.assertEquals(title, "Amazon.in: Samsung Brand Store");
		 soft.assertAll();
//		
//		 System.out.println(title);
//		 System.out.println(visitesamsungurl);
//		 if(visitesamsungurl.equals("https://www.amazon.in/stores/SamsungBrandStore/page/7613B800-61FF-4320-8DEF-4A3711D5E41C?ref_=ast_bln")&& title.equals("Amazon.in: Samsung Brand Store")){
//			 System.out.println("url and title is correct");
//		 }
//		 else {
//			 System.out.println("url and title is wrong");
//		 }
//		 
//		}
	}
	@AfterMethod
	public void Logoutfromapplication() {
		System.out.println("aftermethod");
		System.out.println("logout");
	}
	
	@AfterClass
	public void CleanPOMObjects() {
		   searchbx      = null;
		   samsungm21    = null;   
		   visitsamsung  = null;     
			
	}
	@AfterTest
	public void closeBrowser() {   // system.gc  remove garbage collector
		System.out.println("after class");
		driver.quit();
		driver = null;
		System.gc();
		
	}
}


