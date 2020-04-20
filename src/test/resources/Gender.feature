Feature: If the user interacts with the gender radio buttons, they responds correctly
  Scenario: User is on the form and he selects the male radio button
    Given I am on the form page
    When I select the male option in the gender radio buttons
    Then The male input is accepted for the gender radio buttons

  Scenario: User is on the form and he selects the female radio button
    Given I am on the form page
    When I select the female option in the gender radio buttons
    Then The female input is accepted for the gender radio buttons

  Scenario: User is on the form and he doesn't select a gender radio button
    Given I am on the form page
    When I don't select a gender radio button
    Then The input for gender radio buttons is not accepted