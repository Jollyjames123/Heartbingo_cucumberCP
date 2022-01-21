@Smoke @Regression
Feature: Login functionality of Home Page


  Background: User is on home page
    Given User is on home page


  Scenario: Verify Login button is working fine
    When User clicks on Login button
    Then verify user is on Login page


  Scenario Outline: Verify user is not able to login with invalid credentials
    When User clicks on Login button
    And enters username and password "<Username>" "<Password>"
    And Clicks on Login button to login
    Then verifies the error message "<ErrorMessage>"
    Examples:
      | Username         | Password | ErrorMessage                                                         |
      | PrimeTrainee     | Prime123 | The username or password you entered is incorrect. Please try again. |
      | xyz123@gmail.com | abc123   | The username or password you entered is incorrect. Please try again. |
