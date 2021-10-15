Feature: Login fonctionality



  @SmokeTest
  Scenario:Login with valid username and password

    Given Naviget to Opencart
    When Enter username and password and click login button
    Then  User should login successfully