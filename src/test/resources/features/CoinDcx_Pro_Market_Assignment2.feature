
 Feature: Mobile App automation assignment
 #b. Market screen: 
#● Click on MARKETS tab without login 
#● Now search for any market under Trade eg: BTC (It will be great if it can be parameterised, whatever market we pass like USDT or any other market) 
#● It will give 6 markets for BTC in results 
#● Now traverse through each market and fetch the details like Volume, price of coin and price in INR, percentage change 
#● Clicking on each market, will take to the detailed market screen and verify the details fetched in point 4 and 5 are not null.


  Background: Coindcx

  @CoinDcxefeff @marketsddvd
  Scenario Outline: Automate the Signup flow covering positive scenarios
    Given user close the banner once app launch 
    Given User navigates to coinDcx signup screen.
    Given user verify the Home Screen of CoinDcx pro
    Then user click on MARKETS Tab without login into the app
    And verify the narket home screen page which consist TRADE, Margin and Future options at header
    Then  Now search for any market under Trade eg BTC: "<parameterised>"
    Then It will give six markets for BTC in results
    Given User Now traverse through each market and fetch the details like Volume, price of coin and price in INR, percentage change
    Then will take to the detailed market screen
    Then User will fetch details for each market and it should not be null value.
    


    

    Examples:
    |parameterised  | LastName  |Email                 |Password  |Country |PhoneNumber|
    |BTC      | Surange   |testnitinhlb@gmail.com|CoinDcx123|India   |9860423571 |

