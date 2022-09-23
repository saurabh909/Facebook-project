package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchbox {
      WebDriver driver;
	// webElement private
	@FindBy (xpath = ("//input[@id='twotabsearchtextbox']"))
	private WebElement searchbox;

	//@FindBy (xpath = ("(//span[text()='Samsung Galaxy M13 (Aqua Green, 6GB, 128GB Storage) | 6000mAh Battery | Upto 12GB RAM with RAM Plus'])[1]"))
   // private WebElement samsungm13;	
				
	@FindBy (xpath = ("//input[@id='nav-search-submit-button']"))
	private WebElement searcbutton;
	
	
		
	//public constructor
	public Searchbox (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	// public methods
	public void searchbox() {
		searchbox.sendKeys("samsung mobiles");
	}
	
	
	public void ClickonSearchbutton() {
		searcbutton.click();
	}
	//public void ClickonSamsungM21() {
	//	samsungm21.click();
}
