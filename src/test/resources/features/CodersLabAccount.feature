Feature: Create coders lab account

  @Task6
  Scenario: google search
    Given an open browser with "https://qloapps.coderslab.pl"
    When I click sign in
    And I enter following email address "absb8078890i@wp.pl" and submit
    And  I fill in personal information
      | Title       | Mr.              |
      | FirstName   | Adam             |
      | LastName    | Nowak            |
      | Password    | wlkjehfowij12131 |
      | DateOfBirth | 12-10-1990       |
    And I register new user
    Then Account was created and I can see following information "Your account has been created."
    And close browser
