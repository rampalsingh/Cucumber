Feature: Login Test

  Background: 
    Given validate the browser setting
    Then browsers initializes and navigates to URL

  @tag1
  Scenario: Verify entering text in google
    When Users enters "abcd" in the search bar
    Then User hits the Enter keyword 
    And Close the browser

