package pages;

 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

import wrappers.BaseClass;

 

public class Registration extends BaseClass{

	@FindBy(id="gender-male")
	WebElement genderMaleRadioButton;

	@FindBy(id="gender-female")
	WebElement genderFemaleRadioButton;

	@FindBy(id="FirstName")
	WebElement firstNameInputField;

	@FindBy(id="LastName")
	WebElement lastNameInputField;

	@FindBy(id="Email")
	WebElement emailInputField;

	@FindBy(id="Password")
	WebElement passwordInputField;

	@FindBy(id="ConfirmPassword")
	WebElement confirmPasswordInputField;

	@FindBy(id="register-button")
	WebElement registerBtn;

	public void registrationProcess(String gender, String firstname, String lastname, String email, String password, String confirmpassword) {
		if(gender.equalsIgnoreCase("male")) {
		clickingElement(genderMaleRadioButton);
		}
		else if(gender.equalsIgnoreCase("female")) {
			clickingElement(genderFemaleRadioButton);
		}
		else {
			System.out.println("Error on selecting the radio button");
		}
		enteringValue(firstNameInputField, firstname);
		enteringValue(lastNameInputField, lastname);
		enteringValue(emailInputField, email);
		enteringValue(passwordInputField, password);
		enteringValue(confirmPasswordInputField, confirmpassword);
		clickingElement(confirmPasswordInputField);
	}

 

}