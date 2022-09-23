package amazontestpack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Amazon.Addtocart;

import Amazon.Samsungmobile13;
import Amazon.Searchbox;

public class Testclass1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh Zend\\Desktop\\selinum\\chromedriver1.exe"); 
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	 driver.get("https://www.amazon.in/");
		
    	 Searchbox searchbx = new Searchbox(driver);
    	 searchbx.searchbox();
    	 searchbx.ClickonSearchbutton();
    	 
    	 String searchbuttonclickurl = driver.getCurrentUrl();
    	 if(searchbuttonclickurl.equals("https://www.amazon.in/s?k=samsung+mobiles&ref=nb_sb_noss"))
    	 {
    		 System.out.println("url is verified");
    	 }
    	 else {
    		 System.out.println("url is wrong");
    	 }

    	 Samsungmobile13 samsungm13 = new Samsungmobile13(driver);
    	 samsungm13.ClickOnM13();
    	 
    	 Addtocart addtocart = new Addtocart(driver);
    	 ArrayList<String> listofAddr = new ArrayList<String>(driver.getWindowHandles());
    	 driver.switchTo().window( listofAddr.get(1) ); 
    	 addtocart.Addtocart1();
   	    Thread.sleep(2000);
   	    String url1 = driver.getCurrentUrl();
  	    System.out.println(url1);
    	 driver.close();   // close child browser
    	

    		 
    	driver.switchTo().window( listofAddr.get(0) ); // close main browser
        driver.close();
    	
    	 
	}

}
