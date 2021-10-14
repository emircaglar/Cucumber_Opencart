Feature: DataTable Functionality

  Scenario:
    When Naviget to Opencart
    Then Enter username and password and click login button
    Then User should login successfully

    And Click on the element in the LeftNav
      | adress_book |

    And Click on the element in the DialogContent
      | new_adress |

    And Click on the element in the LeftNav
      | edit_account |

    And User sending the keys in the Dialog Content
       |account_first_name|ahmet hamdi|
       |account_last_name|topcu|

    And Click on the element in the DialogContent
      | account_continue |