@scholastic
Feature: Place an order by adding a new credit card

  Scenario: TC12 - Verify zero tax for SFO-YTO orders in the checkout for teacher with non-tax state school
    When I click Sign In
    And type email address username 'mmjmmkju@gmail.com'
    And type password 'poiu0987'
    Then click Sign in
    And click close the curtains
    And Navigate to enter orders
    Then click to Student Fryer Orders
    And enter 'Harry'
    And enter item number '16A4'
    And click Add
    And enter 'Michael'
    And enter item number '34N3'
    And click Add
    Then I click Your Teacher Order and click By Flyer
    And add quantity for one book '3' and click Review Cart
    And click proceed to checkout second time click proceed to checkout
    And Verify if Your Estimated Tax is zero for non-tax State school



  Scenario: TC13 - Verify tax is present for SFO-YTO orders in the checkout for teacher with tax state school

    When I click Sign In
    And type email address username 'zrmyfppqonmn@gmail.com'
    And type password 'poiu0987'
    Then click Sign in
    And click close the curtains
    And Navigate to enter orders
    Then click to Student Fryer Orders
    And enter 'Harry'
    And enter item number '16A4'
    And click Add
    And enter 'Michael'
    And enter item number '34N3'
    And click Add
    Then I click Your Teacher Order and click By Flyer
    And add quantity for one book '7' and click Review Cart
    And click proceed to checkout second time click proceed to checkout
    And Verify if there tax greater than zero





  Scenario: TC15 - Verify user can place an order by adding a new credit card

    When I click Sign In
    And type email address username 'zxcza@gmail.com'
    And type password 'poiu0987'
    Then click Sign in
    And click close the curtains
    And Navigate to enter orders
    Then click to Student Fryer Orders
    And enter 'Harry'
    And enter item number '16A4'
    And click Add
    And enter 'Michael'
    And enter item number '34N3'
    And click Add
    And click proceed to checkout second time click proceed to checkout
  Then click continue checkout
    And click Ship To MySchool
    And click Select Payment Method
    And enter a new credit card number '4222222222222'
    And click enter expiration date
    And enter CVN code '345'
    And enter first name 'Zhenya'
    And enter last name 'Kirova'
    And type address1 '443 Broadway ave'
    And enter zipcode '10012'
    And enter phone number '4433222345'
    And click CheckOut and submit
    And Verify if Thank you message is displayed
    And Verify if Order Receipt Reference number is displayed
