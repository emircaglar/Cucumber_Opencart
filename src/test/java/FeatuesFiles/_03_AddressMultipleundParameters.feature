Feature: Multipleund with parameters

  Background:

    Given Naviget to Opencart
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Address

    When Click address button dann new address create
    Then New address should been create successfully

  Scenario: Create with Parameter

    When Click address button dann new address create name as "ertan" surname as "caloglu" adress as "caloglu cd 1a"
    Then New address should been create successfully