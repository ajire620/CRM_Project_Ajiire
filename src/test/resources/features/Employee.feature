  @NEXT-1361
  Feature: Employee feature

    As a user ,I should be able to display company structure and telephone directory.

    Background:
      Given User is on the login page

    @hr @NEXT-1358
    Scenario: HR user should be able to display company structure and telephone directory
      When user enters hr username
      And user enters hr password
      And user clicks login button
      And user clicks the employees button
      And user clicks the company structure button
      And user should see the structure of the company
      And user clicks the telephone directory button
      Then user should see the telephone directory


    @helpdesk @NEXT-1359
    Scenario: Helpdesk user should be able to display company structure and telephone directory
      When user enters Helpdesk user username
      And user enters Helpdesk user password
      And user clicks login button
      And user clicks the employees button
      And user clicks the company structure button
      And user should see the structure of the company
      And user clicks the telephone directory button
      Then user should see the telephone directory



    @marketing @NEXT-1360
    Scenario: Marketing user should be able to display company structure and telephone directory
      When user enters Marketing user username
      And user enters Marketing user password
      And user clicks login button
      And user clicks the employees button
      And user clicks the company structure button
      And user should see the structure of the company
      And user clicks the telephone directory button
      Then user should see the telephone directory
