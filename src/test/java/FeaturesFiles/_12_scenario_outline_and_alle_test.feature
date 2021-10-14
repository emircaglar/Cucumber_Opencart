Feature: Scenario Outline und alle

  Scenario:
    When Naviget to Opencart
    Then Enter username and password and click login button
    Then User should login successfully

    And User sending the keys in the Dialog Content
      |input_search| ipod |

    And Click on the element in the DialogContent
      | button_search |

    And Click on the element in the DialogContent
      | wish_erste_sache |


    And Click on the element in the UpNav
      | wish_list |

    And Click on the element in the DialogContent
      | wish_deleze_erste_sache|