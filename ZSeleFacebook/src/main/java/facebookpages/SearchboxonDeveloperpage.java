package facebookpages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchboxonDeveloperpage {
     WebDriver driver;
	// private WEBElements
	 
	@FindBy (xpath =("//input[@placeholder='Search by product']"))
	private WebElement Searchbox;
	
	@FindBy (xpath = ("(//div[text()='OVERVIEW'])[9]"))
	private WebElement OverView;
	
	@FindBy (xpath = ("//a[text()='Privacy Policy']"))
	private WebElement PrivacyandPolicy;
	
	// public constructor
	
	public SearchboxonDeveloperpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		//this.driver = driver;
	}

	
	// methods 
	   public void ClickonSearchbox(){
		
		Searchbox.click();
		Searchbox.sendKeys("Business tools");
	}
	   public void ClickOnOverView() {
		   OverView.click();
	   }
	public void ClickonPrivacyandPolicy() {
		 PrivacyandPolicy.click();
	}

}
