package facebookpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Roomspage {
	
	//WebElement private
	
	@FindBy (xpath =("//a[text()=' Return to messenger.com ']"))
	private WebElement Returntomassanger;
	
	@FindBy (xpath = ("//a[text()=' Visit our help center ']"))
	private WebElement visitHelpcenter;
	
	
	// constructor public
	
	public Roomspage (WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	// Webelement action
	
	public void GoBacktomassanger() {
		Returntomassanger.click();
	}
	public void Contacthelpcenter() {
		visitHelpcenter.click();
	}
}
