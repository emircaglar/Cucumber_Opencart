Feature: Order


  Background:
    Given Naviget to Opencart
    When Enter username and password and click login button

    Scenario Outline:
      When Search a product as "<name>"
      Then Select a product
      Then Product muss in our Wishlist

      Examples:
        |name  |
        |ipod  |