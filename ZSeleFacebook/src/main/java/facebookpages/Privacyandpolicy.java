package facebookpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Privacyandpolicy {
  WebDriver driver;
   // private webelements
	
	@FindBy (xpath = ("//a[text()='View printable version']"))
	private WebElement Printableversion;
	
	
	
	// public constructor
	
	public Privacyandpolicy(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	// public methods
	public void ClickonPrintableversion() {
		Printableversion.click();
	}
	

  }
