Feature: Admin function

  Background: User navigate and click admin
    Given User navigate page daskboard
    When User click Admin to visit admin function

  Scenario: Search user by username
    When User enter username in input username
    And User click button search
    Then Verify search user by username successful

  Scenario: Search user by user role
    When User click userRole location
    And User select userRole
    And User click button search
    Then Verify search by userRole successful

  Scenario Outline: : Edit user
    When User enter username in input username <usernameSearch>
    And User click button search
    When User click icon edit
    And User edit userRole
    And User edit userSatus
    And User click button save
    Then Verify edit successful
    Examples: 
      | usernameSearch |
      | slippery_lungfish_silver|
