package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	// private web elements 
	
	@FindBy (xpath = ("//a[text()=' Logout']"))
	private WebElement logout;
	
	//public cunstructor
	
			public Logout (WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			//public methods actions on webelements
			
			public void ClickOnLogOut() {
				
				logout.click();
				
	
			}
}
