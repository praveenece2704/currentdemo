package pages;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

import wrappers.BaseClass;

 

public class HomePage extends BaseClass {

	public WebDriver driver;

 

	public HomePage(WebDriver driver) {
		//super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement useremailText;

 

	@FindBy(xpath = "//div[4]/div[1]/div[2]/ul[1]/li[1]/a")
	WebElement bookMenu;

 

	@FindBy(xpath = "//div[4]/div[1]/div[2]/ul[1]/li[2]/a")
	WebElement computerMenu;

 

	@FindBy(xpath = "//div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[1]/a")
	WebElement desktopDropDown;

 

	@FindBy(xpath = "//div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[2]/a")
	WebElement notepadDropDown;

 

	@FindBy(xpath = "//div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[3]/a")
	WebElement accessoriesDropDown;

 

	@FindBy(xpath = "//div[4]/div[1]/div[2]/ul[1]/li[3]/a")
	WebElement electronicsMenu;

 

	@FindBy(xpath = "//div[4]/div[1]/div[2]/ul[1]/li[3]/ul/li[1]/a")
	WebElement cameraAndPhotos;

 

	@FindBy(xpath = "//div[4]/div[1]/div[2]/ul[1]/li[3]/ul/li[2]/a")
	WebElement cellphones;

 

	@FindBy(xpath = "//div[4]/div[1]/div[2]/ul[1]/li[4]/a")
	WebElement apparelAndShoesMenu;

 

	@FindBy(xpath = "//div[4]/div[1]/div[2]/ul[1]/li[5]/a")
	WebElement digitalDownloadMenu;

 

	@FindBy(xpath = "//div[4]/div[1]/div[2]/ul[1]/li[6]/a")
	WebElement jewelryMenu;

 

	@FindBy(xpath = "//div[4]/div[1]/div[2]/ul[1]/li[7]/a")
	WebElement giftCards;

	@FindBy(linkText = "Smartphone")
	WebElement smartPhoneText;

	@FindBy(xpath="//div[4]/div[1]/div[1]/div[2]/ul/li[3]/a")
	WebElement electronicsSideMenu;

	@FindBy(xpath = "//div[1]/div[1]/div[2]/ul/li[3]/ul/li[2]/a")
	WebElement cellPhonebyside;

	public String gettinguserdetails() {
		return gettingValue(useremailText);
	}

	public void navigateToBooks() {
		clickingElement(bookMenu);
	}

 

	public void navigateToDesktop(WebDriver driver) {
		mouseHover(computerMenu,driver);
		clickingElement(desktopDropDown);
	}

 

	public void navigateToNotepad(WebDriver driver) {
		mouseHover(computerMenu,driver);
		clickingElement(notepadDropDown);
	}

 

	public void navigateToAccessories(WebDriver driver) {
		mouseHover(computerMenu,driver);
		clickingElement(accessoriesDropDown);
	}

 

	public void navigateToCameraAndPhotos(WebDriver driver) {
		mouseHover(electronicsMenu,driver);
		clickingElement(cameraAndPhotos);
	}

 

	public void navigateToCellphonesbyheader(WebDriver driver) {
		mouseHover(electronicsMenu,driver);
		mouseHover(cellphones,driver);
		clickingElement(cellphones);
	}

	public void navigateToCellphonesbysidemenu(WebDriver driver) throws InterruptedException {
		clickingElement(electronicsSideMenu);
		Thread.sleep(2000);
		clickingElement(cellPhonebyside);
	}



	public void maximizeMobileDetails() {
		clickingElement(smartPhoneText);
	}

 

}