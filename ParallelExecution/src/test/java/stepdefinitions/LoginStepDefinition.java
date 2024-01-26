package stepdefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

 

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.Login;
import utilities.Context;

public class LoginStepDefinition{

	public Login login;
	public Context context;
	public HomePage homepage;

	public LoginStepDefinition(Context context) {
		super();
		this.context= context;
		login = context.getLogin();
		homepage = context.getHomePage();
	}

	@Given("user navigates to the application")
	public void userNavigatesToTheApplicationLoginPage() throws FileNotFoundException, IOException {
		context.openBaseUrl();
	}

 

	@When("the user enter the username as {string} and password as {string} and press login")
	public void theUserEnterTheUsernameAsAndPasswordAs(String username, String password) throws InterruptedException {
		login.loginProcess(username, password);

	}

 

	@And("validate the login successful as {string}")
	public void validateTheLoginSuccessful(String expectedEmail) {
		String actualEmail = homepage.gettinguserdetails();
		//assertEquals(expectedEmail, actualEmail);
		System.out.println("Thread Id - "+Thread.currentThread().getId());

 

	}

 

	@When("user got the message as {string}")
	public void userGotTheMessageAs(String errorMsgExpected) {
		String errorMsgActual = login.errorDisplay();
		//assertEquals(errorMsgExpected, errorMsgActual);
		System.out.println("Thread Id - "+Thread.currentThread().getId());
	}

 

}