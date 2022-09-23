package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Visitesamsung {

	
	
	WebDriver driver;
	@FindBy (xpath = ("//a[text()='Visit the Samsung Store']"))
	private WebElement visit;
	
	
	
	
	
	
	// public constructor (To initialize webelement)
		public Visitesamsung (WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}
		
		
		//public methods
		public void VisitesamsungStore() {
			visit.click();
		}
	
	
	
	
	
	
	
}
