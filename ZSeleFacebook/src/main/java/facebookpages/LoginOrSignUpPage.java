package facebookpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	
	//private veriables (webelements)
	
	@FindBy (xpath ="//input[@id='email']")
	private WebElement userName;

	@FindBy (xpath ="//input[@id='pass']")
	private WebElement password;

	@FindBy (xpath ="//button[@name='login']")
	private WebElement LoginButton;

	@FindBy (xpath ="//a[text()='Create New Account']")
	private WebElement createNewAccount;
	
	@FindBy (xpath =("//a[text()='Messenger']"))
	private WebElement ClickONMessanger;
	
	@FindBy (xpath = ("//a[text()='Developers']"))
	private WebElement Developers;
	
	//public constructor (To initialize webelement)
	public LoginOrSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// public methods (actions on webelement
	public void sendUserName(WebDriver driver) {
		
		userName.sendKeys("Velocity@gmail.com");
	}
	public void sendPasswordName() {
		password.sendKeys("123456");
	}
	
	public void ClickonLoginbutton() {
		LoginButton.click();
	}
	public void ClickoncreateNewAccount() {
		createNewAccount.click();
	}
	public void ClickonMAssanger() {
		 ClickONMessanger.click();
	}
	public void ClickonDevelopers() {
		Developers.click();
	}
	
	//OR//
	
	
}
