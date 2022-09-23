package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Dashboard {


	
		
		//private veriables webElement
		@FindBy (xpath =("//a[@class='orders-nav-item router-link-active']"))
		private WebElement Orders;
		
		@FindBy (xpath = ("//span[text()='Holdings']"))
		private WebElement Holdings;
		
		@FindBy (xpath = ("//span[text()='Positions']"))
		private WebElement Positions;
		
		@FindBy (xpath = ("//span[text()='Funds']"))
		private WebElement Funds;
		
		@FindBy (xpath =("//span[text()='Apps']"))
		private WebElement App;
		
		@FindBy (xpath = ("//span[@class='user-id']"))
		private WebElement Userid;
		
		@FindBy (xpath = ("//a[text()=' Logout']"))
		private WebElement logout;
		//public cunstructor
		
		public Dashboard (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//public methods actions on webelements
		
		public void ClickONOrders() {
			Orders.click();
		}
		public void ClickOnHoldings() {
			Holdings.click();
		}
		public void ClickOnPositions() {
			Positions.click();
		}
		public void ClickOnFund() {
			Funds.click();
		}
		public void ClickOnApp() {
			App.click();
		}
		public void userID() {
			Userid.click();
		}
		
		
		
}


