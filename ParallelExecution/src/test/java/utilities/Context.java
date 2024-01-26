package utilities;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.Login;
import pages.ShoppingCart;
import wrappers.BaseClass;


public class Context extends BaseClass {

 

	private HomePage homepage;
	private Login login;
	private ShoppingCart shoppingCart;

 

	public Context() throws MalformedURLException {
		setUp();
	}

	public WebDriver getDriver() {
		return driver;
	}

 

	public Login getLogin() {

 

		if (login == null) {
			login = new Login(driver);
		}
		return login;
	}

 

	public HomePage getHomePage() {

 

		if (homepage == null) {
			homepage = new HomePage(driver);
		}
		return homepage;
	}

 

	public ShoppingCart getShoppingCart() {

 

		if (shoppingCart == null) {
			shoppingCart = new ShoppingCart(driver);
		}
		return shoppingCart;
	}

 

}
