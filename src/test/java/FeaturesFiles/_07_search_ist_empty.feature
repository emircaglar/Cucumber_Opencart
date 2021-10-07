Feature: Search is empty
  Background:
    Given Naviget to Opencart
    When Enter username and password and click login button


    Scenario Outline:
      When Search a product as "<name>"
      Then Search musst been empty

      Examples:
        | name |
        | toyota |
