Feature: Validating ShoppingCart

Background:
    Given user navigates to the application
    When the user enter the username as "sampledata@demo.com" and password as "sampledata" and press login
    And the user enter into the shoppingcart page
 
  @cart
  Scenario: Checkout without agree the terms and conditions
    Then the user proceed to checkout
    But the user got the message as "Please accept the terms of service before the next step."
 
  @cart
  Scenario: Checkout after agree the terms and conditions
    And the user agree the terms & conditions
    Then the user proceed to checkout
    Then the user enter into the "Billing Address" section