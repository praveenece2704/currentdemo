package stepdefinitions;


import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShoppingCart;
import utilities.Context;


public class ShoppingCartStepDefinitions {

	public Context context;
    public ShoppingCart shoppingCart;

	public ShoppingCartStepDefinitions(Context context) {
		this.context=context;
		shoppingCart= context.getShoppingCart();
	}
	@When("the user enter into the shoppingcart page")
	public void theUserEnterIntoTheShoppingcartPage() {
	    shoppingCart.getIntoShoppingCart();
	}
	@Then("the user proceed to checkout")
	public void theUserProceedToCheckout() {
	   shoppingCart.checkout();

	}
	@But("the user got the message as {string}")
	public void theUserGotTheMessageAs(String expectedErrorMsg) {
	    String actualErrorMsg = shoppingCart.gettingErrorText();
	    //assertEquals(expectedErrorMsg, actualErrorMsg);
	    System.out.println("Thread Id - "+Thread.currentThread().getId());
	}

	@When("the user agree the terms & conditions")
	public void theUserAgreeTheTermsConditions() {
	   shoppingCart.agreeTandC();
	}

	@Then("the user enter into the {string} section")
	public void theUserEnterIntoTheSection(String expectedText) {
	   String actualText = shoppingCart.getBillingText();
	   //assertEquals(expectedText,actualText);
	   System.out.println("Thread Id - "+Thread.currentThread().getId());
	}

 

 

}