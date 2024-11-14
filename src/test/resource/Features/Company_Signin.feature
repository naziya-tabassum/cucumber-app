Feature: feature to test the functionality of Login in Orange hrm application
  Scenario: User to test the functionality of login with valid credentials
    Given User is on login page
     And  User click on emslogin button
     When User enter Username"admin@pathbreaker.com" and password"Passw0rd!"
     And  User click on login button
     And  Hamburger button is working or not
     Then User can verify the logo should be dipslayed or not after logging
  Scenario Outline: User to test the functionality of login with invalid credentials
    Given User is on login page
    And User click on emslogin button
    When User enter invalid <username> and invalid <password>
    And User click on login button
    Examples:
      | username              | password  |
      |              12345678 |   2345678 |
      | @#$%^&*               | @#$%^&    |
      |                       | DFGHJVC   |
      | DRFYUJHGF             |           |
      |gfhgfhg8765 | 76545hgfg|