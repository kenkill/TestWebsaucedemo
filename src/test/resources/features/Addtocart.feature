Feature: Verify addtocart successfully
    User can add product to cart and payment successfully

  @Addtocart
Scenario: Verify Addtocart valid
    Given is on Login page
    When user login with username and password
    Then homepage is display
    When addtocart
    And go to your cart
    Then product details will be display correctly
