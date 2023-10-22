Feature: Checkout

  Scenario Outline: fill information
    Given form information page
    When input first name
    And input last name
    And input postal code
    And  click Continue
    And click finish
    And click back to product
    Then user back into dashboard page
