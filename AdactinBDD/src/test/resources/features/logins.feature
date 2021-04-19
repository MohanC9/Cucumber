Feature: Adactin Login feature

  Scenario: Login
    Given User present in Adactin Login page
    When User Enter Username
    And User Enter Password
    And User Click on Login Button
    Then Get Title of the Page
    Then Close
