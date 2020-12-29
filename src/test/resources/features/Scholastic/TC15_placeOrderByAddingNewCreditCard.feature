@scholastic
Feature: Place an order by adding a new credit card

  Scenario: Verify user can place an order by adding a new credit card

    When I click Sign In
    When type email address username 'zxcza@gmail.com'
    And type password 'poiu0987'
    Then click Sign in
    And click close the curtains
#    Then add items to the shopping card
