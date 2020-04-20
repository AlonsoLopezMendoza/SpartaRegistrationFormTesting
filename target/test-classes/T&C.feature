Feature: If the user interacts with the terms and conditions toggle button, it responds correctly
  Scenario: User is on the form and he clicks the terms and conditions toggle button
    Given I am on the form page
    When I click the terms and conditions toggle button
    Then The input is accepted for the terms and conditions toggle button

  Scenario: User is on the form and he doesn't click the terms and conditions toggle button
    Given I am on the form page
    When I don't click the terms and conditions
    Then The input is not accepted for the terms and conditions toggle buttons