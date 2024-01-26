Feature: Validating HomePage

  Background:
    Given user navigates to the appli cation
    When the user enter the username as "sampledata@demo.com" and password as "sampledata" and press login
 
 
  Scenario: Navigate to the CellPhone by Header Icon
    Then the user enter into the cellphone catogery from header
    And maximize the particular cellphone details
 
  Scenario: Navigate to the cellphone by Side navbar
    Then the user enter into the cellphone catogery from sidenav
    And maximize the particular cellphone details