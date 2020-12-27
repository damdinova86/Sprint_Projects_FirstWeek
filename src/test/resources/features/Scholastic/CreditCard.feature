Feature: Credit card

  Scenario: Verify teacher can add only 3 credit cards

    When I click Sign In
    When type email address username 'zxcza@gmail.com'
    And type password 'poiu0987'
    Then click Sign in
    And click close the curtains
    Then click My account and click Profile from dropdown
    And click add a card
    Then I type credit card number '4222222222222'
    And choose from dropdown expiration date
    And type security code '432'
    And type first name 'Bal'
    And type last name 'Damdinova'
    And type address '345 Broadway Ave'
    And type zipcode '10036'
    And type phone number '4433222345'
    And click save
    And click add a card second time
    Then Verify that you will see error message You can only store three credit cards








