Feature: Recommendation List

  Scenario: Verify Recommendations list


    When I click Sign In
    When type email address username 'zxcza@gmail.com'
    And type password 'poiu0987'
    Then click Sign in
    And click close the curtains
    Then type 'Harry' in search box
    And close small PopUp
    And click magnifying glass
#      And scroll down
    Then click Quick look on any book
    And save item name in Quick look
    And click star button
    And click Recommendations  to students
    When done click close Add to My Lists
#    And scroll up
    And close Quick look box
    Then click My Lists
    And click Recommendations for Students
    And verify if name of the item is the same under  Myn List and Recommendations  to Students




