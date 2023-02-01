Feature: Check login functionality using hooks

  @smoke
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page
  @smoke
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page