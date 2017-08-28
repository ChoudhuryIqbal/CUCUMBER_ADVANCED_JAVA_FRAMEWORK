Feature: LoginFeature
  This feature is responsible for testing all the scenarios for login of application

  Scenario: Check login with correct username and password
    
    Given  I have navigated to the application
    And I see application opened
    Then I click login link
    When I enter UserName and Password
    |UserName|  password|

    Then  I click login button
    Then I should see the username
