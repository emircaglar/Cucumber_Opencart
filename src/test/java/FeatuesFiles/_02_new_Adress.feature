Feature: neue adresse erstellen

  Scenario:Login with valid username and password

    Given Navigat to Opencart
    When Enter username and password and click login button
    Then  User should login successfully

    Scenario: New Address create
      When Click address button dann new address create
      Then New address should been create successfully