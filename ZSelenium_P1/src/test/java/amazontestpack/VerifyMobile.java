package amazontestpack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Amazon.Addtocart;
import Amazon.Samsungm21;
import Amazon.Samsungmobile13;
import Amazon.Searchbox;
import Amazon.Visitesamsung;


public class VerifyMobile {
	private WebDriver driver;
	private Searchbox searchbx;
	private Samsungm21 samsungm21;
	private Samsungmobile13 samsungm13;
	 private Addtocart addtocart;
	 private Visitesamsung visitsamsung;
	
	@BeforeClass
	public void launchBrowser() {
		 System.out.println("Before class");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh Zend\\Desktop\\selinum\\chromedriver1.exe");
		
		  driver = new ChromeDriver();
		 driver.manage().window().maximize();
						
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void ClickonSignin() 
	{
		 System.out.println("Before Method");
		 driver.get("https://www.amazon.in/");
		  
		 searchbx = new Searchbox(driver);
		 searchbx.searchbox();
		 searchbx.ClickonSearchbutton();
    	  
    	 
    	 String searchbuttonclickurl = driver.getCurrentUrl();
    	 System.out.println(searchbuttonclickurl);
    	 if(searchbuttonclickurl.equals("https://www.amazon.in/s?k=samsung+mobiles&ref=nb_sb_noss")) {
    		 System.out.println("url is verified");
    	 }
    	 else {
    		 System.out.println("url is wrong");
    	 }
    	 
    	 
    	 samsungm13 = new Samsungmobile13(driver);
    	 samsungm21 = new Samsungm21(driver);
    	 visitsamsung = new Visitesamsung(driver);
    	 
	}
		 
		 @Test 
			
		 public void VerifyAddtocart() {
			 samsungm13.ClickOnM13();
			 addtocart = new Addtocart(driver);
	    	 ArrayList<String> listofAddr = new ArrayList<String>(driver.getWindowHandles());
	    	 driver.switchTo().window( listofAddr.get(1) ); 
	    	 addtocart.Addtocart1();
	    	 
	    	 String addcarturl = driver.getCurrentUrl();
	    	 System.out.println(addcarturl);
	    	 
	    	 
	    	 
		 }
		 @Test 
			
		 public void VerifySamsungStore() {
			    samsungm21.ClickonSamsungM21();
				//Visitesamsung comparem21 = new Visitesamsung(driver);
			    ArrayList<String> listofAddr = new ArrayList<String>(driver.getWindowHandles());
				 driver.switchTo().window( listofAddr.get(2) ); 
				 visitsamsung.VisitesamsungStore();
			 
		 }
			 
		 
		 
		@AfterMethod
			public void logoutfromApplication() {
			System.out.println("aftermethod");
			System.out.println("logout");
		}
			
			
	    @AfterClass
			public void afterClass() throws InterruptedException {
				System.out.println("after class");
				//Thread.sleep(2000);
				driver.close();
				//Thread.sleep(2000);
				 ArrayList<String> listofAddr = new ArrayList<String>(driver.getWindowHandles());
				 driver.switchTo().window( listofAddr.get(0) ); 
				 
				driver.close();
				//Thread.sleep(2000);
				//driver.close();
				 ArrayList<String> listofAddr1 = new ArrayList<String>(driver.getWindowHandles());
				 driver.switchTo().window( listofAddr1.get(0) ); 
				 driver.close();
			}
	
}
	
	


