@smoke

Feature: Shopping

  Scenario: As user I wand save Item to cart
    Given Navigate To login URL
    When Insert valid email
    And Insert Valid password
    And Click login btn
    And click on Books
    And click on sorted by price low to high
    And Select second Item
    And Click add to cart
    And go to your cart
    Then make sure item saved to cart
