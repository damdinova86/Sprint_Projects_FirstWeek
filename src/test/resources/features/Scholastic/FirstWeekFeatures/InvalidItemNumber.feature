@scholastic
Feature: Invalid item number

  Scenario: Verify teacher gets error for invalid item number

    When I click Sign In
    When type email address username 'zxcza@gmail.com'
    And type password 'poiu0987'
    Then click Sign in
    And click close the curtains
    And Navigate to enter orders
    Then click to Student Fryer Orders
    And enter 'Harry'
    And enter item number '111'
    And click Add
    And I verify teacher gets error for invalid item number


