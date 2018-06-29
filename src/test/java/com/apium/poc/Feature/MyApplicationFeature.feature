@Functional
Feature: Smoke Selendroid Test
	@Smoke
  Scenario: Register a new Selendroid User
    Given User opens Selendroid application
    When User clicks on Create New User icon
    And Unser provides valid details and click on submit button
    Then User details should be populated correctly on verify screen
    When user clicks on Confirm button
    Then homepage should be displayed
    
   @Prod
   Scenario: Validate Toast message
    Given User opens Selendroid application
    When User clicks on Display a Toast button
    Then Toast message should be displayed
    
    @Smoke
    Scenario: Handle Popup message
    Given User opens Selendroid application
    When User clicks on Display Popup button
    Then Popup should be displayed and user able to dismiss it
    