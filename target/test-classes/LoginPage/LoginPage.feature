Feature: To Verify Adactin Hotel Login Page

  Scenario Outline: To Verify Adacitin Hotel Webpage Login with Valid Credentials
    Given User should be in Adactin Login Page
    When User should Enter Valid credentials "<userName>" , "<password>"
    And User should Click Login button
    Then User should Verify Login success

    Examples: 
      | userName          |  | password |
      | sandy             |  | seijie   |
      | sandy@24gmail.com |  | 236TQ5   |
      | Sanjay007         |  | 236TQ5   |
      

  Scenario: To Verify Adactin Search Hotel Webpage with Valid Credentials
    And User Should Select Hotel Location
    And User Should Select SearchHotel Details
    And User Should Select Room Type
    And User Should Select Number of Rooms
    And User Should Enter Checkin Date
    And User Should Enter Checkout Date
    And User Should Select Adults Per Room
    And User Should Select Children Per Room
    Then User Should click Search Button
    And User should be in Select Hotel Page
