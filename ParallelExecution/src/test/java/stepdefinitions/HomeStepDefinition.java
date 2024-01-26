package stepdefinitions;

 

import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.Login;
import utilities.Context;

 

public class HomeStepDefinition{

	public HomePage homepage;
	public Login login;
	public Context context;

	public HomeStepDefinition(Context context) {
		//super();
		this.context = context;
		homepage =context.getHomePage();

	}
	@Then("the user enter into the cellphone catogery from header")
	public void theUserEnterIntoTheCellphoneCatogeryFromHeader() {
	   homepage.navigateToCellphonesbyheader(this.context.getDriver());
	}

	@Then("the user enter into the cellphone catogery from sidenav")
	public void theUserEnterIntoTheCellphoneCatogeryFromSidenav() throws InterruptedException {
	  homepage.navigateToCellphonesbysidemenu(this.context.getDriver());
	}

	@Then("maximize the particular cellphone details")
	public void maximizeTheParticularCellphoneDetails() {
	   homepage.maximizeMobileDetails();
	   System.out.println("Thread Id - "+Thread.currentThread().getId());
	}

 

}