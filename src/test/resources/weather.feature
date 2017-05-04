Feature: Get weather 
As a weather.com user I want to get weather based on city provided

  Scenario: get weather and assert
    Given I want to get weather report 
    When I request to get weather 
    Then I validate the outcomes
    
   Scenario Outline: get weather with valid city and country name
    Given I want to get weather using city and country name
    When I request to get weather 
    Then I should see the weather as "output"
    
    Examples:
    |output|
    |Data Not Found|