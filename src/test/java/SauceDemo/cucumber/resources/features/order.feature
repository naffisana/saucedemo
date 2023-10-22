Feature: Add to cart

  Scenario Outline: add to cart
    Given dashboard page
    When add to cart
    And  click Checkout
    Then user in information page
