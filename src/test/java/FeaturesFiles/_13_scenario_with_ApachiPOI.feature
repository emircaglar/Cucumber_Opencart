Feature: scenario with ApachiPOI

  Background:
    When Naviget to Opencart
    Then Enter username and password and click login button

    Scenario: with Apachi POI
      Then Select a product with ApachiPOI
