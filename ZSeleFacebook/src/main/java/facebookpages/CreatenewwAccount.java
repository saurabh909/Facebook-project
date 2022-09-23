package facebookpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatenewwAccount {
	
	//private veriables (webelements)
	
		@FindBy (xpath = ("//a[text()='Create New Account']"))
		private WebElement createNewAcc;

		@FindBy (xpath = ("//input[@name='firstname']"))
		private WebElement FirstName;
		
		@FindBy (xpath = ("//input[@name='lastname']"))
		private WebElement LastName;
		
		@FindBy (xpath = ("//input[@name='reg_email__']"))
		private WebElement MobNumber;
		
		@FindBy (xpath = ("//input[@name='reg_passwd__']"))
		private WebElement NewPassword;
		
		@FindBy (xpath = ("//select[@id='day']"))
		private WebElement DOBDay;
		
		@FindBy (xpath = ("//select[@id='month']"))
		private WebElement Month;
		
		@FindBy (xpath = ("//select[@id='year']"))
		private WebElement Year;
		
		@FindBy (xpath = ("(//input[@type='radio'])[1]"))
		private WebElement Femalebutton;
		
		@FindBy (xpath = ("(//input[@type='radio'])[2]"))
		private WebElement Malebutton;
					
		@FindBy (xpath = ("//button[@name='websubmit']"))
		private WebElement SignUpButton;	
		
		
		//Public Constructor (initialize the webelements)
		public  CreatenewwAccount(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
							
		// public methods (actions on Webelements
		public void CreateNewAccount() {
			createNewAcc.click();
		}
		public void FirstNameEnter() {
			FirstName.sendKeys("saurabh");
		}
		public void LastNameEnter() {
			LastName.sendKeys("zend");
		}
		public void MobNoSend() {
			MobNumber.sendKeys("8888101211");
		}
		public void EnterNewPassword() {
			NewPassword.sendKeys("Saurabh@54321");
		}
		
        public void DateOfBirth() {
        	DOBDay.click();
        	Select dropdown = new Select(DOBDay);
    		dropdown.selectByIndex(12);	
        }
        public void SelectMonth() {
        	Month.click();
        	Select dropdown2 = new Select (Month);
    		dropdown2.selectByValue("8");   
        }
        
        public void SelectYear() {
        	Year.click();
        	Select dropdown3 = new Select(Year);
    		dropdown3.selectByVisibleText("1994");
        }
        public void SelectFemale() {
        	Femalebutton.click();
        }
		public void SelectMale() {
			Malebutton.click();
		}
		public void SignupClick() {
			SignUpButton.click();
		}
}
