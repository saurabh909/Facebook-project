package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotUserIdAndPasswod {
	
	// private variables (WebElement)
	
		@FindBy (xpath = "//a[contains(text(),'Forgot user ID or password?')]")
		private WebElement ForgotuserIdPassword ;

		@FindBy (xpath = "(//label[@class='su-radio-label'])[1]")
		private WebElement ForgotUserId;
		
		@FindBy (xpath = "//input[@placeholder='PAN']")
		private WebElement PancardNo;
		
		@FindBy (xpath = "(//label[@class='su-radio-label'])[4] ")
		private WebElement Sms;
		
		@FindBy (xpath = "//input[@placeholder='Mobile number (as on account)']")
		private WebElement MobNumber;
		
		@FindBy (xpath = "//p[@class='text-center']")
		private WebElement BacktoLogin;
		
		
		// public constructor (To initialize webelement)
		public ForgotUserIdAndPasswod (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void ClickForgotuserIdPassword() {
			ForgotuserIdPassword.click();
		}
		public void ClickForgotUserID() {
			ForgotUserId.click();
		}
		public void SendPancardNo() {
			PancardNo.sendKeys("PD3789");
		}
		public void Clicksms() {
			Sms.click();
		}
		public void SendMobileno() {
			MobNumber.sendKeys("8888101211");
			}
		public void ClickBacktoLogin() {
			BacktoLogin.click();
		}
		
		// another way
		
//		public void ForgotUSerIdPassword() {
//			ForgotuserIdPassword.click();
//			ForgotUserId.click();
//			PancardNo.sendKeys("PD3789");
//			Sms.click();
//			MobNumber.sendKeys("8888101211");
//			BacktoLogin.click();
			
		//}
}
