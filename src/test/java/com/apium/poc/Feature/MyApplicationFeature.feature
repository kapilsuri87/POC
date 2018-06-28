Feature: Smoke Selendroid Test

  Scenario: Register a new Selendroid User
    Given User opens Selendroid application
    When User clicks on Create New User icon
    And Unser provides valid details and click on submit button
    Then User details should be populated correctly on verify screen
    When user clicks on Confirm button
    Then homepage should be displayed