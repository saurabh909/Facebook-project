package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {

	WebDriver driver;
	@FindBy (xpath = "//input[@id='add-to-cart-button']")
	private WebElement addtocart;
	
	
	
	
	
	
	// public constructor (To initialize webelement)
		public Addtocart (WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}
		
		
		//public methods
		public void Addtocart1() {
			addtocart.click();
		}
      // public void ClickOnLearnmore() {
    	  // Alert alt = driver.switchTo().alert();
    	 //  learnmore.click();
       
}
