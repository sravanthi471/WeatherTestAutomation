Feature: Get weather 
As a weather.com user I want to get weather based on city provided.

  Scenario: get weather and assert
    Given I want to get weather report 
    When I request to get weather 
    Then I validate the outcomes
