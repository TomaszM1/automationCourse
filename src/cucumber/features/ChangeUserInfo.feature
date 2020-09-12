Feature: Change user information after login

  Scenario: Change user birthday date, gender and sign up for a newsletter
    Given User is logged in to CodersLab shop
    When User goes to UserInformationPage
    And User signs up for our newsletter
    And User saves information
    Then User sees "Information successfully updated."

  Scenario Outline: Add new address
    Given Log in to CodersLab shop
    When User goes to AddressPage
    And User set following address "<address>"
    And User set following city "<city>"
    And User set following post code "<postCode>"
    And User submits add new address form
    Then Address was submitted correctly
    And close driver

    Examples:
      | address | city     | postCode |
      | Polska  | Warszawa | 00-000   |
      | Niemcy  | Berlin   | 00-001   |