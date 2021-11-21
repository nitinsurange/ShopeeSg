
 Feature: Mobile App automation assignment


  Background: Shopee SG Assignment

  @ShopeeAssigment 
  Scenario Outline: Automate the Signup flow covering positive scenarios
   Given user lanuch Shopee SG app
   Then user Swipe through all tutorial screens
   Then user taps on Start button
   Given user Allow permission for location if prompted
   Then Dismiss the Add popup on landing screen if present
   Then user Clicks on Shopee Mall button from bottom navbar
   Then Dismiss the Add popup on landing screen if present
   Then user Clicks on Mobile and Gadgets from top header menu
   Then user Clicks on See All for Trending Shops
   Then user swipe up and selects the samsung shop from all trending shops
   Then user gets the last active, statusshop, rating and foloowers
   Then user Taps on Filter  then select Rating  as 4 Stars & Up  Condition as New and Prices Range as Min 500 & Max 2000
   Then user Clicks on Apply filter
   Then user Gets the Max priced product from list and Click on the product
   Then user Swipe left/right on the image preview until the pagination value reaches last page respectively
   Then Get the product rating and shipping fee
   Then Swipe up and Click on Sell All for From the Same Shop Similar Products
   Then get the min & max priced products from list

    

    Examples:
||
||

 