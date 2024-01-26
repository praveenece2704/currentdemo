Feature: Validation of Login page

  Scenario: Login Successful
    Given user navigates to the application
    When the user enter the username as "sampledata@demo.com" and password as "sampledata" and press login
    And validate the login successful as "sampedata@demo.com"

  Scenario: Login failure
    Given user navigates to the application
    When the user enter the username as "sample@demo.com" and password as "sampledata" and press login
    But user got the message as "Login was unsuccessful. Please correct the errors and try again."
