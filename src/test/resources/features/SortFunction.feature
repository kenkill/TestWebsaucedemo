Feature: Feature To Test Sort Function
  User can sort product successfully

  @sort
  Scenario Outline: check sort product successfully
    Given is on Login page
    When user login with username and password
    Then homepage title is display
    When user choose option "<sort option>"
    Then product list will be display correctly

    Examples:
      |sort option          |
#     |Price (high to low)  |
   |Price (low to high)  |
#      |Name (A to Z)        |
##     |Name (Z to A)        |