Feature: Login fonctionality

  Scenario:Login with valid username and password

    Given Navigat to Opencart
    When Enter username and password and click login button
    Then  User should login successfully