Feature: feature to test the functionality of Company Registration in Ems application

  Background: User to register company functionality
    Given User is on login page
    And User click on emslogin button
    When User enter Username"admin@pathbreaker.com" and password"Passw0rd!"
    And User click on login button

  Scenario Outline: User to register company with valid detail
    # Then User can verify the logo should be dipslayed or not after logging the application
    And user click on employer tab
    And user selects registration option
    Then user selects company type 
    When user enters valid details as "<company name>",  "<service name>", "<company email id>", "<password>", "<contact number>",  "<alternate number>", "<company address>",  "<company cin number>", "<company gst number>", "<company pan number>", "<name>", "<personal email id>", "<personal mobile number>", "<address>"
    And user click on submit button

    Examples: 
      | company name | service name | company email id | password  | contact number | alternate number | company address               | company cin number    | company gst number | company pan number | name  | personal email id | personal mobile number | address                        |
      | Novartis     | nov          | naziya@gmail.com | Path@2024 |     9898989876 |       9898765678 | Hyderabad, hayathnagar 67-987 | L01631KA2010PTC087678 | 22AAQQA0000A1Z1    | BHNBN9098M         | minnu | minnu@gmail.com   |             9809890909 | miryalaguda, ashoknagar 23-987 |
