Feature: Scenario Out with create

  Background:
    Given Naviget to Opencart
    When Enter username and password and click login button
    Then User should login successfully

    Scenario Outline: Address create scenario Outline

      When Navigate to Address
      Then Create a address  name as"<Name>" surname as"<Surname>" address as"<Address>"
      Then Delete a address
      Examples:
        | Name |Surname|Address|
        | erkan |erkanoglu|erkanoglu cd 2|
        | demir |demiroglu|demiroglu cd 2|
        | ferit |feritoglu|feritoglu cd 2|