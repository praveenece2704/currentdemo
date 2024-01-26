package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




import wrappers.BaseClass;




public class WishList extends BaseClass{
	
	public WebDriver driver;




	public WishList(WebDriver driver) {
		//super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[1]/ul/li[4]/a/span[1]")
	WebElement wishListText;
	
	public void getIntoWishList() {
		 clickingElement(wishListText);
	}




}
 
