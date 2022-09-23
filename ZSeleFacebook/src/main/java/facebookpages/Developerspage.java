package facebookpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Developerspage {

          //private WebElements 	

        @FindBy (xpath = ("//div[text()='Developer Products']"))
        private WebElement DeveloperProduct;



        // Public constructor
    public Developerspage (WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
        // methods of webelements
    
    public void ClickOnDeveloperProduct() {
    	DeveloperProduct.click();
    }
    
    
    }