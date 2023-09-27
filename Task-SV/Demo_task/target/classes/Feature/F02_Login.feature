@smoke
Feature: Login

  Scenario: As user I want login nopcommerce website
    Given Navigate To login page URL
    When Enter valid email
    And Enter Valid password
    And Click login
    Then User login successful
