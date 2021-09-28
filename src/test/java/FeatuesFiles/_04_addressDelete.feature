Feature: Delete Address

  Scenario: create und delete
    Given Naviget to Opencart
    When Enter username and password and click login button
    Then User should login successfully
    When Click address button dann new address create name as "<ali>" surname as "<benli>" adress as "<benli cd >"
    Then New address should been create successfully
    Then Delete a address
    Then New address should been create successfully