package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Samsungm21 {
   WebDriver driver;
	@FindBy (xpath = "//span[text()='Samsung Galaxy M21 2021 Edition (Arctic Blue, 4GB RAM, 64GB Storage) | FHD+ sAMOLED | 6 Months Free Screen Replacement for Prime (SM-M215GLBDINS)']")
	private WebElement samsungm21;
	
	
	// public constructor (To initialize webelement)
			public Samsungm21  (WebDriver driver) {
				PageFactory.initElements(driver, this);
				this.driver = driver;
			}
			

			public void ClickonSamsungM21() {
				samsungm21.click();
			}

}
