Feature: Log in to the application

  Scenario Outline: success login
    Given Login page saucedemo
    When input username
    And input password
    And click Login button
    Then user in on dashboard page

  Scenario Outline: success login
    Given Login page saucedemo
    When input username
    And input invalid password
    And click Login button
    Then user get error message
