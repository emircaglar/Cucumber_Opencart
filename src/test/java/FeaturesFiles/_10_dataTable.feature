Feature: DataTable Functionality

  Scenario:
    When Naviget to Opencart
    Then Enter username and password and click login button
    Then User should login successfully

    And Click on the element in the LeftNav
      | adress_book |

    And Click on the element in the DialogContent
      | new_adress |