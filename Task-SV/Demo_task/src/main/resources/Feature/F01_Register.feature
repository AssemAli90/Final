@smoke
Feature: Register

  Scenario: As Anonymous user I want to register at system
    Given Navigate To system URL
    When Click on Register
    And select Gender
    And Entries First Name
    And Entries Last Name
    And Select day of Birth
    And Select month of Birth
    And select year of Birth
    And Entries valid email
    And Entries company name
    And Entries password
    And Entries Confirm password
    And Click on Register Button
    Then Registered successfully
