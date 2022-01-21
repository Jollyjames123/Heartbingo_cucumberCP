
Feature: Homepage Features

  Background: User is on the Homepage

  @Sanity @Regression
    Scenario: All tabs are displayed on the homepage
      When User hovers over Bingo tab
      Then can verify that Bingo tab is displayed
      And hovers over Jackpots Tab
      And can verify that Jackpots Tab is displayed
      And hovers over Slots Tab
      And can verify that Slots Tab is displayed
      And hovers over Casino Tab
      And can verify that Casino Tab is displayed
      And hovers over Promos Tab
      And can verify that Promos Tab is displayed