Feature: Edit account

  Background:
    Given Naviget to Opencart
    When Enter username and password and click login button
    Then User should login successfully

    Scenario Outline:

      When Naviget to EditAcoount
      When Edit account name as"<name>" surname as "<surname>" phone as "<phone>"



      Examples:
        | name |surname|phone|
        | mehmet |ekici|1234567890|
