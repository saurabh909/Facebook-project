package facebookpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Massanger {
	
	
	//private WebElements
	@FindBy (xpath = ("//a[text()='Rooms']"))
	private WebElement Rooms;
	
	@FindBy (xpath = ("//a[text()='Features']"))
	private WebElement Features;
	
	@FindBy (xpath = ("//a[text()='Desktop app']"))
	private WebElement Desktopapp;
	
	@FindBy (xpath =("//a[text()='Privacy and safety']"))
	private WebElement Privacy;
	
	// constructor public
	
	public Massanger (WebDriver driver) {
		PageFactory.initElements(driver, this);	
		
	}
	
	//action on webelement
	
	public void ClickRooms() 
	{
		Rooms.click();
	}
	public void ClickFeatures() {
		Features.click();
	}
	public void ClickDesktop() {
		Desktopapp.click();
	}
	public void ClickPrivacy() {
		Privacy.click();
	}
	
}
	
	 
