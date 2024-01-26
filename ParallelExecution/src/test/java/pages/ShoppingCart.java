package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

import wrappers.BaseClass;

 

public class ShoppingCart extends BaseClass {

	public WebDriver driver;

 

	public ShoppingCart(WebDriver driver) {
		//super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"terms-of-service-warning-box\"]/p")
	WebElement errorMsg;

	@FindBy(xpath="//*[@id=\"opc-billing\"]/div[1]/h2")
	WebElement billingAdressText;

	@FindBy(xpath="//*[@id=\"topcartlink\"]/a/span[1]")
	WebElement shoppingCartText;

	@FindBy(id="checkout")
	WebElement checkoutButton;

	@FindBy(id="termsofservice")
	WebElement agreeCheckBox;

	public void getIntoShoppingCart() {
		 clickingElement(shoppingCartText);
	}

	public String getBillingText() {
		return gettingValue(billingAdressText);
	}

 

	public String gettingErrorText() {
		return gettingValue(errorMsg);
	}

 

	public void checkout() {
		clickingElement(checkoutButton);
	}

	public void agreeTandC(){
		clickingElement(agreeCheckBox);
	}
}