Feature: Test google search feature

  @Task5
  Scenario: google search
    Given an open browser with "http://google.com"
    When a keyword "Selenium" is entered in input field
    Then the first one should contain "Selenium"
    And close browser
