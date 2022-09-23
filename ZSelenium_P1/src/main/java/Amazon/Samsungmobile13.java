package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Samsungmobile13 {
     WebDriver driver;
	// private webelement
	@FindBy (xpath = ("(//span[text()='Samsung Galaxy M13 (Aqua Green, 6GB, 128GB Storage) | 6000mAh Battery | Upto 12GB RAM with RAM Plus'])[1]"))
     private WebElement samsungm13;	
				
				
	//public constructor
		public Samsungmobile13(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		
		
		// public methods
		public void ClickOnM13() {
			samsungm13.click();
			
		}

}
