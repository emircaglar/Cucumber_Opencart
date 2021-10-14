Feature: Scenario outline and datatable

  Scenario Outline:
    When Naviget to Opencart
    Then Enter username and password and click login button
    Then User should login successfully



    And Click on the element in the LeftNav
      | edit_account |

    And User sending the keys in the Dialog Content
      |account_first_name|<Exam name>|
      |account_last_name|<Exam surname>|

    And Click on the element in the DialogContent
      | account_continue |
    Examples:
      |Exam name  |Exam surname|
      |ergin|koknar|
      |taner  |kisa|