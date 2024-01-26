package pages;


import java.io.FileNotFoundException;
import java.io.IOException;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

import wrappers.BaseClass;

 

public class Login extends BaseClass {

 

	public WebDriver driver;

 

	public Login(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "ico-login")
	WebElement loginLinkText;
//	
//	driver.get(url);
//	WebElement login = driver.findElement(By.className("ico-login"));

 

	@FindBy(id = "Email")
	WebElement emailInputField;

 

	@FindBy(id = "Password")
	WebElement passwordInputField;

 

	@FindBy(className = "login-button")
	WebElement loginbtn;

 

	@FindBy(xpath = "//div[1]/div[2]/div[2]/form/div[1]/div/span")
	WebElement errorMsg;

 

	public void loginProcess(String username, String password) throws InterruptedException {
		Thread.sleep(6000);
		clickingElement(loginLinkText);
		enteringValue(emailInputField, username);
		enteringValue(passwordInputField, password);
		clickingElement(loginbtn);
	}

 

	public String errorDisplay() {
		String error = gettingValue(errorMsg);
		return error;
	}
}