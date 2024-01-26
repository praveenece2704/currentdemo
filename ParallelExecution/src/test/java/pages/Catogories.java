package pages;

 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

import wrappers.BaseClass;

 

public class Catogories extends BaseClass{

	@FindBy(xpath="//div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")
	WebElement booksLink;

	@FindBy(xpath="//div[4]/div[1]/div[1]/div[2]/ul/li[2]/a")
	WebElement computersLink;

	@FindBy(xpath="//div[4]/div[1]/div[1]/div[2]/ul/li[3]/a")
	WebElement electronicsLink;

	@FindBy(xpath="//div[4]/div[1]/div[1]/div[2]/ul/li[4]/a")
	WebElement apparelsAndShoesLink;

	@FindBy(xpath="//div[4]/div[1]/div[1]/div[2]/ul/li[5]/a")
	WebElement digitalDownloadsLink;

	@FindBy(xpath="//div[4]/div[1]/div[1]/div[2]/ul/li[6]/a")
	WebElement jewelryLink;

	@FindBy(xpath="//div[4]/div[1]/div[1]/div[2]/ul/li[7]/a")
	WebElement giftCardsLink;

	@FindBy(linkText="Computing and Internet")
	WebElement computerBookLink;

	@FindBy(id="add-to-cart-button-13")
	WebElement addToCart;

	public void AddBooktoCart() {
		clickingElement(booksLink);
		clickingElement(computerBookLink);
		clickingElement(addToCart);

	}


 

}