Feature: neue adresse erstellen

    Scenario: New Address create
      Given Navigat to Opencart
      When Enter username and password and click login button
      Then  User should login successfully
      When Click address button dann new address create
      Then New address should been create successfully