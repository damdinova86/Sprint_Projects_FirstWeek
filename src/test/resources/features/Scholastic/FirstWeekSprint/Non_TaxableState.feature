@scholastic
Feature: Non_TaxableState

  Scenario: Verify all information entered right in Non-Taxable State
    When I click 'Create an Account'
    And Choose 'Teacher/Administrator/Homeschooler' from the option
    And click Next
    And click 'Select Title'
    Then I choose 'Ms' from dropdown Title
    When Type my first name 'Bal'
    And Type my last name 'Damdinova'
    And Type my email address 'mmjmmkju@gmail.com'
    And Type password 'poiu0987'
    Then click in the box I have read and accept the Terms of Use and Privacy Policy.
    And click Next on the button
    Then enter zip code '99518'
    And click Search
    And type 'Adak'
    And click on school box to get autosuggestion
    And Choose from dropdown 'Adak School'
    And click Next on school page
    Then Choose under the Role 'Teacher by Grade'
    And Choose 1st Grade under Grade
    And type '2' under the number of Students
    Then Click Next on My Role
    And Under preferred reading level system: choose 'Guided Reading Level GRL'
    And Click Continue to site
    Then click close the alert
    And  I save class code on Home-Page
    Then click My account and click Profile from dropdown
    And I verify if there is a CLASS CODE allocated to the teacher, present on Home-Page and MyAccount-Page.
    Then I verify  if the same Teacher name is present on My Account
    And I verify same school address is present as selected  while creating the account


