Feature: Wish edit

  Background:
    When Naviget to Opencart
    Given Enter username and password and click login button
    Then User should login successfully

    Scenario:
      When Search a product as "ipod"
      Then Add wish list

      When Naviget to Wish List
      Then Wish list delete all