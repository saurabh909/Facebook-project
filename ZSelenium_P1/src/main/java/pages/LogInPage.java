package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	// private variables (WebElement)
	
	@FindBy (xpath = "//input[@id='userid']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement passWord;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement LoginButton;
	
	@FindBy (xpath = "//a[contains(text(),'Forgot user ID or password?')]")
	private WebElement ForgotuserIdandPassword;
	
	// public constructor (To initialize webelement)
	public LogInPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// public methods (actions on webelement)
	
	public void SendUserName() {
		
		userName.sendKeys("PD3789");	
	}
	
	public void SendPassword() {
	
		passWord.sendKeys("Saurabh@12345");
	}
	
	public void ClickOnLoginButton() {
		LoginButton.click();
	}
	
	//public void ForgotUserIDandPassword() {
		//ForgotuserIdandPassword.click();
		
	//}
	
	//OR  complete functionality
//	public void LogInApplication() {
//		userName.sendKeys("PD3789");
//		passWord.sendKeys("Saurabh@");
//		ForgotuserIdandPassword.click();
	}
	
	


