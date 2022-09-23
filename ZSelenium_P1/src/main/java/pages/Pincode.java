package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pincode {

	


		// private webElements
		
		@FindBy (xpath = ("//input[@id='pin']"))
		private WebElement Pinno;
		
		@FindBy (xpath = ("//button[@type='submit']"))
		private WebElement LoginButton;
		
	   // public constructor
		public Pincode(WebDriver driver) {
		PageFactory.initElements(driver, this);
	     }
		
		
		// public methods (actions on webelement)
		
		public void SendPinno() {
			Pinno.sendKeys("285499");
		}
		public void  ClickonLogin() {
			LoginButton.click();
		}
   
}
