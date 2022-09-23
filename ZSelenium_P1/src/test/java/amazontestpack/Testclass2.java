package amazontestpack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import Amazon.Samsungm21;
import Amazon.Searchbox;
import Amazon.Visitesamsung;

public class Testclass2 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saurabh Zend\\Desktop\\selinum\\chromedriver1.exe"); 
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
   	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   	 driver.get("https://www.amazon.in/");
		
   	 Searchbox searchbx = new Searchbox(driver);
   	 searchbx.searchbox();
   	 searchbx.ClickonSearchbutton();
   	 
   	Samsungm21 samsungm21 = new Samsungm21(driver);
   	samsungm21.ClickonSamsungM21();
   	
   	
   	Visitesamsung comparem21 = new Visitesamsung(driver);
    ArrayList<String> listofAddr = new ArrayList<String>(driver.getWindowHandles());
	 driver.switchTo().window( listofAddr.get(1) ); 
	 comparem21.VisitesamsungStore();
	  
	 Thread.sleep(2000);
	 //String visitesamsungurl = driver.getCurrentUrl();
	 String visitesamsungurl = driver.getCurrentUrl();
	 String title = driver.getTitle();
	 System.out.println(title);
	 System.out.println(visitesamsungurl);
	 if(visitesamsungurl.equals("https://www.amazon.in/stores/SamsungBrandStore/page/7613B800-61FF-4320-8DEF-4A3711D5E41C?ref_=ast_bln")&& title.equals("Amazon.in: Samsung Brand Store")){
		 System.out.println("url and title is correct");
	 }
	 else {
		 System.out.println("url and title is wrong");
	 }
	 
	}
}
